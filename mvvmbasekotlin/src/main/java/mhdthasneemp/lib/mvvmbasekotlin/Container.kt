package mhdthasneemp.lib.mvvmbasekotlin

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.net.ConnectivityManager
import android.os.Bundle
import android.support.v7.app.AppCompatActivity


open class Container : AppCompatActivity() {
    companion object {
        const val ACTION = "android.net.conn.CONNECTIVITY_CHANGE"
        const val NETWORK_CONNECTED = 100
        const val NETWORK_DISCONNECTED = 101
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val intentFilter = IntentFilter(ACTION)
        registerReceiver(broadcastReceiver, intentFilter)


    }

    override fun onDestroy() {
        super.onDestroy()
        if (broadcastReceiver != null) {
            unregisterReceiver(broadcastReceiver)
        }
    }

    private val broadcastReceiver = object : BroadcastReceiver() {
        override fun onReceive(context: Context, intent: Intent) {

            if (intent.action.equals(ACTION, ignoreCase = true)) {
                if (isNetworkAvailable()) {
                    onNetworkChanged(NETWORK_CONNECTED)
                } else {
                    onNetworkChanged(NETWORK_DISCONNECTED)
                }
            }

        }
    }

    open fun onNetworkChanged(networK_CONNECTED: Int) {

    }

    fun isNetworkAvailable(): Boolean {
        val cm = getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val networkInfo = cm.activeNetworkInfo
        return networkInfo != null && networkInfo.isConnected
    }

}