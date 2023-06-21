package zaawansowane.lastExercisesAdvance.lastExercisesAdvance;

import java.util.ArrayList;
import java.util.List;

public class TankService {

    List<Tank> tankList = new ArrayList<>();

    public List<Tank> getTankList() {
        return tankList;
    }


    public void addTank(Tank tank) {
        tankList.add(tank);
    }

    public Tank findFullesTank() {
        Tank tank = null;
        for (int i = 0; i < tankList.size(); i++) {
            Tank tank1 = tankList.get(i);
            if (tank == null || tank.getWaterLevel() < tank1.getWaterLevel()) {
                tank = tank1;
            }
        }
        return tank;
    }

    public Tank findMostFilled() {
        Tank tank = null;
        double percentage = 0;
        for (int i = 0; i < tankList.size(); i++) {
            Tank tank1 = tankList.get(i);
            double fillIndex = (double) tank1.getWaterLevel() / (double) tank1.getCapacity();
            if (tank == null || percentage < fillIndex) {
                tank = tank1;
                percentage = fillIndex;
            }


        }
        return tank;
    }
}
