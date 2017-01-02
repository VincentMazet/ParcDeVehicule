package com.example.iem.parcvehicule.Entities;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by iem on 19/10/2016.
 */

public class Car extends Vehicle {

    private List<CarAccessories> carAccessoriesList = new ArrayList<>();
    private int nbDoors;

    public Car(String name, String motorType, Colors color, int nbWheel, List<CarAccessories> carAccessoriesList, int nbDoors){
        this.name = name;
        this.motorType = motorType;
        this.color = color;
        this.nbWheel = nbWheel;
        this.carAccessoriesList = carAccessoriesList;
        this.nbDoors = nbDoors;
    }

    public List<CarAccessories> getCarAccessoriesList(){
        return carAccessoriesList;
    }

    public void setCarAccessoriesList(List<CarAccessories> carAccessoriesList) {
        this.carAccessoriesList = carAccessoriesList;
    }

    public int getNbDoors(){
        return nbDoors;
    }

    public void setNbDoors(int nbDoors) {
        this.nbDoors = nbDoors;
    }
}
