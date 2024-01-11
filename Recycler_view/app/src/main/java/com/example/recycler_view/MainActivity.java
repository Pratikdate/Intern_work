package com.example.recycler_view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {



    ArrayList<Contact_model> arrContact=new ArrayList<>();
    RecyclerView recyclerView;
    FloatingActionButton btnOpenDialog;
    RecyclerContactAdapter adapter;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        btnOpenDialog=findViewById(R.id.btnOpenDialog);










        Contact_model model=new Contact_model(R.drawable.baseline_account_box_24,"A","000000000");
        arrContact.add(model);

        arrContact.add(new Contact_model(R.drawable.baseline_account_box_24,"B","9971`6988"));
        arrContact.add(new Contact_model(R.drawable.baseline_account_box_24,"c","9971`6988"));
        arrContact.add(new Contact_model(R.drawable.baseline_account_box_24,"d","9971`6988"));
        arrContact.add(new Contact_model(R.drawable.baseline_account_box_24,"r","9971`6988"));
        arrContact.add(new Contact_model(R.drawable.baseline_account_box_24,"h","9971`6988"));
        arrContact.add(new Contact_model(R.drawable.baseline_account_box_24,"s","9971`6988"));
        arrContact.add(new Contact_model(R.drawable.baseline_account_box_24,"g","9971`6988"));
        arrContact.add(new Contact_model(R.drawable.baseline_account_box_24,"B","9971`6988"));
        arrContact.add(new Contact_model(R.drawable.baseline_account_box_24,"Bs","9971`6988"));
        arrContact.add(new Contact_model(R.drawable.baseline_account_box_24,"j","9971`6988"));
        arrContact.add(new Contact_model(R.drawable.baseline_account_box_24,"Bh","9971`6988"));
        arrContact.add(new Contact_model(R.drawable.baseline_account_box_24,"h","9971`6988"));
        arrContact.add(new Contact_model(R.drawable.baseline_account_box_24,"w","9971`6988"));
        arrContact.add(new Contact_model(R.drawable.baseline_account_box_24,"r","9971`6988"));
        arrContact.add(new Contact_model(R.drawable.baseline_account_box_24,"Bnk","9971`6988"));
        arrContact.add(new Contact_model(R.drawable.baseline_account_box_24,"Bc","9971`6988"));
        arrContact.add(new Contact_model(R.drawable.baseline_account_box_24,"Bl","9971`6988"));
        arrContact.add(new Contact_model(R.drawable.baseline_account_box_24,"Bn","9971`6988"));
        arrContact.add(new Contact_model(R.drawable.baseline_account_box_24,"Bkkl","9971`6988"));

        RecyclerContactAdapter adapter=new RecyclerContactAdapter(this,arrContact);

        recyclerView.setAdapter(adapter);


        Button btn=(Button) findViewById(R.id.btn);

        Intent intent=new Intent(MainActivity.this,MainActivity2.class);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent);
            }
        });





        btnOpenDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Dialog dialog=new Dialog(MainActivity.this);
                dialog.setContentView(R.layout.add_updstez_lay);

                EditText editName=dialog.findViewById(R.id.add_Name);
                EditText editNumber=dialog.findViewById(R.id.add_Number);
                Button btnAction=dialog.findViewById(R.id.btnAction);


                btnAction.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        String name ="",number="";

                        if(!editName.getText().toString().equals("")  && !editNumber.getText().toString().equals("")){
                            name=editName.getText().toString();
                            number=editNumber.getText().toString();

                            arrContact.add(new Contact_model(name,number));

                            adapter.notifyItemInserted(arrContact.size()-1);

                            recyclerView.scrollToPosition(arrContact.size()-1);

                            dialog.dismiss();

                        }
                        else{
                            Toast.makeText(MainActivity.this,"Please ente valid input",Toast.LENGTH_SHORT).show();
                        }







                    }
                });

                dialog.show();

            }
        });









    }
}