package zaawansowane.lastExercisesAdvance.lastExercisesAdvance;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import java.util.SplittableRandom;

public class Event {

    private String tank;
    private String opertion;
    private double volume;
    private boolean isOpertaionSuccessFull;
    private LocalDateTime localDateTime;

    public String getOpertion() {
        return opertion;
    }

    public String getTank() {
        return tank;
    }

    public Event(String tank, String opertion, double volume, boolean isOpertaionSuccessFull) {
        this.tank = tank;
        this.opertion = opertion;
        this.volume = volume;
        this.isOpertaionSuccessFull = isOpertaionSuccessFull;
        this.localDateTime = LocalDateTime.now();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return Double.compare(event.volume, volume) == 0 && isOpertaionSuccessFull == event.isOpertaionSuccessFull && Objects.equals(tank, event.tank) && Objects.equals(opertion, event.opertion) && Objects.equals(localDateTime, event.localDateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tank, opertion, volume, isOpertaionSuccessFull, localDateTime);
    }
}

