package casting;

public class ImplicitCast {
    public static void main(String[] args) {
        short base = 1;
        short height = 2;
        //short area = base * height; // implicit convert to int. Compiler thinks possible overflow hence compile error.
        System.out.println("Area : " + base * height);
    }
}
