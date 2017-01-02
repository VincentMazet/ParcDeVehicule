package com.example.iem.parcvehicule.Entities;

/**
 * Created by iem on 19/10/2016.
 */
public abstract class Vehicle {
    //TODO enum for type // Color // nbWheel

    protected String name;
    protected String motorType;
    protected Colors color;
    protected int nbWheel;

    protected String getName(){
        return  name;
    }

    protected String getMotorType(){
        return  motorType;
    }

    protected void setMotorType(String motorType) {
        this.motorType = motorType;
    }

    protected  Colors getColor(){
        return color;
    }

    protected void setColor(Colors color) {
        this.color = color;
    }

    protected int getNbWheel(){
        return nbWheel;
    }

    protected void setNbWheel(int nbWheel) {
        this.nbWheel = nbWheel;
    }
}
