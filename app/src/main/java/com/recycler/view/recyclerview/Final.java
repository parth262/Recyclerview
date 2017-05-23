package com.recycler.view.recyclerview;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Final extends RecyclerView.Adapter<Final.MyViewHolder > {

    private List<Skills> skillsList;

    public class MyViewHolder extends RecyclerView.ViewHolder{

        public ImageView image;
        public TextView name;

        public MyViewHolder(View view){
            super(view);
            image = (ImageView) view.findViewById(R.id.image);
            name = (TextView) view.findViewById(R.id.name);
        }
    }

    public Final(List<Skills> skillsList){
        this.skillsList = skillsList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.skills, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(Final.MyViewHolder holder, int position) {
        Skills skills = skillsList.get(position);
        holder.image.setImageResource(skills.getImage());
        holder.name.setText(skills.getName());

    }

    @Override
    public int getItemCount() {
        return skillsList.size();
    }
}
