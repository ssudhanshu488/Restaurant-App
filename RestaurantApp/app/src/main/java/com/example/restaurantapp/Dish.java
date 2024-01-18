package com.example.restaurantapp;

import androidx.annotation.NonNull;

public class Dish {
    String title;
    String discription;
    int price;

    Dish(String title, String discription, int price){
        this.title = title;
        this.discription = discription;
        this.price = price;
    }

    @NonNull
    @Override
    public String toString() {
        return title;
    }
}
