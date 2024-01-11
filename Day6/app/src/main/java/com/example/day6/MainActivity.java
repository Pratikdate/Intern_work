package com.example.day6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;

import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  {



    Button button,button2;
    EditText URL;
    ListView listView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=(Button) findViewById(R.id.button_login);
        button2=findViewById(R.id.go_);


        //list view creation
        listView=(ListView) findViewById(R.id.list_item);
        URL=findViewById(R.id.URL);

        String arr[]={"Call","Dial","Action send to","Java","javascript"};
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,arr);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        Intent intent_=new Intent(Intent.ACTION_DIAL);

                        startActivity(intent_);
                        break;
                    case 1:
                        Intent intent_q=new Intent(Intent.ACTION_CALL, Uri.parse("9767451907"));

                        startActivity(intent_q);
                        break;
                    default:
                        Intent intent_d=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com"));

                        startActivity(intent_d);

                }
            }
        });


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Explesite Intent and Bundle passing
                Intent intent=new Intent(MainActivity.this,login_link.class);
                intent.putExtra("title","Home");
                intent.putExtra("student_name","Raman");
                intent.putExtra("Roll_no",10);

                startActivity(intent);




            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url=URL.getText().toString();

                //Implecite Intents
                if(!url.equals("")){
                    Intent intent_=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www."+url));

                    startActivity(intent_);
                }else {
                    Intent intent_=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com"));
                    startActivity(intent_);
                }

            }
        });



    }
}
