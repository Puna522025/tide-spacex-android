// Generated by Dagger (https://dagger.dev).
package com.tide.spacex.ui.viewmodel;

import android.content.SharedPreferences;
import com.tide.spacex.network.domain.GetRocketsDomainModel;
import com.tide.spacex.network.repository.RocketsListRepository;
import com.tide.spacex.network.usecase.RocketListUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import java.util.List;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class RocketListViewModel_Factory implements Factory<RocketListViewModel> {
  private final Provider<RocketListUseCase> rocketListUseCaseProvider;

  private final Provider<SharedPreferences> sharedPreferencesProvider;

  private final Provider<RocketsListRepository> repositoryProvider;

  private final Provider<StateLiveData<List<GetRocketsDomainModel>>> rocketListDataProvider;

  public RocketListViewModel_Factory(Provider<RocketListUseCase> rocketListUseCaseProvider,
      Provider<SharedPreferences> sharedPreferencesProvider,
      Provider<RocketsListRepository> repositoryProvider,
      Provider<StateLiveData<List<GetRocketsDomainModel>>> rocketListDataProvider) {
    this.rocketListUseCaseProvider = rocketListUseCaseProvider;
    this.sharedPreferencesProvider = sharedPreferencesProvider;
    this.repositoryProvider = repositoryProvider;
    this.rocketListDataProvider = rocketListDataProvider;
  }

  @Override
  public RocketListViewModel get() {
    return newInstance(rocketListUseCaseProvider.get(), sharedPreferencesProvider.get(), repositoryProvider.get(), rocketListDataProvider.get());
  }

  public static RocketListViewModel_Factory create(
      Provider<RocketListUseCase> rocketListUseCaseProvider,
      Provider<SharedPreferences> sharedPreferencesProvider,
      Provider<RocketsListRepository> repositoryProvider,
      Provider<StateLiveData<List<GetRocketsDomainModel>>> rocketListDataProvider) {
    return new RocketListViewModel_Factory(rocketListUseCaseProvider, sharedPreferencesProvider, repositoryProvider, rocketListDataProvider);
  }

  public static RocketListViewModel newInstance(RocketListUseCase rocketListUseCase,
      SharedPreferences sharedPreferences, RocketsListRepository repository,
      StateLiveData<List<GetRocketsDomainModel>> rocketListData) {
    return new RocketListViewModel(rocketListUseCase, sharedPreferences, repository, rocketListData);
  }
}
