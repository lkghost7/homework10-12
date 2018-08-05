package lesson10.Task2.cars;

public class Waggon extends Car {

    private String bodyType;

    public Waggon(String carBrand, String model, String color, int yearOfManufacture, String bodyType) {
        super(carBrand, model, color, yearOfManufacture);
        this.bodyType = bodyType;
    }

    public String getBodyType() {
        return bodyType;
    }

    public Waggon setBodyType(String bodyType) {
        this.bodyType = bodyType;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Waggon waggon = (Waggon) o;

        return bodyType != null ? bodyType.equals(waggon.bodyType) : waggon.bodyType == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (bodyType != null ? bodyType.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Waggon{" +
                "bodyType='" + bodyType + '\'' +
                "} " + super.toString();
    }
}