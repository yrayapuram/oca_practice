package somecoolstuff.generics;

import java.util.*;

public class MethodForAllTypes {

    public static <T extends Comparable>boolean isAsc(List<T> somelist) {
        T previous = null;
        for(T someValue : somelist) {
            if(previous != null && someValue.compareTo(previous) <= 0) {
                return false;
            } else {
                previous = someValue;
            }
        }
        return true;
    }

    public static void main(String... args) {
        List<Integer> intArray = Arrays.asList(1,2,3,4,6,8);
        List<String> sArray = Arrays.asList("Apple", "Zoo", "Dog");

        //Prints: Numbers are in ascending order : true
        System.out.println("Numbers are in ascending order : " + isAsc(intArray));

        //Prints: Names are in ascending order : false
        System.out.println("Names are in ascending order : " + isAsc(sArray));
    }

}
