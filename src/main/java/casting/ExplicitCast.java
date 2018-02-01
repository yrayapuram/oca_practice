package casting;

public class ExplicitCast {

    public static void main(String[] args) {

        //Without explicit cast compiler suspects overflow hence compile error.
        //Overflow situation because literal, 1.0, value is treated as double data type.
        //Compile Error:
        // float size = 1.0;
        float size = (float) 1.0;
        System.out.println("Explicit cast size value : " + size);

    }

}
