package tematyka9.Task9;

public abstract class Vehicle {
    private String model;
    private String brand;
    private int year;

    public Vehicle(String model,String brand, int year){
        this.model = model;
        this.brand= brand;
        this.year= year;
    }

    public void drive() {
    }
}

