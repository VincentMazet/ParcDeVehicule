package com.example.iem.parcvehicule.Entities;

/**
 * Created by iem on 19/10/2016.
 */
abstract class Vehicle {

    protected String motorType;
    protected String color;
    protected int nbWheel;

    protected String getMotorType(){
        return  motorType;
    }

    protected void setMotorType(String motorType) {
        this.motorType = motorType;
    }

    protected  String getColor(){
        return color;
    }

    protected void setColor(String color) {
        this.color = color;
    }

    protected int getNbWheel(){
        return nbWheel;
    }

    protected void setNbWheel(int nbWheel) {
        this.nbWheel = nbWheel;
    }
}
