package com.example.iem.parcvehicule.Entities;

/**
 * Created by V on 02/01/2017.
 */

public enum Colors {
    RED(1),
    BLUE(2),
    GREEN(3),
    GREY(4),
    WHITE(5),
    BLACK(6);

    private final int id;

    Colors(int id) { this.id = id; }

    public int getValue() { return id; }

    public static Colors getColorById(int id){
        for(Colors color : Colors.values()){
            if (color.id == id){
                return color;
            }
        }
        return null;
    }
}
