package com.example.fooddelivery;

import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class RestaurantAdapter extends BaseAdapter {

    List<String> restaurantsList;

    public RestaurantAdapter(List<String> restaurantsList) {

        this.restaurantsList = restaurantsList;
    }

    @Override
    public int getCount() {
        return restaurantsList.size();
    }

    @Override
    public Object getItem(int i) {
        return restaurantsList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        // return null;
        if (view == null){
            view = LayoutInflater.from(viewGroup.getContext())
                    .inflate(R.layout.reslayout,
                            viewGroup,false);
        }
        TextView resName = view.findViewById(R.id.resName);
        //TextView textPrice = view.findViewById(R.id.textPrice);



        resName.setText(restaurantsList.get(i));
        //textPrice.setText("$"+themePrice.get(i));

        resName.setGravity(Gravity.CENTER_VERTICAL | Gravity.LEFT);



        //checks if the current View index i corresponds to currentplay song index
//        if (i == CurrentPlayInd){
//
//            imgViewPlayStop.setImageResource(R.drawable.stop);
//        } else{
//            imgViewPlayStop.setImageResource(R.drawable.play);
//        }
        return view;
    }
}
