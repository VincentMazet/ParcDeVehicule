package com.example.iem.parcvehicule.Entities;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by iem on 19/10/2016.
 */

public class Group {

    private String name;
    private List<Brand> brandList = new ArrayList<>();

    public Group(String name, List<Brand> brandList){
        this.name = name;
        this.brandList = brandList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Brand> getBrandList() {
        return brandList;
    }

    public void setBrandList(List<Brand> brandList) {
        this.brandList = brandList;
    }
}
