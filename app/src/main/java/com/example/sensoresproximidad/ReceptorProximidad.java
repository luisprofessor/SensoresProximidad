package com.example.sensoresproximidad;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class ReceptorProximidad extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        Toast.makeText(context,"En la zona",Toast.LENGTH_LONG).show();
    }
}
