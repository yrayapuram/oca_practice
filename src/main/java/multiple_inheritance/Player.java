package multiple_inheritance;

//Java allows for multiple inheritance via interfaces.
public class Player implements Driver, Racer {

    public static void main(String... args) {

        Player driver = new Player();

        //Prints: 75
        //Able to access method in Driver interface.
        System.out.println(driver.drivingSpeed());

        //Prints: Speeding
        //Able to access method in Racer interface.
        System.out.println(driver.drivingHabit());
    }

}
