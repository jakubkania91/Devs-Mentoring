package zaawansowane.lastExercisesAdvance.lastExercisesAdvance;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Tank tank1 = new Tank("Tank 1", 100);
        Tank tank2 = new Tank("Tank 2", 200);

        TankService tankService = new TankService();
        tankService.addTank(tank1);
        tankService.addTank(tank2);
        System.out.println(tankService.getTankList());

        tank1.pourWater(80);
        tank2.pourWater(150);
        Tank fullesTank = tankService.findFullesTank();
    }
}
