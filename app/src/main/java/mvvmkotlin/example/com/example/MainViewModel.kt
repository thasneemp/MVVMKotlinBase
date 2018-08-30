package mvvmkotlin.example.com.example

import android.arch.lifecycle.MutableLiveData
import android.databinding.Bindable
import mhdthasneemp.lib.mvvmbasekotlin.BaseViewModel


class MainViewModel : BaseViewModel<UINavigator>() {
    fun showMessage() {
        getNavigator()!!.showToast(getTextValue())
    }

    private val textValue = MutableLiveData<String>()


    @Bindable
    fun getTextValue(): String? {
        return textValue.value
    }

    fun getTextValueObserver(): MutableLiveData<String> {
        return textValue
    }

    fun setTextValue(textValue: String) {
        this.textValue.value = textValue
        notifyPropertyChanged(BR.textValue)
    }
}