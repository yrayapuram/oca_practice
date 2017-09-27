package operators.numeric_promotion;

public class SmallToBigDataType {

    public static void main(String... args) {

        //Example 1

        short base = 4;
        short height = 5;
        //Because of numeric promotion, short is promoted to int,
        //by Java before applying binary arithmetic operation.
        //Compiler detects overflow and hence compile error.
        //Compile Error:
        // short area = base * height;
        short area = (short) (base * height);
        System.out.println("Area : " + area);

        //Example 2

        int intBase = 4;
        long longHeight = 5;

        //Because of numeric promotion, the resulting value
        //in the below arithmetic binary operation becomes long.
        //Compiler detects overflow and hence compile error
        //Compile Error:
        // int area = intBase * longHeight;
        long longArea = intBase * longHeight;

        System.out.println("Area : " + longArea);

        //Example 3

        double doubleBase = 4.0;
        float floatHeight = 5.0f; //without f literal is treated double.

        //Because of numeric promotion, the resulting value
        //in the below arithmetic binary operation becomes double.
        //Compiler detects overflow and hence compile error
        //Compile Error:
        // float area = doubleBase * floatHeight;
        double doubleArea = doubleBase * floatHeight;

        System.out.println("Area : " + doubleArea);


    }
}
