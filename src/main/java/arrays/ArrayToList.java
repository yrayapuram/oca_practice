package arrays;

import java.util.Arrays;
import java.util.List;

public class ArrayToList {

    public static void main(String... args) {

        String[] names = {"You", "Me"};

        //Creates fixed size array backed list.
        //array and list both point to the same data.
        List<String> namesList = Arrays.asList(names);
        System.out.println(namesList);

        //size altering operation not allowed.
        //namesList.remove(1);// UnsupportedOperationException

        namesList.set(1, "Someone"); // operation updates names array
        //prints [You, Someone]
        System.out.println(namesList);

        //prints [You, Someone]
        System.out.println(Arrays.toString(names));

    }
}
