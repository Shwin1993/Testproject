package com.example.administrator.testproject6;

/**
 * Created by Administrator on 2016/12/28.
 */

public class Fruit {
    private String name;
    private int imgeID;

    public Fruit(String name, int imgeID) {
        this.name = name;
        this.imgeID = imgeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImgeID() {
        return imgeID;
    }

    public void setImgeID(int imgeID) {
        this.imgeID = imgeID;
    }
}
