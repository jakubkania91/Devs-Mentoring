package zaawansowane.lastExercisesAdvance.lastExercisesAdvance;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TankService {

    List<Tank> tankList = new ArrayList<>();
    List<Event> events = new ArrayList<>();

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

    public List<Tank> findAllEmptyTanks() {
        List<Tank> emptyTanks = new ArrayList<>();
        for (Tank tank : tankList) {
            if (tank.getWaterLevel() == 0) {
                emptyTanks.add(tank);
            }
        }
        return emptyTanks;
    }

    public void pourWater(Tank tank, int volume) {
        events.add(new Event(tank.getName(), "pourWater", volume, tank.pourWater(volume)));
    }

    public void pourOutWater(Tank tank, int volume) {
        events.add(new Event(tank.getName(), "pourOutWater", volume, tank.pourOutWater(volume)));
    }

    public void transferWater(Tank totank, Tank fromtank, int volume) {
        events.add(new Event(totank.getName(), "transferWater", volume, totank.transferWater(fromtank, volume)));
    }

    public String getMostOperation() {
        Map<String, Integer> operationsMap = new HashMap<>();
        for (int i = 0; i < events.size(); i++) {
            Event event = events.get(i);
            if (event.getOpertion().equals(type)) {
                if (operationsMap.containsKey(event.getTank())) {
                    Integer integer = operationsMap.get(event.getTank());
                    operationsMap.put(event.getTank(), ++integer);
                } else {
                    operationsMap.put(event.getTank(), 1);
                }
            }

        }
        return type;
    }
}

