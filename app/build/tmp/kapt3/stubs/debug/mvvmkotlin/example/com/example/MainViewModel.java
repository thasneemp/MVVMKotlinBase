package mvvmkotlin.example.com.example;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007J\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0006J\u0006\u0010\u000b\u001a\u00020\nR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lmvvmkotlin/example/com/example/MainViewModel;", "Lmhdthasneemp/lib/mvvmbasekotlin/BaseViewModel;", "Lmvvmkotlin/example/com/example/UINavigator;", "()V", "textValue", "Landroid/arch/lifecycle/MutableLiveData;", "", "getTextValue", "getTextValueObserver", "setTextValue", "", "showMessage", "app_debug"})
public final class MainViewModel extends mhdthasneemp.lib.mvvmbasekotlin.BaseViewModel<mvvmkotlin.example.com.example.UINavigator> {
    private final android.arch.lifecycle.MutableLiveData<java.lang.String> textValue = null;
    
    public final void showMessage() {
    }
    
    @org.jetbrains.annotations.Nullable()
    @android.databinding.Bindable()
    public final java.lang.String getTextValue() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.MutableLiveData<java.lang.String> getTextValueObserver() {
        return null;
    }
    
    public final void setTextValue(@org.jetbrains.annotations.NotNull()
    java.lang.String textValue) {
    }
    
    public MainViewModel() {
        super();
    }
}