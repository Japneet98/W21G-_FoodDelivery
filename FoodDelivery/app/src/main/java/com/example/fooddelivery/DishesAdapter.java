package com.example.fooddelivery;

import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class DishesAdapter  extends BaseAdapter {

    List<String> dishesList;

    List<String> dishesPrice;

    public DishesAdapter(List<String> dishesList, List<String> dishesPrice) {
        this.dishesList = dishesList;
        this.dishesPrice = dishesPrice;
    }

    @Override
    public int getCount() {
        return dishesList.size();
    }

    @Override
    public Object getItem(int i) {
        return dishesList.get(i);
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
                    .inflate(R.layout.dishlayout,
                            viewGroup,false);
        }
        TextView dishName = view.findViewById(R.id.dishName);
        TextView dishPrice = view.findViewById(R.id.dishPrice);



        dishName.setText(dishesList.get(i));
        dishPrice.setText("$"+dishesPrice.get(i));


        dishName.setGravity(Gravity.CENTER_VERTICAL | Gravity.LEFT);
        dishPrice.setGravity(Gravity.CENTER_VERTICAL | Gravity.RIGHT);



        return view;
    }
}
