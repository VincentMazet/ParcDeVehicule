package com.example.iem.parcvehicule.Entities;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by iem on 19/10/2016.
 */

public class Motorcycle extends Vehicle {

    private List<MotoAccessories> motoAccessoriesList = new ArrayList<>();
    private int height;

    public Motorcycle(String name, String motorType, Colors color, int nbWheel, List<MotoAccessories> motoAccessoriesList, int height){
        this.name = name;
        this.motorType = motorType;
        this.color = color;
        this.nbWheel = nbWheel;
        this.motoAccessoriesList = motoAccessoriesList;
        this.height = height;
    }

    public List<MotoAccessories> getMotoAccessoriesList() {
        return motoAccessoriesList;
    }

    public void setMotoAccessoriesList(List<MotoAccessories> motoAccessoriesList) {
        this.motoAccessoriesList = motoAccessoriesList;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
