package com.example.recycler_view;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerContactAdapter extends RecyclerView.Adapter<RecyclerContactAdapter.Viewholeder> {

    Context context;
    ArrayList<Contact_model> arrayList;
    RecyclerContactAdapter(Context context, ArrayList<Contact_model> arrayList){
        this.context=context;
        this.arrayList=arrayList;
    }
    
    @NonNull
    @Override
    public Viewholeder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(context).inflate(R.layout.contact_row,parent,false);
        Viewholeder viewHolder=new Viewholeder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholeder holder, @SuppressLint("RecyclerView") int position) {
        holder.image.setImageResource(arrayList.get(position).image);
        holder.textName.setText(arrayList.get(position).name);
        holder.textNumber.setText(arrayList.get(position).number);


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog dialog=new Dialog(context);
                dialog.setContentView(R.layout.add_updstez_lay);

                EditText editName=dialog.findViewById(R.id.add_Name);
                EditText editNumber=dialog.findViewById(R.id.add_Number);
                Button btnAction=dialog.findViewById(R.id.btnAction);


                TextView textView=dialog.findViewById(R.id.textTitle);
                textView.setText("Update Form");

                btnAction.setText("Update");

                editNumber.setText(arrayList.get(position).number);
                editName.setText(arrayList.get(position).name);


                btnAction.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        String name ="",number="";

                        if(!editName.getText().toString().equals("")  && !editNumber.getText().toString().equals("")){
                            name=editName.getText().toString();
                            number=editNumber.getText().toString();

                            arrayList.add(position,new Contact_model(arrayList.get(position).image,name,number));
                            notifyItemChanged(position);
                            dialog.dismiss();

                        }
                        else{
                            Toast.makeText(context,"Please ente valid input",Toast.LENGTH_SHORT).show();
                        }








                    }

                });

                dialog.show();


                    }
        });


        holder.litem.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {

                AlertDialog.Builder builder=new AlertDialog.Builder(context).setTitle("Delete Contact").setMessage("Are you sure want to delete").setPositiveButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        arrayList.remove(position);


                    }
                }).setNegativeButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        notifyItemRemoved(position);
                        dialog.dismiss();

                    }
                });

                builder.show();


                return true;
            }
        });



    }

    @Override
    public int getItemCount() {

        return arrayList.size();
    }

    public  class Viewholeder extends RecyclerView.ViewHolder{
        TextView textName,textNumber;
        ImageView image;
        LinearLayout litem;
        public Viewholeder(View itemView){
            super(itemView);
            textName=itemView.findViewById(R.id.textName);
            textNumber=itemView.findViewById(R.id.textNumber);
            image=itemView.findViewById(R.id.image);
            litem=itemView.findViewById(R.id.itemRow);





        }
    }



    private void setAnimation(View viewToAnimation ,int position ){

        Animation slideIn= AnimationUtils.loadAnimation(context, android.R.anim.slide_in_left);


    }


}
