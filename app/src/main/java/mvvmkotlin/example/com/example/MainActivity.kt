package mvvmkotlin.example.com.example

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.widget.Toast
import mhdthasneemp.lib.mvvmbasekotlin.BaseActivity
import mhdthasneemp.lib.mvvmbasekotlin.Container
import mvvmkotlin.example.com.example.databinding.ActivityMainBinding


class MainActivity : BaseActivity<ActivityMainBinding, MainViewModel>(), UINavigator {

    private lateinit var myModel: MainViewModel

    override fun getBindingVariable(): Int {
        return BR.viewModel
    }

    override fun getLayoutId(): Int {
        return R.layout.activity_main
    }

    override fun getViewModel(): MainViewModel {
        myModel = ViewModelProviders.of(this).get(MainViewModel::class.java!!)
        return myModel
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        myModel.setNavigator(this)


    }

    override fun showToast(name: String?) {
        if (isNetworkAvailable()) {
            Toast.makeText(this, "Network available", Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(this, "Network not available", Toast.LENGTH_SHORT).show()
        }

        Toast.makeText(this, "$name Welcome to MVVM", Toast.LENGTH_SHORT).show()
    }

    override fun onNetworkChanged(status: Int) {
        super.onNetworkChanged(status)
        when (status) {
            Container.NETWORK_CONNECTED -> Toast.makeText(this, "Connected", Toast.LENGTH_SHORT).show()
            Container.NETWORK_DISCONNECTED -> Toast.makeText(this, "Disconnected", Toast.LENGTH_SHORT).show()
        }
    }
}
