package multiple_inheritance;

public interface Driver {

    short SPEED = 75;

    default int drivingSpeed() {
        return SPEED;
    }

}
