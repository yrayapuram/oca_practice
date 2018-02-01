package hiddenmethods;

public class DarkCloud extends Cloud {

    static String whoAreYou() {
        return "Dark cloud";
    }

    void whenTo() {
        System.out.println(whoAreYou() + " started already to pour all over the place.");
    }

    public static void main(String... args) {
        DarkCloud dc = new DarkCloud();

        //This will call child class version of whoAreYou() and
        //Prints: Dark cloud started already to pour all over the place.
        dc.whenTo();

        //This will call parent version of whoAreYou() and
        //Prints: White cloud heading south.
        dc.whereTo();
    }
}
