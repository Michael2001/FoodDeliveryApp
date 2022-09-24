package com.example.fooddeliveryapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterOrder extends RecyclerView.Adapter<RecyclerView.ViewHolder>
{
    List<MenuItem> menuList;


    public AdapterOrder(List<MenuItem> menuList) {
        this.menuList = menuList;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_order_item, parent, false);
        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final RecyclerView.ViewHolder holder, int position)
    {

        final ItemViewHolder itemViewHolder = (ItemViewHolder) holder;
        itemViewHolder.foodImg.setImageResource(menuList.get(position).getFoodImg());
        itemViewHolder.imgSource = menuList.get(position).getFoodImg();
        itemViewHolder.foodName.setText(menuList.get(position).getFoodName());
        itemViewHolder.foodDescription.setText(menuList.get(position).getFoodDescription());
        itemViewHolder.foodPrice.setText(menuList.get(position).getFoodPrice());
        itemViewHolder.cartCount.setText(menuList.get(position).getNum());

    }

    @Override
    public int getItemCount() {
        return menuList.size();
    }


    public class ItemViewHolder extends RecyclerView.ViewHolder {
        public ImageView foodImg;
        public TextView foodPrice;
        public TextView foodName;
        public TextView foodDescription;
        public TextView cartCount;
        public TextView special;
        public Button addButton;
        public Button takeButton;
        public int imgSource;
        public MenuItem temp;



        public ItemViewHolder(View view) {
            super(view);
            imgSource = 0;
            foodImg = itemView.findViewById(R.id.foodImage);
            foodName = itemView.findViewById(R.id.foodName);
            foodPrice = itemView.findViewById(R.id.foodPrice);
            foodDescription = itemView.findViewById(R.id.foodDescription);
            cartCount = itemView.findViewById(R.id.count);




        }

    }


}
