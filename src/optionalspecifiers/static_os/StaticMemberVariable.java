package optionalspecifiers.static_os;

public class StaticMemberVariable {

    static String staticVar = "I am static";

    String notStaticVar = "I am NOT static";

    public static void main(String... args) {

        StaticMemberVariable smv = new StaticMemberVariable();

        //access directly
        //prints I am static
        System.out.println(staticVar);

        //Trying to access non-static member from static method
        //throws compiler error
        //System.out.println(notStaticVar); //COMPILE ERROR

        //access via instance of the class
        //(which is nothing but using type of the reference internally by Java)
        //prints I am static
        System.out.println(smv.staticVar);

        //access via instance of the class
        //prints I am NOT static
        System.out.println(smv.notStaticVar);

        smv = null;

        //access via type of the reference
        //prints I am static even though smv is set to null.
        System.out.println(smv.staticVar);

        //Try to access via reference variable.
        //This will throw NullPointerException because
        //the variable refers to null.
        //System.out.println(smv.notStaticVar);

        StaticMemberVariable.staticVar = "I am still static";

        //Prints I am still static because staticVar is only
        //one variable in this class whether you refer it with
        //class instance or class itself doesn't matter.
        System.out.println(smv.staticVar);

    }

}
