package multiple_inheritance;

public interface Racer {

    int SPEED = 200;

    String HABIT = "Speeding";

    default String drivingHabit() {
        return HABIT;
    }
}
