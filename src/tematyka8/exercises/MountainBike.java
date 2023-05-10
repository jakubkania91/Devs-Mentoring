package tematyka8.exercises;

public class MountainBike extends Bike{
    public Integer frontTravel;
    public Integer realTravel;

    public MountainBike(String brand, String model, boolean areGears, Integer frontTravel, Integer realTravel) {
        super(brand,model,areGears);
        this.frontTravel = frontTravel;
        this.realTravel = realTravel;

    }

    @Override
    public String toString() {
        return "MountainBike{" +
                "frontTravel=" + frontTravel +
                ", realTravel=" + realTravel +
                '}';
    }
}
