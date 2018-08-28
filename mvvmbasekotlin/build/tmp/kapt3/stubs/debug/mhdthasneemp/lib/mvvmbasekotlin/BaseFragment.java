package mhdthasneemp.lib.mvvmbasekotlin;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\f\b\u0001\u0010\u0003*\u0006\u0012\u0002\b\u00030\u00042\u00020\u0005:\u0001\'B\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u000f\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\bJ\b\u0010\u0010\u001a\u00020\u0011H&J\b\u0010\u0012\u001a\u00020\u0011H\'J\r\u0010\u0013\u001a\u0004\u0018\u00018\u0000\u00a2\u0006\u0002\u0010\u0014J\r\u0010\u0015\u001a\u00028\u0001H&\u00a2\u0006\u0002\u0010\u0016J\u0006\u0010\u0017\u001a\u00020\u0018J\u0010\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0014\u0010\u001c\u001a\u00020\u00182\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J&\u0010\u001f\u001a\u0004\u0018\u00010\n2\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\b\u0010$\u001a\u00020\u0018H\u0016J\u001a\u0010%\u001a\u00020\u00182\u0006\u0010&\u001a\u00020\n2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016R\u0018\u0010\u0007\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u0004\u0018\u00018\u0000X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\fR\u0012\u0010\r\u001a\u0004\u0018\u00018\u0001X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u000e\u00a8\u0006("}, d2 = {"Lmhdthasneemp/lib/mvvmbasekotlin/BaseFragment;", "T", "Landroid/databinding/ViewDataBinding;", "V", "Lmhdthasneemp/lib/mvvmbasekotlin/BaseViewModel;", "Landroid/support/v4/app/Fragment;", "()V", "mActivity", "Lmhdthasneemp/lib/mvvmbasekotlin/BaseActivity;", "mRootView", "Landroid/view/View;", "mViewDataBinding", "Landroid/databinding/ViewDataBinding;", "mViewModel", "Lmhdthasneemp/lib/mvvmbasekotlin/BaseViewModel;", "getBaseActivity", "getBindingVariable", "", "getLayoutId", "getViewDataBinding", "()Landroid/databinding/ViewDataBinding;", "getViewModel", "()Lmhdthasneemp/lib/mvvmbasekotlin/BaseViewModel;", "hideKeyboard", "", "onAttach", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDetach", "onViewCreated", "view", "Callback", "mvvmbasekotlin_debug"})
public abstract class BaseFragment<T extends android.databinding.ViewDataBinding, V extends mhdthasneemp.lib.mvvmbasekotlin.BaseViewModel<?>> extends android.support.v4.app.Fragment {
    private mhdthasneemp.lib.mvvmbasekotlin.BaseActivity<?, ?> mActivity;
    private android.view.View mRootView;
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
    public void onAttach(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    @android.support.annotation.Nullable()
    android.os.Bundle savedInstanceState) {
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
    public void onDetach() {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final mhdthasneemp.lib.mvvmbasekotlin.BaseActivity<?, ?> getBaseActivity() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final T getViewDataBinding() {
        return null;
    }
    
    public final void hideKeyboard() {
    }
    
    public BaseFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\u0007"}, d2 = {"Lmhdthasneemp/lib/mvvmbasekotlin/BaseFragment$Callback;", "", "onFragmentAttached", "", "onFragmentDetached", "tag", "", "mvvmbasekotlin_debug"})
    public static abstract interface Callback {
        
        public abstract void onFragmentAttached();
        
        public abstract void onFragmentDetached(@org.jetbrains.annotations.NotNull()
        java.lang.String tag);
    }
}