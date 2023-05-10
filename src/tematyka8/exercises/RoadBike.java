package tematyka8.exercises;

public class RoadBike extends Bike{

    boolean skinnyTires;

    public RoadBike(String brand, String model, boolean areGears, boolean skinnyTires){
        super(brand,model,areGears);
        this.skinnyTires = skinnyTires;

    }

    @Override
    public String toString() {
        return "RoadBike{" +
                "skinnyTires=" + skinnyTires +
                '}';
    }
}
