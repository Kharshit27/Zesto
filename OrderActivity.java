package com.harshitkp.zesto_listview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Harshit Goel on 7/14/2017.
 */

public class OrderActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        /*ArrayList<Item> itemOrderList = new ArrayList<Item>();
        itemOrderList.add(new Item("Tikki",R.drawable.tikki,"₹15",0));
        itemOrderList.add(new Item("Bun Tikki",R.drawable.bun_tikki,"₹25",0));
        itemOrderList.add(new Item("Paani Batashe",R.drawable.pbatashe,"₹30",0));
        itemOrderList.add(new Item("Dahi Batashe",R.drawable.dbatashe,"₹35",0));
        itemOrderList.add(new Item("Papdi Chaat",R.drawable.pchaat,"₹40",0));
        itemOrderList.add(new Item("Spring Roll",R.drawable.tikki,"₹20",0));
*/
        ListItems obj=new ListItems();
        OrderAdapter adapter = new OrderAdapter(this, obj.itemList);
        ListView listView = (ListView)findViewById(R.id.orders_list);
        listView.setAdapter(adapter);
    }
}
