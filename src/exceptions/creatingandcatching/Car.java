package exceptions.creatingandcatching;

public class Car {

    public void startCar() throws NoGasException {
        throw new NoGasException();
    }

    public void letsGoRide() {
        try {
            startCar();
        } catch (EmptyTankException ete) {
            System.out.println("Fill the tank");
        } catch (NoGasException nge) {
            System.out.println("Call AAA Road service");
        }
    }

    public static void main(String... args) {
        new Car().letsGoRide();
    }
}
