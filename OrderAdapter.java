package com.harshitkp.zesto_listview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Harshit Goel on 7/14/2017.
 */

public class OrderAdapter extends ArrayAdapter<Item> {
    OrderAdapter(Context mcontext, ArrayList<Item> finalList){
        super(mcontext,0,finalList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View orderView = convertView;
        final Item currentItem = getItem(position);
        if(orderView==null){
            orderView = LayoutInflater.from(getContext()).inflate(R.layout.order_list_layout,parent,false);
        }
        if(currentItem.getItemQuantity()>0){
        TextView itemText=(TextView)orderView.findViewById(R.id.item_name);
        itemText.setText(currentItem.getItemName()); }
        return orderView;
    }
}
