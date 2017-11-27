package method_declaration.accessmodifiers.protected_am.round;

import method_declaration.accessmodifiers.protected_am.fruit.Fruit;

public class Apple extends Fruit {

    public void shape() {
        whatShape();
    }

    public static void main(String... args) {
        Apple apple = new Apple();
        //This will print Round.
        //subclass has access to superclass protected members.
        apple.shape();

        Fruit fruit = new Fruit();

        //accessing Fruit members outside of the package
        //throws compile error.

        //fruit.whatShape();

        //prints: Round
        //since Apple is subclass of Fruit, apple object has
        //access to protected members of Fruit class.
        apple.whatShape();

        //Access to public member method allowed and Prints Red.
        fruit.whatColor("Red");

        //To get access to protected member fields, access them via
        //public methods.
        //This prints Round & Red
        fruit.shapeAndColor("Red");

    }
}
