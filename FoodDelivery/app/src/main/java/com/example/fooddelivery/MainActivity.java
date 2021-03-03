package com.example.fooddelivery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button signInBtn = findViewById(R.id.signInBtn);


        signInBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //here we start the second activity
                Intent myIntent = new Intent(MainActivity.this, Restaurants.class);
                startActivity(myIntent); //start activity with this intent -> start recipe activity
                //at this point control has gone to recipe activity object
            }
        });


    }
}