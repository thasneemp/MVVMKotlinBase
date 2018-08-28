package mvvmkotlin.example.com.example

import android.databinding.ObservableField
import mhdthasneemp.lib.mvvmbasekotlin.BaseViewModel


class MainViewModel : BaseViewModel<UINavigator>() {
    fun showMessage() {
        getNavigator()!!.showToast(getTextValue())
    }

    private val textValue = ObservableField<String>()


    fun getTextValue(): String? {
        return textValue.get()
    }

    fun setTextValue(textValue: String) {
        this.textValue.set(textValue)
    }
}