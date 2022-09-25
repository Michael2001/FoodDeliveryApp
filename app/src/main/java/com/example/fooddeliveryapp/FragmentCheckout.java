package com.example.fooddeliveryapp;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Date;

public class FragmentCheckout extends Fragment {

    private Cart cart;
    private User user;
    private UserDBModel userDBModel;

    public FragmentCheckout(User user) {
        this.user = user;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        cart = new Cart();
        View view = inflater.inflate(R.layout.template_cart, container, false);
        RecyclerView recyclerView = view.findViewById(R.id.checkoutRecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false));
        recyclerView.setAdapter(new AdaptorCart(cart));

        userDBModel = new UserDBModel();
        userDBModel.load(getContext());

        Button checkoutButton = (Button)view.findViewById(R.id.checkout);

        checkoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                //Create an order with the current userName and date
                Date date = new Date();
                SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yy");
                String dateStr = formatter.format(date);
                if (cart!=null){
                    //get current User, and pass user to the order
                    Order newOrder = new Order(user.getEmail(),dateStr,cart.getCartItems());
                    FragmentUserOrders.getUserOrders().add(newOrder);

                    String userOrders = objToString(FragmentUserOrders.getUserOrders());

                    userDBModel.updateUser(FragmentLogin.USER.getId(), FragmentLogin.USER.getEmail(), FragmentLogin.USER.getPassword(), userOrders);

                }
            }
        });

        return view;
    }

    private String objToString(Serializable orderStructure)  {
        try{
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream( baos );
            oos.writeObject(orderStructure);
            oos.close();
            return Base64.getEncoder().encodeToString(baos.toByteArray());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}