package lesson10.Task2;

import lesson10.Task2.cars.Car;

import java.util.Map;

public class Garage {

    public static void toPark(Car car, Map<Car, Integer> garage) {
        if (getCountCar(car, garage) != 0) {
            garage.replace(car, getCountCar(car, garage) + 1);
            System.out.println("Еще одна машна " + car.getCarBrand() + car.getModel() + " зехала в гараж!");
        } else {
            garage.put(car, 1);
            System.out.println("Машина " + car.getCarBrand() + car.getModel() + " заехала в гараж!");
        }
    }

    public static void outFromGarage(Car car, Map<Car, Integer> garage) {
        if (getCountCar(car, garage) != 0) {
            garage.replace(car, garage.get(car) - 1);
            System.out.println("Машина " + car.getCarBrand() + car.getModel() + " выехала из гаража!");
            if (garage.get(car) == 0) {
                garage.remove(car);
                System.out.println("Таких машин как " + car.getCarBrand() + car.getModel() + " в гараже не осталось!");
            }
        } else {
            System.out.println("Таких машин как " + car.getCarBrand() + car.getModel() + " больше нет гараже!");
        }
    }

    public static int getCountCar(Car car, Map<Car, Integer> garage) {
        return garage.containsKey(car) ? garage.get(car) : 0;
    }

    static void getCountFromCarGarage(Map<Car, Integer> garage) {
        for (Car car : garage.keySet()) {
            System.out.println("количество машин в гараже " + car.getCarBrand() + car.getModel() + " - " + Garage.getCountCar(car, garage));
        }
    }
}