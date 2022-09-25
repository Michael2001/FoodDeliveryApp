package com.example.fooddeliveryapp;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

public class AdaptorOrders extends RecyclerView.Adapter<AdaptorOrders.MyViewHolder>
{
    public static OrderStructure dataHolder;

    public AdaptorOrders(OrderStructure dataHolder)
    {
        this.dataHolder = dataHolder;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.template_order_default,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position)
    {
        holder.orderImage.setImageResource(dataHolder.get(position).getPersonImg());
        holder.userEmail.setText(dataHolder.get(position).getUseremail());
        holder.orderDate.setText(dataHolder.get(position).getOrderDate());
        holder.orderTotal.setText(dataHolder.get(position).returnPrice());
        holder.itemView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                AppCompatActivity activity = (AppCompatActivity) view.getContext();
                FragmentOrders fragmentOrders = new FragmentOrders(dataHolder.get(position));
                activity.getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, fragmentOrders).addToBackStack(null).commit();
            }
        });
    }

    @Override
    public int getItemCount() {
        return dataHolder.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder  {
        public ImageView orderImage;
        public TextView userEmail;
        public TextView orderDate;
        public TextView orderTotal;

        public MyViewHolder(View view) {
            super(view);
            orderImage = itemView.findViewById(R.id.orderImg);
            userEmail = itemView.findViewById(R.id.userEmail);
            orderDate = itemView.findViewById(R.id.orderDate);
            orderTotal = itemView.findViewById(R.id.orderTotal);
        }
    }
}
