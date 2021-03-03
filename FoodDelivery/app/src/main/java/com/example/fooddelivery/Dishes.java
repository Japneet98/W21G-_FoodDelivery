package com.example.fooddelivery;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Dishes extends AppCompatActivity {

    List<String> dishesList=new ArrayList<String>();

    List<String> dishesPrice=new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dishes);

        Bundle bundle = getIntent().getExtras();

        String name=bundle.getString("name");

        if(name.equals("KFC")){

            dishesList.add("KFC Chicken nuggets");
            dishesList.add("KFC Chicken bites");

            dishesList.add("KFC Chicken boneless");

            dishesList.add("KFC Chicken fries");

            dishesList.add("KFC Chicken smoked");

            dishesPrice.add("1.46");
            dishesPrice.add("1.43");
            dishesPrice.add("1.99");
            dishesPrice.add("1.43");
            dishesPrice.add("1.32");


        }


        ListView dishListView = findViewById(R.id.dishListView);
        DishesAdapter dishesAdapter
                = new DishesAdapter(dishesList,dishesPrice);

        dishListView.setAdapter(dishesAdapter);



    }
}