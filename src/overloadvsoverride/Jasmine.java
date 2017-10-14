package overloadvsoverride;

public class Jasmine extends Flower {

    //smell is overridden because
    //Rule 1: The method has same signature as the method in the parent class.
    //Note: Method Signature includes the name & list of parameters.
    protected void smell(String scent) {
        System.out.println("Beautiful " + scent + " fragrance");
    }

    public static void main(String... args) {

        //Prints: Beautiful great fragrance
        new Jasmine().smell("great");

        //Prints: Relaxing fragrance
        new Flower().smell("Relaxing");
    }
}