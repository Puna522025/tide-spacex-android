package com.tide.spacex.ui.fragments

import android.content.SharedPreferences
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.appcompat.app.AlertDialog
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.DividerItemDecoration
import com.tide.spacex.network.domain.GetRocketsDomainModel
import com.tide.spacex.ui.R
import com.tide.spacex.ui.adapter.OnRocketClickListener
import com.tide.spacex.ui.adapter.RocketsListAdapter
import com.tide.spacex.ui.base.BaseFragment
import com.tide.spacex.ui.databinding.RocketsListFragmentBinding
import com.tide.spacex.ui.injection.CustomViewModelFactory
import com.tide.spacex.ui.viewmodel.RocketListViewModel
import com.tide.spacex.ui.viewmodel.StateData
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class RocketListFragment : BaseFragment<RocketsListFragmentBinding>(), OnRocketClickListener {

    @Inject
    lateinit var customViewModelFactory: CustomViewModelFactory

    @Inject
    lateinit var sharedPreferences: SharedPreferences

    private lateinit var rocketListViewModel: RocketListViewModel

    private val rocketsListAdapter: RocketsListAdapter = RocketsListAdapter(this)

    override fun onCreateViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ) {
        binding = RocketsListFragmentBinding.inflate(inflater, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        rocketListViewModel = ViewModelProviders
            .of(this, customViewModelFactory).get(RocketListViewModel::class.java)

        rocketListViewModel.getRocketListViewModelObservable().observe(
            viewLifecycleOwner, processListData()
        )
        rocketListViewModel.getFirstLaunchDataObservable().observe(
            viewLifecycleOwner, processFirstLaunchData()
        )

        binding?.recyclerView?.apply {
            adapter = rocketsListAdapter
            addItemDecoration(DividerItemDecoration(this.context, DividerItemDecoration.VERTICAL))
        }
        setSpinnerDetails()
        rocketListViewModel.checkIfFirstLaunch(getString(R.string.key_first_launch))

        binding?.refresh?.setOnClickListener {
            rocketListViewModel.getRocketList()
        }
    }

    private fun setSpinnerDetails() {
        val status = resources.getStringArray(R.array.rocket_status)
        val adapter = ArrayAdapter(
            requireContext(),
            android.R.layout.simple_spinner_dropdown_item, status
        )
        binding?.apply {
            spinner.adapter = adapter
            spinner.setSelection(0, false)
            spinner.onItemSelectedListener = object :
                AdapterView.OnItemSelectedListener {
                override fun onItemSelected(
                    parent: AdapterView<*>?,
                    view: View?, position: Int, id: Long
                ) {
                    rocketListViewModel.filterBasedOnStatus(status[position])
                }

                override fun onNothingSelected(parent: AdapterView<*>) {
                }
            }
        }
    }

    private fun processListData(): (t: StateData<List<GetRocketsDomainModel>>?) -> Unit = {
        if (it != null) {
            when (it.getStatus()) {
                StateData.DataStatus.LOADING -> {
                    binding?.progressbar?.visibility = View.VISIBLE
                }
                StateData.DataStatus.SUCCESS -> {
                    binding?.apply {
                        progressbar.visibility = View.GONE
                        errorText.visibility = View.GONE
                    }
                    setAdapter(it)
                }
                StateData.DataStatus.ERROR -> {
                    binding?.apply {
                        progressbar.visibility = View.GONE
                        errorText.visibility = View.VISIBLE
                        errorText.text = getString(R.string.error_failure)
                    }
                }
                else -> {
                    binding?.apply {
                        progressbar.visibility = View.GONE
                        errorText.visibility = View.VISIBLE
                        errorText.text = getString(R.string.error_failure_unknown)
                    }
                }
            }
        }
    }

    private fun setAdapter(stateData: StateData<List<GetRocketsDomainModel>>) {
        rocketsListAdapter.setData(stateData.getData())
    }

    override fun onRocketClick(model: GetRocketsDomainModel) {
        navigationHandler?.loadFragment(RocketDetailsFragment.getInstance(model), true)
    }

    private fun showAlertDialog() {
        val alertDialog = AlertDialog.Builder(requireContext(), R.style.AlertDialogStyle)
            .setTitle(R.string.dialog_title)
            .setMessage(R.string.dialog_message)
            .setIcon(android.R.drawable.ic_dialog_info)
            .setPositiveButton(R.string.positive_button_text) { dialogInterface, which ->
                rocketListViewModel.getRocketList()
            }.create()
        alertDialog.setCancelable(false)
        alertDialog.show()
    }

    private fun processFirstLaunchData(): Observer<StateData<Boolean>?> =
        Observer {
            when (it?.getStatus()) {
                StateData.DataStatus.SUCCESS -> {
                    showAlertDialog()
                }
                else -> {
                    // DO Nothing
                }
            }
        }

    companion object {
        fun getInstance(): RocketListFragment {
            return RocketListFragment()
        }
    }
}