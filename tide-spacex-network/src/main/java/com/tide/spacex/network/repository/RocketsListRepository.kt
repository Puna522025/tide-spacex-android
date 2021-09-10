package com.tide.spacex.network.repository

import com.tide.spacex.network.domain.GetRocketsDomainModel
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class RocketsListRepository @Inject constructor() {

    private var listOfRockets = listOf<GetRocketsDomainModel>()

    fun setListOfRockets(rockets: List<GetRocketsDomainModel>) {
        listOfRockets = rockets
    }

    val getListOfRockets: List<GetRocketsDomainModel>
        get() = listOfRockets
}