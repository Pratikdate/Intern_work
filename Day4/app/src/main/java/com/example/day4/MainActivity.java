package com.example.day4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  {


    AppCompatButton button;
    EditText name,address,phone,email,password;

    class Data{
        String name="Ram";
        String email="Ram@gami.com";
        String pass="Ram@123";
        String addr="Pune";
        String phone="2716228152";
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name=findViewById(R.id.name);
        email=findViewById(R.id.email);
        password=findViewById(R.id.password);
        phone=findViewById(R.id.phone);
        address=findViewById(R.id.address);




        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Name=findViewById(R.id.name).toString();
                String email=findViewById(R.id.email).toString();
                String pass=findViewById(R.id.password).toString();
                String addr=findViewById(R.id.address).toString();
                String phone=findViewById(R.id.phone).toString();

                Data data=new Data();

                if(data.name.equals(Name) && data.email.equals(email) && data.addr.equals(addr) && data.pass.equals(pass) && data.phone.equals(phone)){
                    Toast.makeText(MainActivity.this, "Login Successful", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(MainActivity.this, "Login Fail", Toast.LENGTH_SHORT).show();

                }





            }
        });






    }


}
