package tematyka8.exercises;

public class Bike {

    private String brand;
    private String model;
    private boolean areGears;

    public Bike(String brand, String model, boolean areGears) {
        this.brand = brand;
        this.model = model;
        this.areGears = areGears;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", areGears=" + areGears +
                '}';
    }
}
