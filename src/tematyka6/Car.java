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

    private String brand;
    private String model;
    private String color;
    private int year;
    private int doors;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public String getBrand() {
        return this.brand;
    }

    public String getModel() {
        return this.model;
    }

    public String getColor() {
        return this.color;
    }

    public int getYear() {
        return this.year;
    }

    public int getDoors() {
        return this.doors;

    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", doors=" + doors +
                '}';
    }
    @Override
    public boolean equals(Object object){
        if (this==object){
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        Car car = (Car) object;
        return brand.equals(car.getBrand()) && model.equals(car.getModel()) && color.equals(car.getColor()) && year==car.getYear() && doors==car.getDoors();

    }
}
