package com.example.iem.parcvehicule.Tests;

import com.example.iem.parcvehicule.Entities.Car;
import com.example.iem.parcvehicule.Entities.CarAccessories;
import com.example.iem.parcvehicule.Entities.Colors;
import com.example.iem.parcvehicule.Entities.Motorcycle;

import junit.framework.Assert;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by V on 02/01/2017.
 */
public class MotorcycleTest {

    @Test
    public void testMotoHeight() throws Exception {
        Motorcycle moto = new Motorcycle("testMoto","testMotor", Colors.RED, 4, null, 100);
        Assert.assertEquals(100, moto.getHeight());
    }

}