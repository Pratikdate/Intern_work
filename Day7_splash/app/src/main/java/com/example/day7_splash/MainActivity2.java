package com.example.day7_splash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent =new Intent(MainActivity2.this,MainActivity.class);

        //use to delay on page
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                 startActivity(intent);
            }
        }, 4000);






    }
}