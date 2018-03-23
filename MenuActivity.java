package com.harshitkp.zesto_listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MenuActivity extends AppCompatActivity {
    //public ArrayList<Item> itemList=new ArrayList<Item>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        /*itemList.add(new Item("Tikki",R.drawable.tikki,"₹15/-",0));
        itemList.add(new Item("Bun Tikki",R.drawable.bun_tikki,"₹35/-",0));
        itemList.add(new Item("Paani Batashe",R.drawable.pbatashe,"₹30/-",0));
        itemList.add(new Item("Dahi Batashe",R.drawable.dbatashe,"₹35/-",0));
        itemList.add(new Item("Papdi Chaat",R.drawable.pchaat,"₹40/-",0));
        itemList.add(new Item("Spring Roll",R.drawable.spring_roll,"₹20/-",0));
*/
        ListItems obj=new ListItems();
        obj.main();
        ItemAdapter adapter=new ItemAdapter(this,obj.itemList);
        ListView listView=(ListView)findViewById(R.id.items_list);
        listView.setAdapter(adapter);
    }
}
