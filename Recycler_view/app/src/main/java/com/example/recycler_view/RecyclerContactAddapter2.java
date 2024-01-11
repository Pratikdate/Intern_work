package com.example.recycler_view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerContactAddapter2 extends RecyclerView.Adapter<RecyclerContactAddapter2.Viewholder> {

    Context context;
    ArrayList<Contact_model2> arrayList;

    RecyclerContactAddapter2(Context context, ArrayList<Contact_model2> arrayList){
        this.context=context;
        this.arrayList=arrayList;
    }

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(context).inflate(R.layout.contact_row,parent,false);
        Viewholder viewholder=new Viewholder(view);
        return viewholder;
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {
        holder.img.setImageResource(arrayList.get(position).image);
        holder.name.setText(arrayList.get(position).name);
        holder.address.setText(arrayList.get(position).address);
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class Viewholder extends RecyclerView.ViewHolder {

        ImageView img;
        TextView name,address;
        public Viewholder(View itemView){
            super(itemView);

            img=itemView.findViewById(R.id.image);
            name=itemView.findViewById(R.id.textName);
            address=itemView.findViewById(R.id.textNumber);



        }
    }
}
