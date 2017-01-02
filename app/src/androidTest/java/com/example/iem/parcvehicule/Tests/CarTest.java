package com.example.iem.parcvehicule.Tests;

import com.example.iem.parcvehicule.Entities.Car;
import com.example.iem.parcvehicule.Entities.CarAccessories;
import com.example.iem.parcvehicule.Entities.Colors;

import junit.framework.Assert;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by V on 02/01/2017.
 */
public class CarTest {
    @Test
    public void testAccessories() throws Exception {

        List<CarAccessories> accessoriesList = new ArrayList<>();
        accessoriesList.add(CarAccessories.LEATHER_SEAT);
        accessoriesList.add(CarAccessories.OPEN_ROOF);
        Car car = new Car("testCar","testMotor", Colors.RED, 4, accessoriesList, 5);
        Assert.assertEquals(2, car.getCarAccessoriesList().size());
        Assert.assertEquals(CarAccessories.LEATHER_SEAT, car.getCarAccessoriesList().get(0));
    }

}