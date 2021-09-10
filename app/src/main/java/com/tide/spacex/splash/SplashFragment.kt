package com.tide.spacex.splash

import android.animation.Animator
import android.animation.AnimatorListenerAdapter
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.tide.spacex.databinding.SplashFragmentBinding
import com.tide.spacex.ui.MainActivity
import com.tide.spacex.ui.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SplashFragment : BaseFragment<SplashFragmentBinding>() {

    override fun onCreateViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ) {
        binding = SplashFragmentBinding.inflate(inflater, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        animateIntro()
    }

    private fun animateIntro() {
        view?.let {
            it.animate()
                .alpha(1f)
                .setDuration(2000)
                .setListener(object : AnimatorListenerAdapter() {
                    override fun onAnimationEnd(animation: Animator) {
                        launchModule()
                    }
                })
        }
    }

    private fun launchModule() {
        val intent = Intent(activity, MainActivity::class.java)
        startActivity(intent)
        activity?.finish()
    }

    companion object {
        fun getInstance(): SplashFragment {
            return SplashFragment()
        }
    }
}