package mhdthasneemp.lib.mvvmbasekotlin;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0010\u0010\t\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u0004J\u0006\u0010\n\u001a\u00020\u0006J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0016J\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0006H\u0016J\u0018\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u0018\u0010\u0003\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lmhdthasneemp/lib/mvvmbasekotlin/BaseDialog;", "Landroid/support/v4/app/DialogFragment;", "()V", "mActivity", "Lmhdthasneemp/lib/mvvmbasekotlin/BaseActivity;", "dismissDialog", "", "tag", "", "getBaseActivity", "hideKeyboard", "onAttach", "context", "Landroid/content/Context;", "onCreateDialog", "Landroid/app/Dialog;", "savedInstanceState", "Landroid/os/Bundle;", "onDetach", "show", "fragmentManager", "Landroid/support/v4/app/FragmentManager;", "mvvmbasekotlin_debug"})
public abstract class BaseDialog extends android.support.v4.app.DialogFragment {
    private mhdthasneemp.lib.mvvmbasekotlin.BaseActivity<?, ?> mActivity;
    
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.app.Dialog onCreateDialog(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onDetach() {
    }
    
    @java.lang.Override()
    public void show(@org.jetbrains.annotations.NotNull()
    android.support.v4.app.FragmentManager fragmentManager, @org.jetbrains.annotations.NotNull()
    java.lang.String tag) {
    }
    
    public final void dismissDialog(@org.jetbrains.annotations.NotNull()
    java.lang.String tag) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final mhdthasneemp.lib.mvvmbasekotlin.BaseActivity<?, ?> getBaseActivity() {
        return null;
    }
    
    public final void hideKeyboard() {
    }
    
    public BaseDialog() {
        super();
    }
}