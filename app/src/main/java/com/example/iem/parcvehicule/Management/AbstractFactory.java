package com.example.iem.parcvehicule.Management;

import com.example.iem.parcvehicule.Entities.Colors;
import com.example.iem.parcvehicule.Entities.Vehicle;
import com.example.iem.parcvehicule.Entities.VehicleType;

import java.util.List;

import static com.example.iem.parcvehicule.Management.FactoryTypes.DAO;

/**
 * Created by V on 02/01/2017.
 */

public abstract class AbstractFactory{

    public abstract List<Vehicle> buildVehicles(int numberToCreate, VehicleType type, String name, Colors color);

    public static AbstractFactory getFactory(FactoryTypes type){
        // wanted to use java8 with an Enum Handler in order to avoid switch
        // seems not implemented now in android sdk
        switch(type){
            case DAO:
                return new DaoFactory();
            case JSON:
                return new JsonFactory();
            case XML:
                return new XMLFactory();
            default:
                return null;
        }
    }
}
