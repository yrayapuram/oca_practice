package reference_type;

import java.util.ArrayList;

public class PassByValueHow {

    static void giveItAValue(ArrayList hits) {
        hits.add(1000);
        System.out.println(hits.toString());
    }

    public static void main(String... args) {
        ArrayList hits = new ArrayList();
        hits.add(1);

        //Prints [1, 1000]
        //because via pass-by-value, hits object reference value is passed
        //by which the local hits reference variable is able to point
        //to the same ArrayList Object that the hits in main is referencing to.
        giveItAValue(hits);

        //Prints [1, 1000]
        //no wonder why. right!
        System.out.println(hits.toString());
    }
}
