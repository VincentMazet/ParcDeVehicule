package com.example.iem.parcvehicule.Management;

import com.example.iem.parcvehicule.Entities.Brand;
import com.example.iem.parcvehicule.Entities.Car;
import com.example.iem.parcvehicule.Entities.CarAccessories;
import com.example.iem.parcvehicule.Entities.Colors;
import com.example.iem.parcvehicule.Entities.Group;
import com.example.iem.parcvehicule.Entities.MotoAccessories;
import com.example.iem.parcvehicule.Entities.Motorcycle;
import com.example.iem.parcvehicule.Entities.Vehicle;
import com.example.iem.parcvehicule.Entities.VehicleType;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by iem on 19/10/2016.
 */
public class Init {
    private volatile Init ourInstance;

    private Group vwGroup;

    public Init getInstance() {
     Init initLocal = ourInstance;

        if(initLocal == null){
            synchronized (this){
                initLocal = ourInstance;
                if(initLocal == null){
                    ourInstance = initLocal = new Init();
                }
            }
        }
        return initLocal;
    }

    private Init() {

        List<CarAccessories> carWithoutOptions = new ArrayList<>();
        List<CarAccessories> carAllOptions = new ArrayList<>();
        carAllOptions.add(CarAccessories.LEATHER_SEAT);
        carAllOptions.add(CarAccessories.OPEN_ROOF);
        carAllOptions.add(CarAccessories.SPORT_DECO);

        AbstractFactory factory = AbstractFactory.getFactory(FactoryTypes.DAO);

        List<Vehicle> carsAudi = new ArrayList<>();
        Car audiA1 = new Car("A1", "60Ch", Colors.RED, 4, carWithoutOptions, 3);
        Car audiA5 = new Car("A5", "235Ch", Colors.GREEN, 4, carAllOptions, 5);
        carsAudi.add(audiA1);
        carsAudi.add(audiA5);

        carsAudi.addAll(factory.buildVehicles(28, VehicleType.CAR, "R8", null));

        List<Vehicle> carsSeat = new ArrayList<>();
        Car seatIbiza = new Car("IBIZA", "145Ch", Colors.BLACK, 4, carWithoutOptions, 5);
        carsSeat.add(seatIbiza);

        List<Vehicle> carsBugatti = new ArrayList<>();
        Car bugattiVeyron = new Car("Veyron", "473Ch", Colors.GREEN, 4, carAllOptions, 3);
        carsBugatti.add(bugattiVeyron);

        List<Vehicle> carsBentley = new ArrayList<>();
        Car bentleySpeed6 = new Car("Speed 6", "300Ch", Colors.WHITE, 4, carAllOptions, 5);
        carsBentley.add(bentleySpeed6);

        List<Vehicle> carsVW = new ArrayList<>();
        Car vWGolf = new Car("GOLF", "120Ch", Colors.GREY, 4, carWithoutOptions, 3);
        carsVW.add(vWGolf);

        List<MotoAccessories> motoWithoutOptions = new ArrayList<>();
        List<MotoAccessories> motoAllOptions = new ArrayList<>();
        motoAllOptions.add(MotoAccessories.COMFORT_SEAT);
        motoAllOptions.add(MotoAccessories.CUSTOM_EXHAUST);
        motoAllOptions.add(MotoAccessories.SPORT_TIRES);

        List<Vehicle> motoDucati = new ArrayList<>();
        Motorcycle ducatiMonster = new Motorcycle("Monstro", "150Ch",Colors.RED,2, motoAllOptions, 100);
        motoDucati.add(ducatiMonster);
        Motorcycle ducatiHyperStrada = new Motorcycle("HyperStrada", "100Ch",Colors.RED,2,motoWithoutOptions,105);
        motoDucati.add(ducatiHyperStrada);
        motoDucati.addAll(factory.buildVehicles(8, VehicleType.MOTORCYCLE, "1199 Superleggera ", Colors.RED));



        List<Brand> brandList = new ArrayList<>();
        Brand audi = new Brand("Audi", carsAudi);
        brandList.add(audi);
        Brand seat = new Brand("Seat", carsSeat);
        brandList.add(seat);
        Brand bugatti = new Brand("Bugatti", carsBugatti);
        brandList.add(bugatti);
        Brand bentley = new Brand("Bentley", carsBentley);
        brandList.add(bentley);
        Brand vw = new Brand("Volkswagen", carsVW);
        brandList.add(vw);
        Brand ducati = new Brand("Ducati", motoDucati);
        brandList.add(ducati);

        this.vwGroup = new Group("VolkswagenGroup", brandList);


    }
}