package corejavaapi;

public class StringSubstringEmpty {
    public static void main(String[] args) {

        //string indexing
        //[0|1|2|3|4|]
        //[M|a|n|g|o|]
        String name = "Mango";

        //prints go
        System.out.println(name.substring(3,5));

        //prints empty string
        System.out.println(name.substring(3,3));

        //StringIndexOutOfBoundsException
        System.out.println(name.substring(3,6));
    }
}
