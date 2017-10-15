package override;

public class Rose extends Flower {

    //smell() method here is overridden because...
    //Rule 2: The method has the same signature as the method in the
    //parent class AND is at least as accessible or more (public) than the parent class method.

    //Try with package private (default) access modifier to see compile error.

    public String smell() {
        return ("Extremely intoxicating fragrance");
    }

    void checkSmell() {
        System.out.println(smell());
    }

    public static void main(String... args) {

        Rose rose = new Rose();

        //Prints: Extremely intoxicating fragrance
        rose.checkSmell();

        //Prints: Extremely intoxicating fragrance
        System.out.println(rose.smell());
    }
}
