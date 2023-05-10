package tematyka9.Task9;

public class Car extends Vehicle{
    public Car(String model, String brand, int year) {
        super(model, brand, year);
    }

    @Override
    public void drive() {
        System.out.println("Jezdzisz autem: ");
    }
}
