package com.harshitkp.zesto_listview;

import android.widget.AdapterView;

/**
 * Created by Harshit Goel on 6/23/2017.
 */

public class Item{
    private String itemName;
    private int imageResourceId;
    private String itemPrice;
    private int itemQuantity;
    public Item(String iN,int iRI,String iP,int quantity){
        itemName=iN;
        itemQuantity=quantity;
        imageResourceId=iRI;
        itemPrice=iP;
    }
    public String getItemName(){
        return itemName;
    }
    public String getItemPrice(){
        return itemPrice;
    }
    public int getImageResourceId(){
        return imageResourceId;
    }
    public void setItemQuantity(int num) { itemQuantity = num; }
    public int getItemQuantity() { return itemQuantity; }
}
