package com.example.fooddeliveryapp;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapatorRestaurant extends RecyclerView.Adapter<AdapatorRestaurant.MyViewHolder>
{
    public static RestaurantStructure dataHolder;

    public AdapatorRestaurant(RestaurantStructure dataHolder)
    {
        this.dataHolder = dataHolder;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.template_restaurant,parent,false);
        return new MyViewHolder(view);
    }


    public static void incrementRestrauntItem(String item){
        dataHolder.incramentItem(item);
    }

    public static void decreaseRestrauntItem(String item){
        dataHolder.decreaseItem(item);
    }
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position)
    {
        holder.restaurantImg.setImageResource(dataHolder.get(position).getImgUrl());
        holder.restaurantName.setText(dataHolder.get(position).getName());

        holder.itemView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                AppCompatActivity activity = (AppCompatActivity) view.getContext();
                FragmentRestaurant fragmentRestaurant = new FragmentRestaurant(dataHolder.get(position));
                activity.getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, fragmentRestaurant).addToBackStack(null).commit();
            }
        });
    }

    @Override
    public int getItemCount() {
        return dataHolder.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder  {
        public ImageView restaurantImg;
        public TextView restaurantName;

        public MyViewHolder(View view) {
            super(view);
            restaurantImg = itemView.findViewById(R.id.restaurantImage);
            restaurantName = itemView.findViewById(R.id.restaurantName);
        }
    }
}
