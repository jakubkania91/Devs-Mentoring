package zaawansowane.lastExercisesAdvance.lastExercisesAdvance;

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

    public String getName(){
        return name;
    }

    public Tank(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.waterLevel = 0;
    }

    public boolean pourWater(int volume) {
        if (volume + waterLevel < capacity) {
            waterLevel += volume;
            System.out.println("Added " + volume + " units of water to " + name + ". Current water level: " + waterLevel);
            return true;
        } else {
            System.out.println("Nie można dodać takiej ilości wody");
            return false;
        }

    }

    public boolean pourOutWater(int volume) {
        if (volume > waterLevel) {
            System.out.println("Nie ma tyle wody w zbiorniku");
            return false;
        } else {
            waterLevel -= volume;
            System.out.println("Odlales " + volume + " wody");
            return true;
        }
    }

    public boolean transferWater(Tank from, int volume) {
        if (from.getWaterLevel() < volume) {
            System.out.println("W zbiorniku jest za mało wody do przelania");
            return false;
        } else if (waterLevel + volume > capacity) {
            System.out.println("W zbiorniku jest za dużo wody");
            return false;
        } else {
            pourWater(volume);
            from.pourOutWater(volume);
            System.out.println("Udalo sie przetrasferowac wode");
            return true;
        }
    }
}
