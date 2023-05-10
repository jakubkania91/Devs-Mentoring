package tematyka9.Task9;

public class Tram extends Vehicle{
    public Tram(String model, String brand, int year) {
        super(model, brand, year);
    }

    @Override
    public void drive() {
        System.out.println("Jezdzisz tramwajem");
    }
}
