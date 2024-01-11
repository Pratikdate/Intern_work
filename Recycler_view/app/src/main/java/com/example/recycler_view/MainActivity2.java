package com.example.recycler_view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    ArrayList<Contact_model2> arrayList=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        RecyclerView recyclerView=findViewById(R.id.recyclerView2);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        arrayList.add(new Contact_model2(R.drawable.ic_launcher_foreground,"A","a"));
        arrayList.add(new Contact_model2(R.drawable.ic_launcher_foreground,"A","a"));
        arrayList.add(new Contact_model2(R.drawable.ic_launcher_foreground,"A","a"));
        arrayList.add(new Contact_model2(R.drawable.ic_launcher_foreground,"A","a"));
        arrayList.add(new Contact_model2(R.drawable.ic_launcher_foreground,"A","a"));
        arrayList.add(new Contact_model2(R.drawable.ic_launcher_foreground,"A","a"));
        arrayList.add(new Contact_model2(R.drawable.ic_launcher_foreground,"A","a"));
        arrayList.add(new Contact_model2(R.drawable.ic_launcher_foreground,"A","a"));
        arrayList.add(new Contact_model2(R.drawable.ic_launcher_foreground,"A","a"));
        arrayList.add(new Contact_model2(R.drawable.ic_launcher_foreground,"A","a"));
        arrayList.add(new Contact_model2(R.drawable.ic_launcher_foreground,"A","a"));
        arrayList.add(new Contact_model2(R.drawable.ic_launcher_foreground,"A","a"));
        arrayList.add(new Contact_model2(R.drawable.ic_launcher_foreground,"A","a"));
        arrayList.add(new Contact_model2(R.drawable.ic_launcher_foreground,"A","a"));
        arrayList.add(new Contact_model2(R.drawable.ic_launcher_foreground,"A","a"));
        arrayList.add(new Contact_model2(R.drawable.ic_launcher_foreground,"A","a"));
        arrayList.add(new Contact_model2(R.drawable.ic_launcher_foreground,"A","a"));
        arrayList.add(new Contact_model2(R.drawable.ic_launcher_foreground,"A","a"));
        arrayList.add(new Contact_model2(R.drawable.ic_launcher_foreground,"A","a"));
        arrayList.add(new Contact_model2(R.drawable.ic_launcher_foreground,"A","a"));


        RecyclerContactAddapter2 recyclerContactAddapter2=new RecyclerContactAddapter2(this,arrayList);

        recyclerView.setAdapter(recyclerContactAddapter2);




    }
}