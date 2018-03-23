package com.harshitkp.zesto_listview;

/**
 * Created by Harshit Goel on 7/14/2017.
 */

public class Stores {
    private String storeName;
    private String storeAddress;
    private int imgResourceID;
    public Stores(String name,String address, int imgId) {
        storeName=name;
        storeAddress=address;
        imgResourceID=imgId;
    }
    public String getStoreName(){
        return storeName;
    }
    public String getStoreAddress(){
        return storeAddress;
    }
    public int getImgResourceID(){
        return imgResourceID;
    }
}
