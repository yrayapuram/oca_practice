package arrays.sorting;

public class APISortingRules {

    public static void main(String... args) {

        System.out.println("Example: Uppercase sorts before lowercase...");
        String[] names = {"user", "User", "USer", "UsER", "USER"};
        //prints: [user, User, USer, UsER, USER]
        System.out.println(java.util.Arrays.toString(names));
        java.util.Arrays.sort(names);
        //prints: [USER, USer, UsER, User, user]
        System.out.println(java.util.Arrays.toString(names));

        System.out.println("Example: Numbers sort before letters...");
        String[] numNames = {"1user", "U2ser", "US4er", "U3sER", "US5ER"};
        //prints: [1user, U2ser, US5er, U3sER, US6ER]
        System.out.println(java.util.Arrays.toString(numNames));
        java.util.Arrays.sort(numNames);
        //prints: [1user, U2ser, U3sER, US5er, US6ER]
        System.out.println(java.util.Arrays.toString(numNames));

    }
}
