package com.example.fooddeliveryapp;

public class User {
    private String id;
    private String email;
    private String password;
    private OrderStructure orders;

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public OrderStructure getOrders() { return orders; }

    public void setId(String id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setOrders(OrderStructure orders) {this.orders = orders; }

    public void addOrder(Order order) {
        if(getOrders() == null) {
            setOrders(new OrderStructure());
        }
        getOrders().add(order);
    }

}
