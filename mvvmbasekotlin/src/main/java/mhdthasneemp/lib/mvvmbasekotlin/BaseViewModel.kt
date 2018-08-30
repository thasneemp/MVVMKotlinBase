package mhdthasneemp.lib.mvvmbasekotlin

import android.arch.lifecycle.ViewModel
import android.databinding.Observable
import android.databinding.ObservableBoolean
import android.databinding.PropertyChangeRegistry
import java.lang.ref.WeakReference


abstract class BaseViewModel<N> : ViewModel(), Observable {
    private val callbacks: PropertyChangeRegistry = PropertyChangeRegistry()

    private val mIsLoading = ObservableBoolean(false)

    private lateinit var mNavigator: WeakReference<N>


    fun getIsLoading(): ObservableBoolean {
        return mIsLoading
    }

    fun setIsLoading(isLoading: Boolean) {
        mIsLoading.set(isLoading)
    }

    fun getNavigator(): N? {
        return mNavigator.get()
    }

    fun setNavigator(navigator: N) {
        this.mNavigator = WeakReference(navigator)
    }

    override fun addOnPropertyChangedCallback(
            callback: Observable.OnPropertyChangedCallback) {
        callbacks.add(callback)
    }

    override fun removeOnPropertyChangedCallback(
            callback: Observable.OnPropertyChangedCallback) {
        callbacks.remove(callback)
    }

    /**
     * Notifies observers that all properties of this instance have changed.
     */
    fun notifyChange() {
        callbacks.notifyCallbacks(this, 0, null)
    }

    /**
     * Notifies observers that a specific property has changed. The getter for the
     * property that changes should be marked with the @Bindable annotation to
     * generate a field in the BR class to be used as the fieldId parameter.
     *
     * @param fieldId The generated BR id for the Bindable field.
     */
    fun notifyPropertyChanged(fieldId: Int) {
        callbacks.notifyCallbacks(this, fieldId, null)
    }
}