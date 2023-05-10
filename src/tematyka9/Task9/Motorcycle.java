package tematyka9.Task9;

public class Motorcycle extends Vehicle{
    public Motorcycle(String model, String brand, int year) {
        super(model, brand, year);
    }

    @Override
    public void drive() {
        System.out.println("Jezdzisz motocyklem: ");
    }
}
