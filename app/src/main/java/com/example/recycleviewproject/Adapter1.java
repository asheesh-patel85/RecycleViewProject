package com.example.recycleviewproject;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Adapter1 extends RecyclerView.Adapter<Adapter1.viewHolder> {
    private ArrayList<ItemData> userList;
    public Adapter1( ArrayList<ItemData> userList){
        this.userList=userList;
    }
    @NonNull
    @Override
    public Adapter1.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
      View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_design,parent,false);
    return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter1.viewHolder holder, int position) {
        int id= userList.get(position).getId();
        String fname=userList.get(position).getFname();
        String lname=userList.get(position).getLname();
        int mno=userList.get(position).getMno();
        holder.setData(id,fname,lname,mno);
    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        private TextView txt1;
        private TextView txt2;
        private TextView txt3;
        private TextView txt4;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            txt1=itemView.findViewById(R.id.textViewId);
            txt2=itemView.findViewById(R.id.textViewFname);
            txt3=itemView.findViewById(R.id.textViewLname);
            txt4=itemView.findViewById(R.id.textViewMno);
        }

        public void setData(int id, String fname, String lname, int mno) {
            txt1.setText(Integer.toString(id));
            txt2.setText(fname);
            txt3.setText(lname);
            txt4.setText(Integer.toString(mno));
        }
    }
}
