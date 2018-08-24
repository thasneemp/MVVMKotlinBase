package mhdthasneemp.lib.mvvmbasekotlin

import android.arch.lifecycle.ViewModel
import android.databinding.ObservableBoolean
import java.lang.ref.WeakReference


abstract class BaseViewModel<N> : ViewModel() {
    private val mIsLoading = ObservableBoolean(false)

    private var mNavigator: WeakReference<N>? = null


    override fun onCleared() {
        super.onCleared()
    }

    fun getIsLoading(): ObservableBoolean {
        return mIsLoading
    }

    fun setIsLoading(isLoading: Boolean) {
        mIsLoading.set(isLoading)
    }

    fun getNavigator(): N? {
        return mNavigator?.get()
    }

    fun setNavigator(navigator: N) {
        this.mNavigator = WeakReference(navigator)
    }
}