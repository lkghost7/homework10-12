package lesson10.Task2;

import lesson10.Task2.cars.*;

import java.util.HashMap;
import java.util.Map;

public class Demo {

    public static void main(String[] args) {
        Car fordTranzit = new Minibus("Ford", "Tranzit", "Red", 2010, 12);
        Car fiatDucato = new Minibus("Fiat", "Ducato", "White", 2002, 10);
        Car manF90 = new Waggon("Man", "F90", "Blue", 2009, "Jumbo");
        Car maz5440 = new Trucks("Maz", "5440", "Orange", 1999, 25);
        Car audiA3 = new PassengerCar("Audi", "A3", "Black", 2012, "Hatchback");
        Map<Car, Integer> garage = new HashMap<>();
        Garage.toPark(fiatDucato, garage);
        Garage.toPark(manF90, garage);
        Garage.toPark(manF90, garage);
        Garage.toPark(maz5440, garage);
        Garage.toPark(audiA3, garage);
        Garage.toPark(fordTranzit, garage);
        Garage.toPark(fordTranzit, garage);
        Garage.outFromGarage(audiA3, garage);
        Garage.outFromGarage(audiA3, garage);
        Garage.getCountFromCarGarage(garage);
    }
}