package lesson10.Task2.cars;

public class Trucks extends Car{

    private int cargoCapacity;

    public Trucks(String carBrand, String model, String color, int yearOfManufacture, int cargoCapacity) {
        super(carBrand, model, color, yearOfManufacture);
        this.cargoCapacity = cargoCapacity;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public Trucks setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Trucks trucks = (Trucks) o;

        return cargoCapacity == trucks.cargoCapacity;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + cargoCapacity;
        return result;
    }

    @Override
    public String toString() {
        return "Trucks{" +
                "cargoCapacity=" + cargoCapacity +
                "} " + super.toString();
    }
}