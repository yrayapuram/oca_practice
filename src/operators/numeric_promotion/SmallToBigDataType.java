package operators.numeric_promotion;

public class SmallToBigDataType {

    public static void main(String... args) {

        short base = 4;
        short height = 5;
        //Because of numeric promotion, short is promoted to int,
        //by Java before applying binary arithmetic operation.
        //Compiler detects overlfow and hence compile error.
        //Fix: int area = base * height;
        short area = base * height;
        System.out.println(area);

    }
}
