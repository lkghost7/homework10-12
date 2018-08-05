package lesson10.Task2.cars;

public class Minibus extends Car {

    private int numberOfSeats;

    public Minibus(String carBrand, String model, String color, int yearOfManufacture, int numberOfSeats) {
        super(carBrand, model, color, yearOfManufacture);
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public Minibus setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Minibus minibus = (Minibus) o;

        return numberOfSeats == minibus.numberOfSeats;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + numberOfSeats;
        return result;
    }

    @Override
    public String toString() {
        return "Minibus{" +
                "numberOfSeats=" + numberOfSeats +
                "} " + super.toString();
    }
}