package com.example.fooddeliveryapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdaptorSpecial extends RecyclerView.Adapter<RecyclerView.ViewHolder>
{
    List<MenuItem> specialList;
    Specials special;
    public static Restaurant restaurant;


    public AdaptorSpecial(Specials inSpecial) {
        this.special = inSpecial;
        this.specialList = inSpecial.getSpecialList();
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // Here Inflating your recyclerview item layout
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.template_menu_item, parent, false);
        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final RecyclerView.ViewHolder holder, int position)
    {
        final ItemViewHolder itemViewHolder = (ItemViewHolder) holder;
        itemViewHolder.foodImg.setImageResource(specialList.get(position).getFoodImg());
        itemViewHolder.imgSource = specialList.get(position).getFoodImg();
        itemViewHolder.foodName.setText(specialList.get(position).getFoodName());
        itemViewHolder.foodDescription.setText(specialList.get(position).getFoodDescription());
        itemViewHolder.foodPrice.setText(specialList.get(position).getFoodPrice());
        itemViewHolder.cartCount.setText(specialList.get(position).getNum());
        if (specialList.get(position).getSpecial()) {
            itemViewHolder.special.setText("On Special!");
        }

    }

    @Override
    public int getItemCount() {
        return specialList.size();
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
            addButton = (Button)view.findViewById(R.id.plus);
            takeButton = (Button)view.findViewById(R.id.minus);
            special = itemView.findViewById(R.id.special);

            addButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view){
                    MenuItem item = RestaurantStructure.get().findMenuItem(foodName.getText().toString());

                    item.incrementNum();

                    int count = Integer.parseInt(item.getNum());

                    cartCount.setText(String.valueOf(count));
                }

                //Make a call, send the information to the Order List
            });

            takeButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view){

                    MenuItem item = RestaurantStructure.get().findMenuItem(foodName.getText().toString());

                    int count = Integer.parseInt(item.getNum());

                    if(count > 0) {
                        item.decreaseNum();
                        count = Integer.parseInt(item.getNum());
                    }

                    cartCount.setText(String.valueOf(count));
                }
            });
        }
    }
}
