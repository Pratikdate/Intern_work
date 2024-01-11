package com.example.card_view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    CardView cardView;
    EditText show;
    Button btn1,btn2;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cardView =findViewById(R.id.cardView);

        //cardView.setCardElevation(2.0f);
        cardView.setCardBackgroundColor(100);


        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        show=findViewById(R.id.show_date);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                DatePickerDialog datePickerDialog=new DatePickerDialog(MainActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        show.setText("Date :"+year+"/"+month+"/"+dayOfMonth);
                    }
                },2023, Calendar.JULY,28);

                datePickerDialog.show();

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog=new TimePickerDialog(MainActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                        show.setText("Time :"+hourOfDay+":"+minute);
                    }
                },24,60,false);

                timePickerDialog.show();

            }
        });



    }
}