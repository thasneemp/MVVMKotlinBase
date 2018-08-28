package mhdthasneemp.lib.mvvmbasekotlin;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\f\b\u0001\u0010\u0003*\u0006\u0012\u0002\b\u00030\u00042\u00020\u00052\u00020\u0006B\u0005\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0014J\b\u0010\u0010\u001a\u00020\u0011H&J\b\u0010\u0012\u001a\u00020\u0011H\'J\r\u0010\u0013\u001a\u0004\u0018\u00018\u0000\u00a2\u0006\u0002\u0010\u0014J\r\u0010\u0015\u001a\u00028\u0001H&\u00a2\u0006\u0002\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0007J\u0006\u0010\u001b\u001a\u00020\rJ\u0014\u0010\u001c\u001a\u00020\r2\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0014J\b\u0010\u001f\u001a\u00020\rH\u0016J\u0010\u0010 \u001a\u00020\r2\u0006\u0010!\u001a\u00020\u001aH\u0016J\b\u0010\"\u001a\u00020\rH\u0002J#\u0010#\u001a\u00020\r2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001a0%2\u0006\u0010&\u001a\u00020\u0011H\u0007\u00a2\u0006\u0002\u0010\'R\u0012\u0010\b\u001a\u0004\u0018\u00018\u0000X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\tR\u0012\u0010\n\u001a\u0004\u0018\u00018\u0001X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u000b\u00a8\u0006("}, d2 = {"Lmhdthasneemp/lib/mvvmbasekotlin/BaseActivity;", "T", "Landroid/databinding/ViewDataBinding;", "V", "Lmhdthasneemp/lib/mvvmbasekotlin/BaseViewModel;", "Lmhdthasneemp/lib/mvvmbasekotlin/Container;", "Lmhdthasneemp/lib/mvvmbasekotlin/BaseFragment$Callback;", "()V", "mViewDataBinding", "Landroid/databinding/ViewDataBinding;", "mViewModel", "Lmhdthasneemp/lib/mvvmbasekotlin/BaseViewModel;", "attachBaseContext", "", "newBase", "Landroid/content/Context;", "getBindingVariable", "", "getLayoutId", "getViewDataBinding", "()Landroid/databinding/ViewDataBinding;", "getViewModel", "()Lmhdthasneemp/lib/mvvmbasekotlin/BaseViewModel;", "hasPermission", "", "permission", "", "hideKeyboard", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onFragmentAttached", "onFragmentDetached", "tag", "performDataBinding", "requestPermissionsSafely", "permissions", "", "requestCode", "([Ljava/lang/String;I)V", "mvvmbasekotlin_debug"})
public abstract class BaseActivity<T extends android.databinding.ViewDataBinding, V extends mhdthasneemp.lib.mvvmbasekotlin.BaseViewModel<?>> extends mhdthasneemp.lib.mvvmbasekotlin.Container implements mhdthasneemp.lib.mvvmbasekotlin.BaseFragment.Callback {
    private T mViewDataBinding;
    private V mViewModel;
    
    /**
     * * Override for set binding variable
     *     *
     *     * @return variable id
     */
    public abstract int getBindingVariable();
    
    /**
     * * @return layout resource id
     */
    @android.support.annotation.LayoutRes()
    public abstract int getLayoutId();
    
    /**
     * * Override for set view model
     *     *
     *     * @return view model instance
     */
    @org.jetbrains.annotations.NotNull()
    public abstract V getViewModel();
    
    @java.lang.Override()
    public void onFragmentAttached() {
    }
    
    @java.lang.Override()
    public void onFragmentDetached(@org.jetbrains.annotations.NotNull()
    java.lang.String tag) {
    }
    
    @java.lang.Override()
    protected void attachBaseContext(@org.jetbrains.annotations.NotNull()
    android.content.Context newBase) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    @android.support.annotation.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final T getViewDataBinding() {
        return null;
    }
    
    @android.annotation.TargetApi(value = android.os.Build.VERSION_CODES.M)
    public final boolean hasPermission(@org.jetbrains.annotations.NotNull()
    java.lang.String permission) {
        return false;
    }
    
    public final void hideKeyboard() {
    }
    
    @android.annotation.TargetApi(value = android.os.Build.VERSION_CODES.M)
    public final void requestPermissionsSafely(@org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, int requestCode) {
    }
    
    private final void performDataBinding() {
    }
    
    public BaseActivity() {
        super();
    }
}