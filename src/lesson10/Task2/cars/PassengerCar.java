package lesson10.Task2.cars;

public class PassengerCar extends Car {

    private String typeOfCar;

    public PassengerCar(String carBrand, String model, String color, int yearOfManufacture, String typeOfCar) {
        super(carBrand, model, color, yearOfManufacture);
        this.typeOfCar = typeOfCar;
    }

    public String getTypeOfCar() {
        return typeOfCar;
    }

    public PassengerCar setTypeOfCar(String typeOfCar) {
        this.typeOfCar = typeOfCar;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        PassengerCar that = (PassengerCar) o;

        return typeOfCar != null ? typeOfCar.equals(that.typeOfCar) : that.typeOfCar == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (typeOfCar != null ? typeOfCar.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "PassengerCar{" +
                "typeOfCar='" + typeOfCar + '\'' +
                "} " + super.toString();
    }
}