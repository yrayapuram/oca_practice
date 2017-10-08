package reference_type;

public class HowPassByValue {

    static void giveItAValue(int hits) {
        hits = 1000;
        System.out.println("Given value: " + hits);
    }

    public static void main(String... args) {

        int hits = 1;

        //Prints Given value: 1000
        giveItAValue(hits);

        //Prints Original value: 1
        //It's because Java doesn't pass method arguments by reference;
        // it passes them by value.
        System.out.println("Original value: " + hits);
    }
}
