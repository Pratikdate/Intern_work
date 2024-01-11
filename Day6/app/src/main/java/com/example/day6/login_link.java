package com.example.day6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class login_link extends AppCompatActivity {



    Button button;
    EditText username,useraddress,userphone,useremail,userpassword;
    TextView get_data;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_link2);

        username=(EditText)findViewById(R.id.name);
        useremail=(EditText)findViewById(R.id.email);
        userpassword=(EditText)findViewById(R.id.password);
        userphone=(EditText)findViewById(R.id.phone);
        useraddress=(EditText)findViewById(R.id.address);
        get_data=findViewById(R.id.get_data);
        button=(Button) findViewById(R.id.button);


        Intent fromAct = getIntent();
        String title= fromAct.getStringExtra("title");
        String student_name= fromAct.getStringExtra("student_name");
        int roll_no=fromAct.getIntExtra("Roll_no",0);

        get_data.setText("Student_name :"+student_name+"\nStudent_name :"+roll_no  );

        //getSupportActionBar().setTitle(title);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String Name_=username.getText().toString();
                String email_=useremail.getText().toString();
                String pass_=userpassword.getText().toString();
                String addr_=useraddress.getText().toString();
                String phone_=userphone.getText().toString();

                Data data=new Data();

                if(data.name_d.equals(Name_) && data.email_d.equals(email_) && data.addr_d.equals(addr_) && data.pass_d.equals(pass_) && data.phone_d.equals(phone_)){
                    Toast.makeText(login_link.this, "Login Successful", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(login_link.this, "Login Fail", Toast.LENGTH_SHORT).show();

                }

            }
        });






    }


}


class Data{
    String name_d="Ram";
    String email_d="Ram@gami.com";
    String pass_d="123";
    String addr_d="Pune";
    String phone_d="2716228152";
}
