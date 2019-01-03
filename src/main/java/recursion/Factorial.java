package recursion;

public class Factorial {

    public static int factorial(int someIntegerValue) {

        if (someIntegerValue <= 1)
            return someIntegerValue;

        return factorial(someIntegerValue - 1) * someIntegerValue;
    }
}