package com.example.fooddeliveryapp;

import android.view.LayoutInflater;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdaptorMenuItem extends RecyclerView.Adapter<RecyclerView.ViewHolder>
{
    private static final int TYPE_HEADER = 0;
    private static final int TYPE_ITEM = 1;
    List<MenuItem> menuList;
    Restaurant restaurant;

    public AdaptorMenuItem(List<MenuItem> menuList, Restaurant restaurant) {
        this.menuList = menuList;
        this.restaurant = restaurant;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (viewType == TYPE_ITEM) {
            // Here Inflating your recyclerview item layout
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.template_menu_item, parent, false);
            return new ItemViewHolder(view);
        } else if (viewType == TYPE_HEADER) {
            // Here Inflating your header view
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.template_menu_header, parent, false);
            return new HeaderViewHolder(view);
        }
        else return null;
    }

    @Override
    public void onBindViewHolder(final RecyclerView.ViewHolder holder, int position)
    {
        if(holder instanceof HeaderViewHolder) {
            HeaderViewHolder headerViewHolder = (HeaderViewHolder) holder;

            headerViewHolder.restaurantName.setText(restaurant.getName());
            headerViewHolder.restaurantImg.setImageResource(restaurant.getImgUrl());

        } else if(holder instanceof ItemViewHolder) {
            final ItemViewHolder itemViewHolder = (ItemViewHolder) holder;

            position--;

            itemViewHolder.foodImg.setImageResource(menuList.get(position).getFoodImg());
            itemViewHolder.foodName.setText(menuList.get(position).getFoodName());
            itemViewHolder.foodDescription.setText(menuList.get(position).getFoodDescription());
            itemViewHolder.foodPrice.setText(menuList.get(position).getFoodPrice());
        }
    }

    @Override
    public int getItemCount() {
        return menuList.size();
    }

    @Override
    public int getItemViewType(int position) {
        if (position == 0) {
            return TYPE_HEADER;
        }
        return TYPE_ITEM;
    }

    public class ItemViewHolder extends RecyclerView.ViewHolder {
        public ImageView foodImg;
        public TextView foodPrice;
        public TextView foodName;
        public TextView foodDescription;

        public ItemViewHolder(View view) {
            super(view);
            foodImg = itemView.findViewById(R.id.foodImage);
            foodName = itemView.findViewById(R.id.foodName);
            foodPrice = itemView.findViewById(R.id.foodPrice);
            foodDescription = itemView.findViewById(R.id.foodDescription);
        }
    }

    public class HeaderViewHolder extends RecyclerView.ViewHolder {
        TextView restaurantName;
        ImageView restaurantImg;

        public HeaderViewHolder(View view) {
            super(view);
            restaurantName = (TextView) view.findViewById(R.id.restaurantHeaderName);
            restaurantImg = (ImageView) view.findViewById(R.id.restaurantHeaderImage);

        }

    }

}
