package com.tide.spacex.ui.viewmodel

import com.tide.spacex.network.domain.GetRocketDetailsDomainModel
import com.tide.spacex.network.usecase.RocketDetailsUseCase
import javax.inject.Inject

class RocketDetailsViewModel @Inject constructor(
    private val rocketDetailsUseCase: RocketDetailsUseCase
) : BaseViewModel() {
    private val rocketDetailsData: StateLiveData<List<GetRocketDetailsDomainModel>> = StateLiveData()

    fun getRocketDetails(id: String) {
        rocketDetailsData.postLoading()
        addDisposable(
            rocketDetailsUseCase.getRocketDetails(id)
                .subscribe({
                    rocketDetailsData.postSuccess(it)
                }, {
                    rocketDetailsData.postError(it)
                })
        )
    }

    fun getRocketDetailsViewModelObservable(): StateLiveData<List<GetRocketDetailsDomainModel>> {
        return rocketDetailsData
    }
}