package zaawansowane.lastExercisesAdvance;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Tank tank1 = new Tank("Tank 1", 100);
        Tank tank2 = new Tank("Tank 2", 200);
        System.out.println("\n");

        tank1.pourWater(50);
        tank1.pourWater(100);
        System.out.println("\n");

        tank2.pourWater(150);
        tank2.transferWater(tank1,50);
        System.out.println("\n");

        tank1.pourOutWater(30);
        tank2.pourOutWater(250);

        List<Tank>tanks = new ArrayList<>();

        tanks.add(new Tank("Tank 1", 100));
        tanks.add(new Tank("Tank 2", 200));
        tanks.add(new Tank("Tank 3", 150));

        tanks.get(0).pourWater(50);
        tanks.get(1).pourWater(150);
        tanks.get(2).pourWater(100);

        Tank tankWithMostWater = Tank.findTankWithMostWater(tanks);
        System.out.println("Tank with the most water: " + tankWithMostWater.name);

        Tank mostFilledTank = Tank.findMostFilledTank(tanks);
        System.out.println("Most filled tank: " + mostFilledTank.name);

        List<Tank> emptyTanks = Tank.findEmptyTank(tanks);
        System.out.println("Empty tanks:");

        for (Tank tank:emptyTanks) {
            System.out.println(tank.name);

        }
    }
}
