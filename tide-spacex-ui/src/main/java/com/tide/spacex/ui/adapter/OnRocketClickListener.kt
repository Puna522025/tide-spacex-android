package com.tide.spacex.ui.adapter

import com.tide.spacex.network.domain.GetRocketsDomainModel

interface OnRocketClickListener {
    fun onRocketClick(model: GetRocketsDomainModel)
}