package recursion;

public class Reverse {
    public static String reverseFunc(String rev) {
        if (rev.length() <= 1) {
            return rev;
        }
        return reverseFunc(rev.substring(1)) + rev.charAt(0);
    }
}