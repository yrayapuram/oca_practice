package recursion;

public class Factorial {

    public static int factorialFunc(int fact) {
        if (fact <= 1) {
            return fact;
        }
        return (factorialFunc(fact - 1) * fact);
    }
}
