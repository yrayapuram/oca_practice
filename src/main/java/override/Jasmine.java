package override;

public class Jasmine extends Flower {

    private String scent = "great";

    //smell() is overridden because
    //Rule 1: The method has same signature as the method in the parent class.
    //Note: Method Signature includes the name & list of parameters.
    protected String smell() {
        return "Beautiful " + scent + " fragrance";
    }

    void checkSmell() {
        System.out.println(smell());
    }

    public static void main(String... args) {

        Jasmine jasmine = new Jasmine();

        //Prints: Beautiful great fragrance
        jasmine.checkSmell();

        //Prints: Beautiful great fragrance
        System.out.println(jasmine.smell());
    }
}