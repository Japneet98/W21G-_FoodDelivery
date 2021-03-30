package com.example.briskdelivery;

import android.database.Cursor;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;


public class OrderDetail extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_order_detail, container, false);
    }

    public void LoadOrderDetail(Orders orders){
        TextView ftvRestName = (TextView) getActivity().findViewById(R.id.ftvRestName);
        ftvRestName.setText(orders.toString());

        com.example.briskdelivery.DatabaseHelper dbh = new com.example.briskdelivery.DatabaseHelper(super.getContext());
        Cursor c = dbh.viewItems(orders.orderId);

        if(c.getCount() > 0){
            TextView items = (TextView) getActivity().findViewById(R.id.ftvItem);
            StringBuilder sb = new StringBuilder();
            while (c.moveToNext()){
                 sb.append(c.getString(0) + " Qty. " + c.getInt(1)+ "\n");
            }
            items.setText("Order Items\n"+sb);
        }
    }

}
