package com.example.project_bmi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText editText3 =(EditText) findViewById(R.id.edtweight);
        EditText editText1 =(EditText) findViewById(R.id.edtheight);
        EditText editText2=(EditText) findViewById(R.id.edtHeightIn);
        TextView result=(TextView) findViewById(R.id.textResult);
        AppCompatButton button =(AppCompatButton) findViewById(R.id.btnCalculater);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               int ft=Integer.parseInt( editText2.getText().toString());
               int wt=Integer.parseInt(editText1.getText().toString());
               int in =Integer.parseInt(editText3.getText().toString());

                int totalInch= ft*12 + in;
                double totalcm= totalInch*2.53;

                double totalm= totalcm/100;

                double bni= wt/(totalm * totalm);
                if (bni > 25) {
                    result.setText("You are over weight ");
                }else if(bni<18){
                    result.setText("you are underweight");
                }else{
                    result.setText("you are fit");
                }



            }
        });


    }
}