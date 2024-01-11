package com.example.sms_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText phone,message;
    Button btn;
    String phone_,mess_;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        phone=findViewById(R.id.phone);
        message=findViewById(R.id.message);
        btn=findViewById(R.id.btn1);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                phone_=phone.getText().toString();
                mess_=message.getText().toString();

                SmsManager smsManager=SmsManager.getDefault();
                try {
                    smsManager.sendTextMessage(phone_,null,mess_,null,null);
                    Toast.makeText(getApplicationContext(),"succesfully",Toast.LENGTH_SHORT).show();


                }catch (Exception e){
                    Toast.makeText(getApplicationContext(),"fail",Toast.LENGTH_SHORT).show();


                }

            }
        });

    }
}