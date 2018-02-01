package reference_type;

public class StringPool {

    public static void main(String... args) {

        String s = "I live in pool";
        String o = new String(s);

        //true because both references point to the same object in string pool
        if("I live in pool" == s)
            System.out.println("string pool case passed");

        //false because both are different objects
        if("I live in pool" == o)
            System.out.println("Wrong comparison");

        //false because both are different objects
        if(s == o)
            System.out.println("Wrong comparison");
    }
}
