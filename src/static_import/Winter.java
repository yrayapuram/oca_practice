package static_import;

//Commenting this line would result compiler error for leaves member access.
import static static_import.Season.*;

public class Winter {

    public static void main(String... args) {

        if(!leaves.equals("ORANGE")) leaves = "ORANGE";

        //Prints: Leaves Color : ORANGE
        System.out.println("Winter Leaves : " + leaves);

        //Prints: Leaves Color : ORANGE
        System.out.println("Season Leaves : " + Season.leaves);
    }
}
