package tematyka6;


public class Car {
    public Car() {

    }

    public Car(String brand, String model, String color, int doors, int year) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
        this.doors = doors;

    }

    String brand;
    String model;
    String color;
    int year;
    int doors;

}
