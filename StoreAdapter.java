package com.harshitkp.zesto_listview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Harshit Goel on 7/14/2017.
 */

public class StoreAdapter extends ArrayAdapter<Stores> {
    public StoreAdapter(Context mcontext, ArrayList<Stores> storesList){
        super(mcontext, 0, storesList);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listStoresView = convertView;
        Stores currentStore = getItem(position);
        if(listStoresView==null){
            listStoresView= LayoutInflater.from(getContext()).inflate(R.layout.stores_list_layout,parent,false);
        }
        TextView itemText=(TextView)listStoresView.findViewById(R.id.store_text);
        itemText.setText(currentStore.getStoreName());
        TextView priceText=(TextView)listStoresView.findViewById(R.id.address_text);
        priceText.setText(currentStore.getStoreAddress());
        ImageView itemImage=(ImageView)listStoresView.findViewById(R.id.store_image);
        itemImage.setImageResource(currentStore.getImgResourceID());
        return listStoresView;
    }
}
