package com.example.iem.parcvehicule.Management;

import com.example.iem.parcvehicule.Entities.Brand;
import com.example.iem.parcvehicule.Entities.Car;
import com.example.iem.parcvehicule.Entities.CarAccessories;
import com.example.iem.parcvehicule.Entities.Group;
import com.example.iem.parcvehicule.Entities.MotoAccessories;
import com.example.iem.parcvehicule.Entities.Motorcycle;
import com.example.iem.parcvehicule.Entities.Vehicle;

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

        List<Vehicle> voituresAudi = new ArrayList<>();
        Car audiA1 = new Car("60Ch", "Rouge", 4, carWithoutOptions, 3);
        Car audiA5 = new Car("235Ch", "jaune", 4, carAllOptions, 5);
        voituresAudi.add(audiA1);
        voituresAudi.add(audiA5);

        List<Vehicle> voituresSeat = new ArrayList<>();
        Car seatIbiza = new Car("145Ch", "Noire", 4, carWithoutOptions, 5);
        voituresSeat.add(seatIbiza);

        List<Vehicle> voituresBugatti = new ArrayList<>();
        Car bugattiVeyron = new Car("473Ch", "Dorée", 4, carAllOptions, 3);
        voituresBugatti.add(bugattiVeyron);

        List<Vehicle> voituresBentley = new ArrayList<>();
        Car bentleySpeed6 = new Car("300Ch", "Grise", 4, carAllOptions, 5);
        voituresBentley.add(bentleySpeed6);

        List<Vehicle> voituresVW = new ArrayList<>();
        Car vWGolf = new Car("120Ch", "Blanche", 4, carWithoutOptions, 3);
        voituresVW.add(vWGolf);

        List<MotoAccessories> motoWithoutOptions = new ArrayList<>();
        List<MotoAccessories> motoAllOptions = new ArrayList<>();
        motoAllOptions.add(MotoAccessories.COMFORT_SEAT);
        motoAllOptions.add(MotoAccessories.CUSTOM_EXHAUST);
        motoAllOptions.add(MotoAccessories.SPORT_TIRES);

        List<Vehicle> motoDucati = new ArrayList<>();
        Motorcycle ducatiMonster = new Motorcycle("150Ch","Rouge",2, motoAllOptions, 100);
        motoDucati.add(ducatiMonster);
        Motorcycle ducatiHyperStrada = new Motorcycle("100Ch","Rouge",2,motoWithoutOptions,105);
        motoDucati.add(ducatiHyperStrada);


        List<Brand> brandList = new ArrayList<>();
        Brand audi = new Brand("Audi", voituresAudi);
        brandList.add(audi);
        Brand seat = new Brand("Seat", voituresSeat);
        brandList.add(seat);
        Brand bugatti = new Brand("Bugatti", voituresBugatti);
        brandList.add(bugatti);
        Brand bentley = new Brand("Bentley", voituresBentley);
        brandList.add(bentley);
        Brand vw = new Brand("Volkswagen", voituresVW);
        brandList.add(vw);
        Brand ducati = new Brand("Ducati", motoDucati);
        brandList.add(ducati);

       this.vwGroup = new Group("VolkswagenGroup", brandList);
    }
}