package com.tide.spacex.ui.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J&\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J*\u0010\u001d\u001a\u00020\u00122\b\b\u0001\u0010\u0017\u001a\u00020\u00182\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u001cH&J\b\u0010\u001e\u001a\u00020\u0012H\u0016R\u001e\u0010\u0005\u001a\u0004\u0018\u00018\u0000X\u0084\u000e\u00a2\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u001f"}, d2 = {"Lcom/tide/spacex/ui/base/BaseFragment;", "T", "Landroidx/viewbinding/ViewBinding;", "Landroidx/fragment/app/Fragment;", "()V", "binding", "getBinding", "()Landroidx/viewbinding/ViewBinding;", "setBinding", "(Landroidx/viewbinding/ViewBinding;)V", "Landroidx/viewbinding/ViewBinding;", "navigationHandler", "Lcom/tide/spacex/ui/base/NavigationHandler;", "getNavigationHandler", "()Lcom/tide/spacex/ui/base/NavigationHandler;", "setNavigationHandler", "(Lcom/tide/spacex/ui/base/NavigationHandler;)V", "onAttach", "", "context", "Landroid/content/Context;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onCreateViewBinding", "onDestroy", "tide-spacex-ui_debug"})
public abstract class BaseFragment<T extends androidx.viewbinding.ViewBinding> extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.Nullable()
    private T binding;
    @org.jetbrains.annotations.Nullable()
    private com.tide.spacex.ui.base.NavigationHandler navigationHandler;
    
    @org.jetbrains.annotations.Nullable()
    protected final T getBinding() {
        return null;
    }
    
    protected final void setBinding(@org.jetbrains.annotations.Nullable()
    T p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.tide.spacex.ui.base.NavigationHandler getNavigationHandler() {
        return null;
    }
    
    public final void setNavigationHandler(@org.jetbrains.annotations.Nullable()
    com.tide.spacex.ui.base.NavigationHandler p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public abstract void onCreateViewBinding(@org.jetbrains.annotations.NotNull()
    @androidx.annotation.NonNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    @androidx.annotation.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    @androidx.annotation.Nullable()
    android.os.Bundle savedInstanceState);
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    public BaseFragment() {
        super();
    }
}