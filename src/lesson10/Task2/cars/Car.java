package lesson10.Task2.cars;

public abstract class Car {

    private String carBrand;
    private String model;
    private int yearOfManufacture;
    private String color;

    public Car(String carBrand, String model, String color, int yearOfManufacture) {
        this.carBrand = carBrand;
        this.model = model;
        this.color = color;
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public Car setCarBrand(String carBrand) {
        this.carBrand = carBrand;
        return this;
    }

    public String getModel() {
        return model;
    }

    public Car setModel(String model) {
        this.model = model;
        return this;
    }

    public String getColor() {
        return color;
    }

    public Car setColor(String color) {
        this.color = color;
        return this;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public Car setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (yearOfManufacture != car.yearOfManufacture) return false;
        if (carBrand != null ? !carBrand.equals(car.carBrand) : car.carBrand != null) return false;
        if (model != null ? !model.equals(car.model) : car.model != null) return false;
        return color != null ? color.equals(car.color) : car.color == null;
    }

    @Override
    public int hashCode() {
        int result = carBrand != null ? carBrand.hashCode() : 0;
        result = 31 * result + (model != null ? model.hashCode() : 0);
        result = 31 * result + (color != null ? color.hashCode() : 0);
        result = 31 * result + yearOfManufacture;
        return result;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carBrand='" + carBrand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", yearOfManufacture=" + yearOfManufacture +
                '}';
    }
}