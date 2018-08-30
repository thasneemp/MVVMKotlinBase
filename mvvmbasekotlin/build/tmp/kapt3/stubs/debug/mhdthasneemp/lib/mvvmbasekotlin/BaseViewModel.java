package mhdthasneemp.lib.mvvmbasekotlin;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0006\u0010\u000f\u001a\u00020\bJ\r\u0010\u0010\u001a\u0004\u0018\u00018\u0000\u00a2\u0006\u0002\u0010\u0011J\u0006\u0010\u0012\u001a\u00020\fJ\u000e\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0015J\u0010\u0010\u0016\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u000e\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0019J\u0013\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u001cR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\nX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lmhdthasneemp/lib/mvvmbasekotlin/BaseViewModel;", "N", "Landroid/arch/lifecycle/ViewModel;", "Landroid/databinding/Observable;", "()V", "callbacks", "Landroid/databinding/PropertyChangeRegistry;", "mIsLoading", "Landroid/databinding/ObservableBoolean;", "mNavigator", "Ljava/lang/ref/WeakReference;", "addOnPropertyChangedCallback", "", "callback", "Landroid/databinding/Observable$OnPropertyChangedCallback;", "getIsLoading", "getNavigator", "()Ljava/lang/Object;", "notifyChange", "notifyPropertyChanged", "fieldId", "", "removeOnPropertyChangedCallback", "setIsLoading", "isLoading", "", "setNavigator", "navigator", "(Ljava/lang/Object;)V", "mvvmbasekotlin_debug"})
public abstract class BaseViewModel<N extends java.lang.Object> extends android.arch.lifecycle.ViewModel implements android.databinding.Observable {
    private final android.databinding.PropertyChangeRegistry callbacks = null;
    private final android.databinding.ObservableBoolean mIsLoading = null;
    private java.lang.ref.WeakReference<N> mNavigator;
    
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
    
    @java.lang.Override()
    public void addOnPropertyChangedCallback(@org.jetbrains.annotations.NotNull()
    android.databinding.Observable.OnPropertyChangedCallback callback) {
    }
    
    @java.lang.Override()
    public void removeOnPropertyChangedCallback(@org.jetbrains.annotations.NotNull()
    android.databinding.Observable.OnPropertyChangedCallback callback) {
    }
    
    /**
     * * Notifies observers that all properties of this instance have changed.
     */
    public final void notifyChange() {
    }
    
    /**
     * * Notifies observers that a specific property has changed. The getter for the
     *     * property that changes should be marked with the @Bindable annotation to
     *     * generate a field in the BR class to be used as the fieldId parameter.
     *     *
     *     * @param fieldId The generated BR id for the Bindable field.
     */
    public final void notifyPropertyChanged(int fieldId) {
    }
    
    public BaseViewModel() {
        super();
    }
}