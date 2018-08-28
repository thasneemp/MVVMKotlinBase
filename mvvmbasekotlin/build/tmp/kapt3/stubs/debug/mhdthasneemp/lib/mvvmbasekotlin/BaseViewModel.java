package mhdthasneemp.lib.mvvmbasekotlin;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0006\u0010\b\u001a\u00020\u0005J\r\u0010\t\u001a\u0004\u0018\u00018\u0000\u00a2\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u00020\fH\u0014J\u000e\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0013\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lmhdthasneemp/lib/mvvmbasekotlin/BaseViewModel;", "N", "Landroid/arch/lifecycle/ViewModel;", "()V", "mIsLoading", "Landroid/databinding/ObservableBoolean;", "mNavigator", "Ljava/lang/ref/WeakReference;", "getIsLoading", "getNavigator", "()Ljava/lang/Object;", "onCleared", "", "setIsLoading", "isLoading", "", "setNavigator", "navigator", "(Ljava/lang/Object;)V", "mvvmbasekotlin_debug"})
public abstract class BaseViewModel<N extends java.lang.Object> extends android.arch.lifecycle.ViewModel {
    private final android.databinding.ObservableBoolean mIsLoading = null;
    private java.lang.ref.WeakReference<N> mNavigator;
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.databinding.ObservableBoolean getIsLoading() {
        return null;
    }
    
    public final void setIsLoading(boolean isLoading) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final N getNavigator() {
        return null;
    }
    
    public final void setNavigator(N navigator) {
    }
    
    public BaseViewModel() {
        super();
    }
}