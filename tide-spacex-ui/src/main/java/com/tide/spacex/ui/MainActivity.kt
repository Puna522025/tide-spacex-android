package com.tide.spacex.ui

import android.os.Bundle
import com.tide.spacex.ui.base.BaseActivity
import com.tide.spacex.ui.fragments.RocketListFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.base_activity)
        loadFragment(RocketListFragment.getInstance(), false)
    }
}