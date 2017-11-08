package enum_examples;

public class Numbers {

    enum Counters { ONE, TWO, THREE }

    public static void main(String... args) {

        String num = "ONE";

        //Prints: 1
        switch (Counters.valueOf(num)) {

            case ONE:
                System.out.println("1");
                break;
            case TWO:
                System.out.println("2");
                break;
            case THREE:
                System.out.println("3");
                break;
            default:
                System.out.println("Some number");
        }
    }
}