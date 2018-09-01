package mvvmkotlin.example.com.example

import android.databinding.Bindable
import android.databinding.ObservableField
import mhdthasneemp.lib.mvvmbasekotlin.BaseViewModel


class MainViewModel : BaseViewModel<UINavigator>() {
    fun showMessage() {
        getNavigator()!!.showToast(getTextValue())
    }

    private val textValue = ObservableField<String>()

    @Bindable
    fun getTextValue(): String? {
        return textValue.get()
    }


    fun setTextValue(textValue: String) {
        this.textValue.set(textValue)
        notifyPropertyChanged(BR.textValue)
    }
}