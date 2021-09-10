package com.tide.spacex.ui.viewmodel

import android.content.Context
import android.content.SharedPreferences
import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.tide.spacex.network.domain.GetRocketsDomainModel
import com.tide.spacex.network.repository.RocketsListRepository
import com.tide.spacex.network.usecase.RocketListUseCase
import io.mockk.MockKAnnotations
import io.mockk.every
import io.mockk.impl.annotations.MockK
import io.reactivex.Single
import org.assertj.core.api.Assertions.assertThat
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TestRule

class RocketListViewModelTest {

    @Rule
    @JvmField
    var instantTaskExecutorRule: TestRule = InstantTaskExecutorRule()

    @MockK
    lateinit var rocketListUseCase: RocketListUseCase

    @MockK
    lateinit var sharedPreferences: SharedPreferences

    @MockK
    lateinit var repository: RocketsListRepository

    @MockK
    lateinit var rocketsDomainModel: GetRocketsDomainModel

    @MockK
    lateinit var context: Context

    private lateinit var rocketListViewModel: RocketListViewModel

    @Before
    fun setUp() {
        MockKAnnotations.init(this, relaxed = true)

        rocketListViewModel = RocketListViewModel(
            rocketListUseCase,
            sharedPreferences,
            repository
        )
    }

    @Test
    fun `return data when api is successful`() {

        every { rocketListUseCase.getRocketList() } returns Single.just(listOf(rocketsDomainModel))
        rocketListViewModel.getRocketList()

        val stateData: StateData<List<GetRocketsDomainModel>>? =
            rocketListViewModel.getRocketListViewModelObservable().value

        assertThat(stateData).isNotNull
    }

    @Test
    fun `return throwable when api fails`() {

        every { rocketListUseCase.getRocketList() } returns Single.error(Throwable())
        rocketListViewModel.getRocketList()

        val stateData: StateData<List<GetRocketsDomainModel>>? =
            rocketListViewModel.getRocketListViewModelObservable().value

        assertThat(stateData).isNotNull
    }

    @Test
    fun `return first launch data false if not a first launch`() {

        every { sharedPreferences.getBoolean(FIRST_LAUNCH, true) } returns false
        every { rocketListUseCase.getRocketList() } returns Single.just(listOf(rocketsDomainModel))

        rocketListViewModel.checkIfFirstLaunch(FIRST_LAUNCH)
        val stateData: StateData<Boolean>? =
            rocketListViewModel.getFirstLaunchDataObservable().value
        val stateRocketData: StateData<List<GetRocketsDomainModel>>? =
            rocketListViewModel.getRocketListViewModelObservable().value

        assertThat(stateData).isNull()
        assertThat(stateRocketData).isNotNull
    }

    @Test
    fun `return first launch data true if first launch`() {

        every { sharedPreferences.getBoolean(FIRST_LAUNCH, true) } returns true

        rocketListViewModel.checkIfFirstLaunch(FIRST_LAUNCH)
        val stateData: StateData<Boolean>? =
            rocketListViewModel.getFirstLaunchDataObservable().value

        assertThat(stateData).isNotNull
    }

    @Test
    fun `return only active launch rockets when active filter selected`() {
        every { repository.getListOfRockets } returns TEST_DATA

        rocketListViewModel.filterBasedOnStatus(RocketListViewModel.Status.Active.toString())

        val stateRocketData: StateData<List<GetRocketsDomainModel>>? =
            rocketListViewModel.getRocketListViewModelObservable().value

        assertThat(stateRocketData).isNotNull
        assertThat(stateRocketData?.getData()?.size).isEqualTo(2)
    }

    @Test
    fun `return only inActive launch rockets when inActive filter selected`() {
        every { repository.getListOfRockets } returns TEST_DATA

        rocketListViewModel.filterBasedOnStatus(RocketListViewModel.Status.InActive.toString())

        val stateRocketData: StateData<List<GetRocketsDomainModel>>? =
            rocketListViewModel.getRocketListViewModelObservable().value

        assertThat(stateRocketData).isNotNull
        assertThat(stateRocketData?.getData()?.size).isEqualTo(1)
    }

    @Test
    fun `return all rockets when All filter selected`() {
        every { repository.getListOfRockets } returns TEST_DATA

        rocketListViewModel.filterBasedOnStatus("All")

        val stateRocketData: StateData<List<GetRocketsDomainModel>>? =
            rocketListViewModel.getRocketListViewModelObservable().value

        assertThat(stateRocketData).isNotNull
        assertThat(stateRocketData?.getData()?.size).isEqualTo(3)
    }

    companion object {
        private const val FIRST_LAUNCH = "FIRST_LAUNCH"

        private val TEST_DATA = listOf(
            GetRocketsDomainModel(
                "123",
                "name",
                "country",
                1,
                true,
                "description",
                listOf()
            ),
            GetRocketsDomainModel(
                "123",
                "name",
                "country",
                1,
                true,
                "description",
                listOf()
            ),
            GetRocketsDomainModel(
                "123",
                "name",
                "country",
                1,
                false,
                "description",
                listOf()
            )
        )
    }
}