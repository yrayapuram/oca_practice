package arrays.searching;

import java.util.Arrays;

public class APISearchingRules {

    public static void main(String... args) {

        System.out.println("Example: Sorted array...");

        int[] nums = {1, 3, 4, 7, 9};

        //prints index of match
        System.out.println(Arrays.binarySearch(nums, 1)); // 0

        //element not found rule will return (-[index of where match needs to be] - 1)
        System.out.println(Arrays.binarySearch(nums, 8)); // -5

        System.out.println("Example: Unsorted array...");

        int[] someNums = {6, 5, 0};

        //unpredictable value will be returned.
        System.out.println(Arrays.binarySearch(someNums, 6));



    }
}
