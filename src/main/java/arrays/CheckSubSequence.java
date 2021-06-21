package arrays;

import java.util.Arrays;
import java.util.List;

public class CheckSubSequence {

    public static boolean isSubsequence(List<Integer> main, List<Integer> sub) {
        int i, j = 0;
        int count = 0;
        for (i = 0; i < sub.size() & j < main.size(); i++) {
            while (j < main.size()) {
                if (sub.get(i).equals(main.get(j))) {
                    j++;
                    count++;
                    break;
                } else {
                    j++;
                }
            }
        }
        return (count == sub.size());
    }

    public static void main(String... args) {
        List<Integer> mainList = Arrays.asList(11, -2, 33, 4, 55, 61);
        List<Integer> subList = Arrays.asList(-2, 61);
        if (isSubsequence(mainList, subList)) {
            System.out.println("It is Sub-Sequence");
        } else {
            System.out.println("It is NOT");
        }
    }
}