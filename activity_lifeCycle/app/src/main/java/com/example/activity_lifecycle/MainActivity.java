package com.example.activity_lifecycle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Toast.makeText(this,"OnCreate()",Toast.LENGTH_SHORT).show();
        Log.d("msg", "OnCreate");


        BluetoothAdapter bluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
        Button btn = findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (bluetoothAdapter == null) {

                    Toast.makeText(MainActivity.this, "Bluetooth not possible", Toast.LENGTH_SHORT).show();

                } else if (!bluetoothAdapter.isEnabled()) {

                    Intent enableBtIntent = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);

                    startActivity(enableBtIntent);


                }else if (bluetoothAdapter.isEnabled()) {

                    bluetoothAdapter.disable();

                }


            }
        });


    }


    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this,"OnStart()",Toast.LENGTH_SHORT);
        Log.d("msg","OnStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this,"OnResume()",Toast.LENGTH_SHORT).show();
        Log.d("msg","OnResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this,"OnRestart()",Toast.LENGTH_SHORT).show();
        Log.d("msg","OnRestart");
    }


    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this,"OnPause()",Toast.LENGTH_SHORT).show();
        Log.d("msg","OnPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this,"OnStop()",Toast.LENGTH_SHORT).show();
        Log.d("msg","OnStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this,"OnDestroy()",Toast.LENGTH_SHORT).show();
        Log.d("msg","OnDestroy");
    }
}