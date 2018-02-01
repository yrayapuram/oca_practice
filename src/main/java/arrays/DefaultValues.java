package arrays;

public class DefaultValues {

    public static void main(String... args) {

        //Example 1:
        //Array of int primitive
        int[] numbers = new int[5];
        for(int fib: numbers)
            //will print 0 0 0 0 0
            System.out.print(fib + " ");

        System.out.println("\n--------------------");

        //Example 2:
        //Array of double primitive
        double[] decimals = new double[5];
        for (double dec:decimals)
            //will print 0.0 0.0 0.0 0.0 0.0
            System.out.print(dec + " ");

    }
}
