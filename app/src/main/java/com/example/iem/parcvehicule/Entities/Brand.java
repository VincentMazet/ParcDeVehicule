package com.example.iem.parcvehicule.Entities;

import android.graphics.drawable.Drawable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by iem on 19/10/2016.
 */

public class Brand {

    private String name;
    private List<Vehicle> vehicleList = new ArrayList<>();

    public Brand(String name, List<Vehicle> vehicleList){
        this.name = name;
        this.vehicleList = vehicleList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Vehicle> getVehicleList() {
        return vehicleList;
    }

    public void setVehicleList(List<Vehicle> vehicleList) {
        this.vehicleList = vehicleList;
    }
}
