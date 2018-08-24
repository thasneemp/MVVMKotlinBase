package mvvmkotlin.example.com.example

import mhdthasneemp.lib.mvvmbasekotlin.BaseViewModel
import android.databinding.ObservableField


class MainViewModel : BaseViewModel<UINavigator>() {
    private val textValue = ObservableField<String>()

    fun showToast() {
        getNavigator()!!.showToast(textValue.get()!!)
    }

    fun getTextValue(): ObservableField<String> {
        return textValue
    }

    fun setTextValue(textValue: String) {
        this.textValue.set(textValue)
    }
}