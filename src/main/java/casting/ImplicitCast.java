package casting;

public class ImplicitCast {

    public static void main(String[] args) {

        short base = 1;
        short height = 2;
        //Implicit cast converts short to int(numeric promotion) when arithmetic operation applied.
        //Compiler thinks possible overflow hence compile error.
        //Compile Error:
        // short area = base * height;
        short area = (short) (base * height);
        System.out.println("Area : " + base * height);

    }

}
