package com.example.recycler_view;

import java.util.ArrayList;

public class Contact_model {


    int image;
    String name,number;

    public Contact_model(int image,String name, String number){
        this.image=image;
        this.name=name;
        this.number=number;

    }

    public Contact_model(String name,String number){
        this.image=R.drawable.baseline_account_box_24;
        this.name=name;
        this.number=number;
    }


}
