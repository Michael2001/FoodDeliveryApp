package com.example.fooddeliveryapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapatorRestaurant extends RecyclerView.Adapter<AdapatorRestaurant.MyViewHolder>
{
    RestaurantStructure dataHolder;

    public AdapatorRestaurant(RestaurantStructure dataHolder) {
        this.dataHolder = dataHolder;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.template_restaurant,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position)
    {
        holder.restaurantImg.setImageResource(dataHolder.get(position).getImgUrl());
        holder.restaurantName.setText(dataHolder.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return dataHolder.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        public ImageView restaurantImg;
        public TextView restaurantName;

        public MyViewHolder(View view) {
            super(view);
            restaurantImg = itemView.findViewById(R.id.restaurantImage);
            restaurantName = itemView.findViewById(R.id.restaurantName);
        }
    }
}
