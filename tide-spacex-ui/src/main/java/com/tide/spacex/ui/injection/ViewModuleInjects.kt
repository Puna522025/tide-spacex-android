package com.tide.spacex.ui.injection

import android.content.SharedPreferences
import androidx.lifecycle.ViewModel
import com.tide.spacex.network.repository.RocketsListRepository
import com.tide.spacex.network.usecase.RocketDetailsUseCase
import com.tide.spacex.network.usecase.RocketListUseCase
import com.tide.spacex.ui.viewmodel.RocketDetailsViewModel
import com.tide.spacex.ui.viewmodel.RocketListViewModel
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dagger.multibindings.IntoMap

@InstallIn(SingletonComponent::class)
@Module
object ViewModuleInjects {

    @Provides
    @IntoMap
    @ViewModelKey(RocketListViewModel::class)
    fun rocketListViewModel(
        rocketListUseCase: RocketListUseCase,
        sharedPreferences: SharedPreferences,
        repository: RocketsListRepository
    ): ViewModel {
        return RocketListViewModel(rocketListUseCase, sharedPreferences, repository)
    }

    @Provides
    @IntoMap
    @ViewModelKey(RocketDetailsViewModel::class)
    fun rocketDetailsViewModel(
        rocketListUseCase: RocketDetailsUseCase
    ): ViewModel {
        return RocketDetailsViewModel(rocketListUseCase)
    }
}