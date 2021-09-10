package com.tide.spacex.ui.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0013B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\n\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0007J\r\u0010\u000b\u001a\u0004\u0018\u00018\u0000\u00a2\u0006\u0002\u0010\fJ\b\u0010\r\u001a\u0004\u0018\u00010\u0007J\b\u0010\u000e\u001a\u0004\u0018\u00010\tJ\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000J\u001b\u0010\u0010\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00002\u0006\u0010\u0011\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u0012R\u0012\u0010\u0004\u001a\u0004\u0018\u00018\u0000X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0005R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/tide/spacex/ui/viewmodel/StateData;", "T", "", "()V", "mData", "Ljava/lang/Object;", "mError", "", "mStatus", "Lcom/tide/spacex/ui/viewmodel/StateData$DataStatus;", "error", "getData", "()Ljava/lang/Object;", "getError", "getStatus", "loading", "success", "data", "(Ljava/lang/Object;)Lcom/tide/spacex/ui/viewmodel/StateData;", "DataStatus", "tide-spacex-ui_debug"})
public final class StateData<T extends java.lang.Object> {
    private com.tide.spacex.ui.viewmodel.StateData.DataStatus mStatus;
    private T mData;
    private java.lang.Throwable mError;
    
    @org.jetbrains.annotations.Nullable()
    public final com.tide.spacex.ui.viewmodel.StateData<T> loading() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.tide.spacex.ui.viewmodel.StateData<T> success(T data) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.tide.spacex.ui.viewmodel.StateData<T> error(@org.jetbrains.annotations.Nullable()
    java.lang.Throwable error) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.tide.spacex.ui.viewmodel.StateData.DataStatus getStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final T getData() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Throwable getError() {
        return null;
    }
    
    public StateData() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/tide/spacex/ui/viewmodel/StateData$DataStatus;", "", "(Ljava/lang/String;I)V", "SUCCESS", "ERROR", "LOADING", "tide-spacex-ui_debug"})
    public static enum DataStatus {
        /*public static final*/ SUCCESS /* = new SUCCESS() */,
        /*public static final*/ ERROR /* = new ERROR() */,
        /*public static final*/ LOADING /* = new LOADING() */;
        
        DataStatus() {
        }
    }
}