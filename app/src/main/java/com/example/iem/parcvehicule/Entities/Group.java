package com.example.iem.parcvehicule.Entities;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by iem on 19/10/2016.
 */

public class Group {

    private String name;
    private List<Brand> volkswagenGroup = new ArrayList<>();

    public Group(String name, List<Brand> volkswagenGroup){
        this.name = name;
        this.volkswagenGroup = volkswagenGroup;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Brand> getVolkswagenGroup() {
        return volkswagenGroup;
    }

    public void setVolkswagenGroup(List<Brand> volkswagenGroup) {
        this.volkswagenGroup = volkswagenGroup;
    }
}
