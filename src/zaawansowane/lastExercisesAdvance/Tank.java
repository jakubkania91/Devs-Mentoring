package zaawansowane.lastExercisesAdvance;

import java.util.ArrayList;
import java.util.List;

public class Tank {
    final String name;
    private final int capacity;
    private int waterLevel;

    public Tank(String name, int capacity){
        this.name = name;
        this.capacity = capacity;
        this.waterLevel = 0;
    }
    public void pourWater(int volume){
        int availableSpace = capacity - waterLevel;
        int pouredWater = Math.min(volume, availableSpace);
        waterLevel+=pouredWater;
        System.out.println("Added " + pouredWater + " units of water to " + name + ". Current water level: " + waterLevel);
    }
    public void pourOutWater(int volume){
        int castWater = Math.min(volume, waterLevel);
        waterLevel-= castWater;
        System.out.println("Casted " + castWater + " units of water from " + name + ". Current water level: " + waterLevel);
    }
    public void transferWater(Tank from, int volume){
        int transferableWater = Math.min(volume, from.waterLevel);
        from.waterLevel -= transferableWater;
        waterLevel+=transferableWater;
        System.out.println("Transferres " + transferableWater + " units of water from " + from.name + " to " + name);
        System.out.println("Current water level in " + name + ": " + waterLevel);
        System.out.println("Current water level in " + from.name + ": " + from.waterLevel);
    }
    public static Tank findTankWithMostWater(List<Tank>tanks){
        Tank tankWithMostWater = tanks.get(0);

        for (Tank tank:tanks) {
            if (tank.waterLevel > tankWithMostWater.waterLevel){
                tankWithMostWater=tank;
            }

        }
        return tankWithMostWater;
    }
    public static Tank findMostFilledTank(List<Tank>tanks){
        Tank mostFilleTank = tanks.get(0);

        for (Tank tank:tanks) {
            double fillPercentage = (double) tank.waterLevel/tank.capacity;
            double mostFilledPecentage = (double) mostFilleTank.waterLevel / mostFilleTank.capacity;

            if (fillPercentage > mostFilledPecentage){
                mostFilleTank=tank;
            }
        }
        return mostFilleTank;
    }
    public static List<Tank> findEmptyTank(List<Tank> tanks){
        List<Tank> emptyTanks = new ArrayList<>();

        for (Tank tank: tanks) {
            if (tank.waterLevel == 0){
                emptyTanks.add(tank);
            }

        }
        return emptyTanks;
    }
}
