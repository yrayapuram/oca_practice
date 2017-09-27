package corejavaapi;

public class MutableStringBuilder {

    public static void main(String... args) {

        StringBuilder firstName = new StringBuilder("Straw");
        StringBuilder name = firstName.append("berry");
        name.append(" Monterey");

        //Will print Strawberry Monterey because
        //name objects holds the firstName object reference.
        System.out.println(firstName);
    }
}
