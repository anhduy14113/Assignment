package com.example.duy.coffeeshop;

/**
 * Created by DUY on 5/27/2016.
 */
public class Data {
    String name;
    String quantity;
    public Data(String name, String number) {
        // TODO Auto-generated constructor stub
        this.name = name;
        this.quantity = number;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getQuantity() {
        return quantity;
    }
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

}
