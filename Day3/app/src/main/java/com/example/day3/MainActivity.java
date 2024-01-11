package com.example.day3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText name,email,contact,password;
        Button login_button;
        name=(EditText) findViewById(R.id.name);
        email=(EditText) findViewById(R.id.email);
        contact=(EditText) findViewById(R.id.contact);
        password=(EditText) findViewById(R.id.password);


        String name_field = name.getText().toString();
        String email_field =email.getText().toString();
        String contact_field= contact.getText().toString();
        String password_field=password.getText().toString();





    }
}