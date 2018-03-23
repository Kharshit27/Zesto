package com.harshitkp.zesto_listview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import static android.os.Build.VERSION_CODES.M;

/**
 * Created by Harshit Goel on 6/23/2017.
 */

public class ItemAdapter extends ArrayAdapter<Item> {
    public ItemAdapter(Context mcontext, ArrayList<Item> itemList){
        super(mcontext,0,itemList);
    }
    @Override
    public View getView(int position, View convertView, final ViewGroup parent) {
        View listItemView=convertView;
        final Item currentItem=getItem(position);
        if(listItemView==null){
            listItemView= LayoutInflater.from(getContext()).inflate(R.layout.item_list_layout,parent,false);
        }
        TextView itemText=(TextView)listItemView.findViewById(R.id.item_text);
        itemText.setText(currentItem.getItemName());
        TextView priceText=(TextView)listItemView.findViewById(R.id.item_price_text);
        priceText.setText(currentItem.getItemPrice());
        ImageView itemImage=(ImageView)listItemView.findViewById(R.id.item_image);
        itemImage.setImageResource(currentItem.getImageResourceId());
        Button addToCartButton=(Button)listItemView.findViewById(R.id.add_to_cart_button);
        addToCartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(parent.getContext(),"Added to cart",Toast.LENGTH_SHORT).show();
                currentItem.setItemQuantity(10);
            }
        });
        return listItemView;
    }
}
