package com.tide.spacex.ui.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0018B5\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t\u00a2\u0006\u0002\u0010\fJ\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0012J\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000e0\tJ\u0006\u0010\u0016\u001a\u00020\u0010J\u0012\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\tR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/tide/spacex/ui/viewmodel/RocketListViewModel;", "Lcom/tide/spacex/ui/viewmodel/BaseViewModel;", "rocketListUseCase", "Lcom/tide/spacex/network/usecase/RocketListUseCase;", "sharedPreferences", "Landroid/content/SharedPreferences;", "repository", "Lcom/tide/spacex/network/repository/RocketsListRepository;", "rocketListData", "Lcom/tide/spacex/ui/viewmodel/StateLiveData;", "", "Lcom/tide/spacex/network/domain/GetRocketsDomainModel;", "(Lcom/tide/spacex/network/usecase/RocketListUseCase;Landroid/content/SharedPreferences;Lcom/tide/spacex/network/repository/RocketsListRepository;Lcom/tide/spacex/ui/viewmodel/StateLiveData;)V", "showFirstLaunchData", "", "checkIfFirstLaunch", "", "keyValue", "", "filterBasedOnStatus", "status", "getFirstLaunchDataObservable", "getRocketList", "getRocketListViewModelObservable", "Status", "tide-spacex-ui_debug"})
public final class RocketListViewModel extends com.tide.spacex.ui.viewmodel.BaseViewModel {
    private final com.tide.spacex.ui.viewmodel.StateLiveData<java.lang.Boolean> showFirstLaunchData = null;
    private final com.tide.spacex.network.usecase.RocketListUseCase rocketListUseCase = null;
    private final android.content.SharedPreferences sharedPreferences = null;
    private final com.tide.spacex.network.repository.RocketsListRepository repository = null;
    private final com.tide.spacex.ui.viewmodel.StateLiveData<java.util.List<com.tide.spacex.network.domain.GetRocketsDomainModel>> rocketListData = null;
    
    public final void getRocketList() {
    }
    
    public final void checkIfFirstLaunch(@org.jetbrains.annotations.NotNull()
    java.lang.String keyValue) {
    }
    
    public final void filterBasedOnStatus(@org.jetbrains.annotations.NotNull()
    java.lang.String status) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.tide.spacex.ui.viewmodel.StateLiveData<java.util.List<com.tide.spacex.network.domain.GetRocketsDomainModel>> getRocketListViewModelObservable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.tide.spacex.ui.viewmodel.StateLiveData<java.lang.Boolean> getFirstLaunchDataObservable() {
        return null;
    }
    
    @javax.inject.Inject()
    public RocketListViewModel(@org.jetbrains.annotations.NotNull()
    com.tide.spacex.network.usecase.RocketListUseCase rocketListUseCase, @org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences sharedPreferences, @org.jetbrains.annotations.NotNull()
    com.tide.spacex.network.repository.RocketsListRepository repository, @org.jetbrains.annotations.NotNull()
    com.tide.spacex.ui.viewmodel.StateLiveData<java.util.List<com.tide.spacex.network.domain.GetRocketsDomainModel>> rocketListData) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/tide/spacex/ui/viewmodel/RocketListViewModel$Status;", "", "(Ljava/lang/String;I)V", "Active", "InActive", "tide-spacex-ui_debug"})
    public static enum Status {
        /*public static final*/ Active /* = new Active() */,
        /*public static final*/ InActive /* = new InActive() */;
        
        Status() {
        }
    }
}