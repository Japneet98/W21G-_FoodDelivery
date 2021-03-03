package com.example.fooddelivery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Restaurants extends AppCompatActivity {

    List<String> restaurantList = new ArrayList<>(Arrays.asList("KFC",
            "MC Donalds", "Seven Eleven","Nandos","Freshi","Panago Pizza"));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurants);

        ListView listView = findViewById(R.id.listView);
        RestaurantAdapter restaurantAdapter
                = new RestaurantAdapter(restaurantList);

        listView.setAdapter(restaurantAdapter);
        listView.setOnItemClickListener(
                (AdapterView<?> adapterView, View view, int i, long l) -> {

                    //ketan code

                    //  int index = listViewThemes.getSelectedItemPosition();
                    Intent myResults = new Intent( Restaurants.this,Dishes.class);



                    Bundle bundle = new Bundle();
                    //  Bitmap image4=null;
                        myResults.putExtra("name",restaurantList.get(i));






                    //  bundle.putParcelable("image", image4);
                    myResults.putExtras(bundle);
                    startActivity(myResults);
                    //Create a bundle object with all the data
//                    bundle.putInt("NUMTIX",numTix);
//                    bundle.putString("TYPE",spinnerConcertType.getSelectedItem().toString());
//                    bundle.putDouble("COST",cost);
//                    bundle.putString("Gender",genderSp.getSelectedItem().toString());



                    //Put bundle object into the intent object

                    //start the next activity



                    //ketan code



                });








    }
}