package strings;

public class StringFromStringPool {
    public static void main(String... args) {

        String strFeature1 = "string pool";
        String strFeature2 = "string pool";
        String strFeature3 = new String("string pool");

        //true; as both string objects refer to the same string object in string pool.
        System.out.println(strFeature1 == strFeature2);

        //true; because .equals() compares values.
        System.out.println((strFeature1.equals(strFeature2)));

        //false; because new String() creates new string object in string pool.
        System.out.println(strFeature1 == strFeature3);

        //Reference value is same for all objects.
        System.out.println(Integer.toHexString(strFeature1.hashCode()));
        System.out.println(Integer.toHexString(strFeature2.hashCode()));
        System.out.println(Integer.toHexString(strFeature3.hashCode()));

    }
}