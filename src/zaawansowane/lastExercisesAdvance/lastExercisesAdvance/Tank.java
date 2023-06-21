package zaawansowane.lastExercisesAdvance.lastExercisesAdvance;

import java.util.ArrayList;
import java.util.List;

public class Tank {
    final String name;
    private final int capacity;
    private int waterLevel;


    @Override
    public String toString() {
        return "Tank{" +
                "name='" + name + '\'' +
                ", capacity=" + capacity +
                ", waterLevel=" + waterLevel +
                '}';
    }

    public int getCapacity() {
        return capacity;
    }

    public int getWaterLevel() {
        return waterLevel;
    }

    public Tank(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.waterLevel = 0;
    }

    public void pourWater(int volume) {
        if (volume + waterLevel < capacity) {
            waterLevel += volume;
            System.out.println("Added " + volume + " units of water to " + name + ". Current water level: " + waterLevel);
        } else {
            System.out.println("Nie można dodać takiej ilości wody");
        }

    }

    public void pourOutWater(int volume) {
        if (volume > waterLevel) {
            System.out.println("Nie ma tyle wody w zbiorniku");
        } else {
            waterLevel -= volume;
            System.out.println("Odlales " + volume + " wody");
        }

    }

    public void transferWater(Tank from, int volume) {
        if (from.getWaterLevel() < volume) {
            System.out.println("W zbiorniku jest za mało wody do przelania");
        } else if (waterLevel + volume > capacity) {
            System.out.println("W zbiorniku jest za dużo wody");
        } else {
            pourWater(volume);
            from.pourOutWater(volume);
            System.out.println("Udalo sie przetrasferowac wode");
        }
    }
}