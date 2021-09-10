package com.tide.spacex.ui.injection;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J \u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007\u00a8\u0006\r"}, d2 = {"Lcom/tide/spacex/ui/injection/ViewModuleInjects;", "", "()V", "rocketDetailsViewModel", "Landroidx/lifecycle/ViewModel;", "rocketListUseCase", "Lcom/tide/spacex/network/usecase/RocketDetailsUseCase;", "rocketListViewModel", "Lcom/tide/spacex/network/usecase/RocketListUseCase;", "sharedPreferences", "Landroid/content/SharedPreferences;", "repository", "Lcom/tide/spacex/network/repository/RocketsListRepository;", "tide-spacex-ui_debug"})
@dagger.Module()
public final class ViewModuleInjects {
    @org.jetbrains.annotations.NotNull()
    public static final com.tide.spacex.ui.injection.ViewModuleInjects INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    @ViewModelKey(value = com.tide.spacex.ui.viewmodel.RocketListViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Provides()
    public final androidx.lifecycle.ViewModel rocketListViewModel(@org.jetbrains.annotations.NotNull()
    com.tide.spacex.network.usecase.RocketListUseCase rocketListUseCase, @org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences sharedPreferences, @org.jetbrains.annotations.NotNull()
    com.tide.spacex.network.repository.RocketsListRepository repository) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @ViewModelKey(value = com.tide.spacex.ui.viewmodel.RocketDetailsViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Provides()
    public final androidx.lifecycle.ViewModel rocketDetailsViewModel(@org.jetbrains.annotations.NotNull()
    com.tide.spacex.network.usecase.RocketDetailsUseCase rocketListUseCase) {
        return null;
    }
    
    private ViewModuleInjects() {
        super();
    }
}