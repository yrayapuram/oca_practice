package constructors.parent_constructor_called_first;

public class Child extends Parent {

    public Child() {
        System.out.println("Hello! From Child constructor");
    }

    public static void main(String... args) {
        //prints...
        //Hello! From Parent constructor
        //Hello! From Child constructor
        Child child = new Child();
    }
}
