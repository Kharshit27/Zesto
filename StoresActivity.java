package com.harshitkp.zesto_listview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Harshit Goel on 7/14/2017.
 */

public class StoresActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stores);
        ArrayList<Stores> storesList = new ArrayList<Stores>();
        storesList.add(new Stores("ABC","abc123",R.drawable.kp));
        storesList.add(new Stores("DEF","def456",R.drawable.kp));
        storesList.add(new Stores("GHI","ghi789",R.drawable.kp));
        storesList.add(new Stores("JKL","jkl123",R.drawable.kp));
        storesList.add(new Stores("MNO","mno456",R.drawable.kp));

        StoreAdapter adapter=new StoreAdapter(this,storesList);
        ListView listView=(ListView)findViewById(R.id.stores_list);
        listView.setAdapter(adapter);
    }
}
