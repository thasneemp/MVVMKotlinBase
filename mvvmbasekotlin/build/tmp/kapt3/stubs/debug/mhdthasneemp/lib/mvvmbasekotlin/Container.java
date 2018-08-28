package mhdthasneemp.lib.mvvmbasekotlin;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0016\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0014J\b\u0010\u000b\u001a\u00020\bH\u0014J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lmhdthasneemp/lib/mvvmbasekotlin/Container;", "Landroid/support/v7/app/AppCompatActivity;", "()V", "broadcastReceiver", "Landroid/content/BroadcastReceiver;", "isNetworkAvailable", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onNetworkChanged", "networkStatus", "", "Companion", "mvvmbasekotlin_debug"})
public class Container extends android.support.v7.app.AppCompatActivity {
    private final android.content.BroadcastReceiver broadcastReceiver = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION = "android.net.conn.CONNECTIVITY_CHANGE";
    public static final int NETWORK_CONNECTED = 100;
    public static final int NETWORK_DISCONNECTED = 101;
    public static final mhdthasneemp.lib.mvvmbasekotlin.Container.Companion Companion = null;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    public void onNetworkChanged(int networkStatus) {
    }
    
    public final boolean isNetworkAvailable() {
        return false;
    }
    
    public Container() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lmhdthasneemp/lib/mvvmbasekotlin/Container$Companion;", "", "()V", "ACTION", "", "NETWORK_CONNECTED", "", "NETWORK_DISCONNECTED", "mvvmbasekotlin_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}