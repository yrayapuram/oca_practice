package casting;

public class ExplicitCast {
    public static void main(String[] args) {
        float size = (float) 1.0; //without explicit cast compiler suspects overflow hence compile error
        System.out.println("Explicit cast size value : " + size);
    }
}
