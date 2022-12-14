package com.example.fooddeliveryapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdaptorCart extends RecyclerView.Adapter<RecyclerView.ViewHolder>
{
    List<MenuItem> cartList;
    Cart cart;


    public AdaptorCart(Cart inCart) {
        this.cart = inCart;
        this.cartList = inCart.getCartItems();
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
        itemViewHolder.foodImg.setImageResource(cartList.get(position).getFoodImg());
        itemViewHolder.imgSource = cartList.get(position).getFoodImg();
        itemViewHolder.foodName.setText(cartList.get(position).getFoodName());
        itemViewHolder.foodDescription.setText(cartList.get(position).getFoodDescription());
        itemViewHolder.foodPrice.setText(cartList.get(position).getFoodPrice());
        itemViewHolder.cartCount.setText(cartList.get(position).getNum());

        if (cartList.get(position).getSpecial()){
            itemViewHolder.special.setText("On Special!");
        }
        else
        {
            itemViewHolder.special.setText("Regular Price");
        }

    }

    @Override
    public int getItemCount() {
        return cartList.size();
    }


    public class ItemViewHolder extends RecyclerView.ViewHolder {
        public ImageView foodImg;
        public TextView foodPrice;
        public TextView foodName;
        public TextView foodDescription;
        public TextView cartCount;
        public Button addButton;
        public Button takeButton;
        public int imgSource;
        public TextView special;


        public ItemViewHolder(View view) {
            super(view);
            imgSource = 0;
            foodImg = itemView.findViewById(R.id.foodImage);
            foodName = itemView.findViewById(R.id.foodName);
            foodPrice = itemView.findViewById(R.id.foodPrice);
            foodDescription = itemView.findViewById(R.id.foodDescription);
            cartCount = itemView.findViewById(R.id.count);
            addButton = itemView.findViewById(R.id.plus);
            takeButton = itemView.findViewById(R.id.minus);
            special = itemView.findViewById(R.id.special);

            addButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    MenuItem item = RestaurantStructure.get().findMenuItem(foodName.getText().toString());

                    item.incrementNum();

                    int count = Integer.parseInt(item.getNum());

                    cartCount.setText(String.valueOf(count));
                }

                //Make a call, send the information to the Order List
            });

            takeButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    MenuItem item = RestaurantStructure.get().findMenuItem(foodName.getText().toString());

                    int count = Integer.parseInt(item.getNum());

                    if (count > 0) {
                        item.decreaseNum();
                        count = Integer.parseInt(item.getNum());
                    }

                    cartCount.setText(String.valueOf(count));
                }
            });
        }
    }
}
