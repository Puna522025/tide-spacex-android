package com.tide.spacex.ui.base

import androidx.fragment.app.Fragment

interface NavigationHandler {

    fun loadFragment(fragment: Fragment, isAddToBackStack: Boolean)
}
