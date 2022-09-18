package com.example.fooddeliveryapp;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class AdaptorMenuItem extends RecyclerView.Adapter<AdaptorMenuItem.MyViewHolder>
{
    RestaurantStructure restaurantData;
    List<MenuItem> menuList;

    public AdaptorMenuItem(List<MenuItem> menuList) {
        this.menuList = menuList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.template_menu_item,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position)
    {
        holder.foodImg.setImageResource(menuList.get(position).getFoodImg());
        holder.foodName.setText(menuList.get(position).getFoodName());
        holder.foodDescription.setText(menuList.get(position).getFoodDescription());
        holder.foodPrice.setText(menuList.get(position).getFoodPrice());
    }

    @Override
    public int getItemCount() {
        return menuList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        public ImageView foodImg;
        public TextView foodPrice;
        public TextView foodName;
        public TextView foodDescription;

        public MyViewHolder(View view) {
            super(view);
            foodImg = itemView.findViewById(R.id.foodImage);
            foodName = itemView.findViewById(R.id.foodName);
            foodPrice = itemView.findViewById(R.id.foodPrice);
            foodDescription = itemView.findViewById(R.id.foodDescription);
        }
    }
}
