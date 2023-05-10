package tematyka8.exercises;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Bike bike = new Bike("Hawk", "mtb", true);
        Bike mountainBike = new MountainBike("SantaCruz", "Megatower", false, 150, 300);
        Bike roadBike = new RoadBike("Fox", "leaderfox", true, false);

       List<Bike> bikes = new ArrayList<>(List.of(bike, mountainBike, roadBike));

        for (Bike model : bikes) {
            System.out.println(model);
        }
        }
    }

