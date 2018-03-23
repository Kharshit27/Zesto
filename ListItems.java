package com.harshitkp.zesto_listview;

import java.util.ArrayList;

/**
 * Created by Harshit Goel on 7/21/2017.
 */

public class ListItems {
    public static ArrayList<Item> itemList = new ArrayList<Item>();

    public void main() {
        itemList.add(new Item("Tikki", R.drawable.tikki, "₹15/-", 0));
        itemList.add(new Item("Bun Tikki", R.drawable.bun_tikki, "₹35/-", 0));
        itemList.add(new Item("Paani Batashe", R.drawable.pbatashe, "₹30/-", 0));
        itemList.add(new Item("Dahi Batashe", R.drawable.dbatashe, "₹35/-", 0));
        itemList.add(new Item("Papdi Chaat", R.drawable.pchaat, "₹40/-", 0));
        itemList.add(new Item("Spring Roll", R.drawable.spring_roll, "₹20/-", 0));
    }
}