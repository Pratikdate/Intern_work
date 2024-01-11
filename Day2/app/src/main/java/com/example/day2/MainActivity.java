package com.example.day2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView textView;
    Button dialPhone,toast,showLocation,openWebpage,LetsGetPro,viewIntent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView =(TextView) findViewById(R.id.text_);
        dialPhone=(Button) findViewById(R.id.dialNumber);
        toast=(Button) findViewById(R.id.toast);
        showLocation = (Button) findViewById(R.id.showLocation);
        openWebpage=(Button) findViewById(R.id.openWebpage);
        viewIntent=(Button) findViewById(R.id.viewIntent);
        LetsGetPro=(Button) findViewById(R.id.LetsGetPro);



        dialPhone.setOnClickListener(this);
        toast.setOnClickListener(this);
        showLocation.setOnClickListener(this);
        openWebpage.setOnClickListener(this);
        viewIntent.setOnClickListener(this);
        LetsGetPro.setOnClickListener(this);



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

    //better approach dialPhone,toast,showLocation,openWebpage,LetsGetPro,viewIntent
    @Override
    public void onClick(View view){
        int viewId = view.getId();
        if (viewId == R.id.dialNumber) {
            //dialers happen to be android componet
            Intent intent=new Intent(Intent.ACTION_DIAL, Uri.parse("tel:9767451907"));
            startActivity(intent);

        } else if (viewId == R.id.toast) {
            Intent intent=new Intent(MainActivity.this,otherActivity.class);
            startActivity(intent);
        }else if (viewId == R.id.showLocation) {
            Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("geo:12.9778739,77.5904463,17?zw9"));
            startActivity(intent);
        } else if (viewId == R.id.openWebpage) {
            Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://developer.android.com/reference/android/content/Intent"));
            startActivity(intent);
        } else if (viewId == R.id.LetsGetPro) {
            Intent intent=new Intent(Intent.ACTION_VIEW);
            intent.putExtra("KEY","Value is my Activity.... ");
            startActivity(intent);

        } else if (viewId == R.id.viewIntent) {
            Intent intent=new Intent(Intent.ACTION_VIEW);
            startActivity(intent);
        } else {
            Log.d("tag", "Button not found");
        }


    }



}