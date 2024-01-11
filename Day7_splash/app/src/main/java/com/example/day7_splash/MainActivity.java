package com.example.day7_splash;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button translate,rotate,alpha,scale;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView=findViewById(R.id.textview);

        translate=findViewById(R.id.translate);
        rotate=findViewById(R.id.rotate);
        alpha=findViewById(R.id.alpha);
        scale=findViewById(R.id.scale);




        translate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation move_= AnimationUtils.loadAnimation(MainActivity.this,R.anim.move);

                textView.startAnimation(move_);

            }
        });

        rotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation rotate_= AnimationUtils.loadAnimation(MainActivity.this,R.anim.rotate);

                textView.startAnimation(rotate_);
            }
        });

        alpha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation alpha_= AnimationUtils.loadAnimation(MainActivity.this,R.anim.alpha);

                textView.startAnimation(alpha_);
            }
        });

        scale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 Animation scale_= AnimationUtils.loadAnimation(MainActivity.this,R.anim.scale);

                textView.startAnimation(scale_);
            }
        });

    }
}