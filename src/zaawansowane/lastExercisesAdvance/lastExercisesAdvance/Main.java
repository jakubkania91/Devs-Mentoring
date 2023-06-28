package zaawansowane.lastExercisesAdvance.lastExercisesAdvance;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Tank tank1 = new Tank("Tank 1", 100);
        Tank tank2 = new Tank("Tank 2", 200);
        Tank tank3 = new Tank("Tank 3", 0);
        Tank tank4 = new Tank("Tank 4", 0);

        TankService tankService = new TankService();
        tankService.addTank(tank1);
        tankService.addTank(tank2);
        tankService.addTank(tank3);
        tankService.addTank(tank4);
        System.out.println(tankService.getTankList());

        tankService.pourWater(tank1,20);
        tankService.pourOutWater(tank1, 30);
        tankService.transferWater(tank2,tank1,70);
        tankService.transferWater(tank3,tank2,100);
        Tank fullesTank = tankService.findFullesTank();

        tankService.getMostOperation()
        List<Tank>emptyTanks = tankService.findAllEmptyTanks();
        for (Tank tank:emptyTanks) {
            System.out.println("Empty " + tank.getName() + " with capacity: " + tank.getCapacity());

        }
    }
}
