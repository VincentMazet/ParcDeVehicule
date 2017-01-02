package com.example.iem.parcvehicule.Management;

import com.example.iem.parcvehicule.Entities.Car;
import com.example.iem.parcvehicule.Entities.Colors;
import com.example.iem.parcvehicule.Entities.Motorcycle;
import com.example.iem.parcvehicule.Entities.Vehicle;
import com.example.iem.parcvehicule.Entities.VehicleType;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by V on 02/01/2017.
 */

public class DaoFactory extends AbstractFactory {
    @Override
    public List<Vehicle> buildVehicles(int numberToCreate, VehicleType type, String name, Colors color) {

        List<Vehicle> vehicles = new ArrayList<>();

        if(color == null){
            Random random = new Random();

            int randomColor = random.nextInt(Colors.values().length) + 1;
            color = Colors.getColorById(randomColor);
        }

        for(int i = 0; i <= numberToCreate; i++){
            switch (type){
                case CAR:
                    vehicles.add(new Car(name, null, color, 4, null, 3));
                    break;
                case MOTORCYCLE:
                    vehicles.add(new Motorcycle(name, null, color,2, null, 100));
                    break;
                default:
                    break;
            }
        }

        return null;
    }
}
