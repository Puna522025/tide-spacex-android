package com.tide.spacex.ui.viewmodel

import android.content.SharedPreferences
import com.tide.spacex.network.domain.GetRocketsDomainModel
import com.tide.spacex.network.repository.RocketsListRepository
import com.tide.spacex.network.usecase.RocketListUseCase
import javax.inject.Inject

class RocketListViewModel @Inject constructor(
    private val rocketListUseCase: RocketListUseCase,
    private val sharedPreferences: SharedPreferences,
    private val repository: RocketsListRepository,
    private val rocketListData: StateLiveData<List<GetRocketsDomainModel>> = StateLiveData()
) : BaseViewModel() {

    private val showFirstLaunchData: StateLiveData<Boolean> = StateLiveData()

    fun getRocketList() {
        rocketListData.postLoading()
        addDisposable(
            rocketListUseCase.getRocketList()
                .subscribe({
                    repository.setListOfRockets(it)
                    rocketListData.postSuccess(it)
                }, {
                    rocketListData.postError(it)
                })
        )
    }

    fun checkIfFirstLaunch(keyValue: String) {
        if (!sharedPreferences.getBoolean(keyValue, true)) {
            getRocketList()
        } else {
            val editor = sharedPreferences.edit()
            editor.putBoolean(keyValue, false)
            editor.apply()
            showFirstLaunchData.postSuccess(true)
        }
    }

    fun filterBasedOnStatus(status: String) {
        when (status) {
            Status.Active.toString() -> {
                rocketListData.postSuccess(repository.getListOfRockets.filter {
                    it.active
                })
            }
            Status.InActive.toString() -> {
                rocketListData.postSuccess(repository.getListOfRockets.filter {
                    !it.active
                })
            }
            else -> {
                rocketListData.postSuccess(repository.getListOfRockets)
            }
        }

    }

    fun getRocketListViewModelObservable(): StateLiveData<List<GetRocketsDomainModel>> {
        return rocketListData
    }

    fun getFirstLaunchDataObservable(): StateLiveData<Boolean> {
        return showFirstLaunchData
    }

    enum class Status {
        Active, InActive
    }
}