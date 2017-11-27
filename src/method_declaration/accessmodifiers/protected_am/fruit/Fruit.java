package method_declaration.accessmodifiers.protected_am.fruit;

public class Fruit {

    protected String shape = "Round";

    protected void whatShape() {
        System.out.println(shape);
    }

    public void whatColor(String color) {
        System.out.println(color);
    }

    public void shapeAndColor(String color) {
        System.out.println(shape + " & " + color);
    }
}
