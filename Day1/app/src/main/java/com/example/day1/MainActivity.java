package com.example.day1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView textView;
    Button push_me1,push_me2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView =(TextView) findViewById(R.id.text_);
        Button push_me1=(Button) findViewById(R.id.button1);
        Button push_me2=(Button) findViewById(R.id.button2);

//        push_me1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                textView.setText("I am , What you think i am");
//            }
//
//        });
//
//        push_me2.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View v){
//                textView.setText("Hii, I am android");
//            }
//        });
//
        push_me1.setOnClickListener(this);
        push_me2.setOnClickListener(this);


    }





    @Override
    protected void onPause(){
        super.onPause();
        Log.d("tag","In onPause");

    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.d("tag","In onStop");


    }
    @Override
    protected void onStart(){
        super.onStart();
        Log.d("tag","In onStart");

    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d("tag","In onDestroy");

    }

    //better approach
    @Override
    public void onClick(View view){
        int viewId = view.getId();
        if (viewId == R.id.button1) {
            Log.d("tag", "Hii, I am android");
            textView.setText("Hii, I am android");
        } else if (viewId == R.id.button2) {
            textView.setText("I am, What you think I am");
        } else {
            Log.d("tag", "Button not found");
        }


    }



}