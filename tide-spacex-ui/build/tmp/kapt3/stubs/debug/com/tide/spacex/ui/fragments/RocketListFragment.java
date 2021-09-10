package com.tide.spacex.ui.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 12\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00011B\u0005\u00a2\u0006\u0002\u0010\u0004J$\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u001a\u0010 \u001a\u00020\u00162\u0006\u0010!\u001a\u00020\"2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u0016\u0010#\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020&\u0018\u00010%0$H\u0002J1\u0010\'\u001a+\u0012!\u0012\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0)\u0018\u00010%\u00a2\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(,\u0012\u0004\u0012\u00020\u00160(H\u0002J\u001c\u0010-\u001a\u00020\u00162\u0012\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0)0%H\u0002J\b\u0010/\u001a\u00020\u0016H\u0002J\b\u00100\u001a\u00020\u0016H\u0002R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u00062"}, d2 = {"Lcom/tide/spacex/ui/fragments/RocketListFragment;", "Lcom/tide/spacex/ui/base/BaseFragment;", "Lcom/tide/spacex/ui/databinding/RocketsListFragmentBinding;", "Lcom/tide/spacex/ui/adapter/OnRocketClickListener;", "()V", "customViewModelFactory", "Lcom/tide/spacex/ui/injection/CustomViewModelFactory;", "getCustomViewModelFactory", "()Lcom/tide/spacex/ui/injection/CustomViewModelFactory;", "setCustomViewModelFactory", "(Lcom/tide/spacex/ui/injection/CustomViewModelFactory;)V", "rocketListViewModel", "Lcom/tide/spacex/ui/viewmodel/RocketListViewModel;", "rocketsListAdapter", "Lcom/tide/spacex/ui/adapter/RocketsListAdapter;", "sharedPreferences", "Landroid/content/SharedPreferences;", "getSharedPreferences", "()Landroid/content/SharedPreferences;", "setSharedPreferences", "(Landroid/content/SharedPreferences;)V", "onCreateViewBinding", "", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onRocketClick", "model", "Lcom/tide/spacex/network/domain/GetRocketsDomainModel;", "onViewCreated", "view", "Landroid/view/View;", "processFirstLaunchData", "Landroidx/lifecycle/Observer;", "Lcom/tide/spacex/ui/viewmodel/StateData;", "", "processListData", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "t", "setAdapter", "stateData", "setSpinnerDetails", "showAlertDialog", "Companion", "tide-spacex-ui_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class RocketListFragment extends com.tide.spacex.ui.base.BaseFragment<com.tide.spacex.ui.databinding.RocketsListFragmentBinding> implements com.tide.spacex.ui.adapter.OnRocketClickListener {
    @javax.inject.Inject()
    public com.tide.spacex.ui.injection.CustomViewModelFactory customViewModelFactory;
    @javax.inject.Inject()
    public android.content.SharedPreferences sharedPreferences;
    private com.tide.spacex.ui.viewmodel.RocketListViewModel rocketListViewModel;
    private final com.tide.spacex.ui.adapter.RocketsListAdapter rocketsListAdapter = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.tide.spacex.ui.fragments.RocketListFragment.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.tide.spacex.ui.injection.CustomViewModelFactory getCustomViewModelFactory() {
        return null;
    }
    
    public final void setCustomViewModelFactory(@org.jetbrains.annotations.NotNull()
    com.tide.spacex.ui.injection.CustomViewModelFactory p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.SharedPreferences getSharedPreferences() {
        return null;
    }
    
    public final void setSharedPreferences(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences p0) {
    }
    
    @java.lang.Override()
    public void onCreateViewBinding(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setSpinnerDetails() {
    }
    
    private final kotlin.jvm.functions.Function1<com.tide.spacex.ui.viewmodel.StateData<java.util.List<com.tide.spacex.network.domain.GetRocketsDomainModel>>, kotlin.Unit> processListData() {
        return null;
    }
    
    private final void setAdapter(com.tide.spacex.ui.viewmodel.StateData<java.util.List<com.tide.spacex.network.domain.GetRocketsDomainModel>> stateData) {
    }
    
    @java.lang.Override()
    public void onRocketClick(@org.jetbrains.annotations.NotNull()
    com.tide.spacex.network.domain.GetRocketsDomainModel model) {
    }
    
    private final void showAlertDialog() {
    }
    
    private final androidx.lifecycle.Observer<com.tide.spacex.ui.viewmodel.StateData<java.lang.Boolean>> processFirstLaunchData() {
        return null;
    }
    
    public RocketListFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/tide/spacex/ui/fragments/RocketListFragment$Companion;", "", "()V", "getInstance", "Lcom/tide/spacex/ui/fragments/RocketListFragment;", "tide-spacex-ui_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.tide.spacex.ui.fragments.RocketListFragment getInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}