package com.example.day8_customtoest;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import java.util.concurrent.Callable;

public class MainActivity extends AppCompatActivity {

    Button btn,btn2;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn=findViewById(R.id.button);
        btn2=findViewById(R.id.button2);

//        LayoutInflater inflater=getLayoutInflater();
//        View layout=inflater.inflate(R.layout.toest,(ViewGroup)findViewById(R.id.toast));
//
//        Toast toast=new Toast(getApplicationContext());
//        toast.setView(layout);
//        toast.setDuration(Toast.LENGTH_SHORT);


        LayoutInflater inflater= getLayoutInflater();
        View layout=inflater.inflate(R.layout.toast_,(ViewGroup)findViewById(R.id.toast_));
        Toast toast=new Toast(getApplicationContext());
        toast.setView(layout);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                toast.show();



            }


        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toast.cancel();
            }
        });



    }
}