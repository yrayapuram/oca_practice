package constructors.no_args_constructor;

public class Mango extends Fruit {

    public Mango() {

        //parent class having no argument constructor forces
        //child classes to call super()
        //Without below line compiler would throw an error.
        super("Mango");
    }

}
