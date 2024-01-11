package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    Spinner spinner;
    ArrayList<String>  arrLang=new ArrayList<>();
    ArrayList<String> arrId=new ArrayList<>();
    ArrayList<String> languages =new ArrayList<>();

    //Autocomplete
    AutoCompleteTextView autoCompleteTextView;




    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=findViewById(R.id.listView);
        spinner=findViewById(R.id.spinner);
        autoCompleteTextView=findViewById(R.id.actxview);

        arrLang.add("Ram");
        arrLang.add("sham");
        arrLang.add("sham");
        arrLang.add("sham");
        arrLang.add("sham");
        arrLang.add("sham");
        arrLang.add("sham");
        arrLang.add("sham");
        arrLang.add("sham");
        arrLang.add("sham");
        arrLang.add("sham");
        arrLang.add("sham");
        arrLang.add("sham");
        arrLang.add("sham");
        arrLang.add("sham");
        arrLang.add("sham");
        arrLang.add("sham");
        arrLang.add("sham");
        arrLang.add("sham");
        arrLang.add("sham");

        ArrayAdapter<String> adapter=new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1,arrLang);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    Toast.makeText(MainActivity.this,"Click first item",Toast.LENGTH_SHORT).show();
                }
            }
        });

        //spinner


        arrId.add("Adhar card");
        arrId.add("Pan card");
        arrId.add("Voter ID card");
        arrId.add("Driver licence card");
        arrId.add("board exam card");
        arrId.add("failed card");

        ArrayAdapter<String> spinnerAdapter=new ArrayAdapter<>(this,android.R.layout.simple_spinner_dropdown_item,arrId);
        spinner.setAdapter(spinnerAdapter);


        //Autocompletetextview

        languages.add("C");
        languages.add("C++");
        languages.add("C#");
        languages.add("python");
        languages.add("java");
        languages.add("R");
        languages.add("Css");

        ArrayAdapter<String> actvAdapter= new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, languages);
        autoCompleteTextView.setAdapter(actvAdapter);
        autoCompleteTextView.setThreshold(1);



    }
}