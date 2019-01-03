package recursion;

public class Reverse {

    public static String reverse(String someStringValue) {
        if (someStringValue.length() <= 1)
            return someStringValue;

        return reverse(someStringValue.substring(1)) + someStringValue.charAt(0);
    }

    public static int reverse(int someIntegerValue) {
        if (someIntegerValue <= 1)
            return someIntegerValue;

        return reverse(someIntegerValue / 10) + someIntegerValue % 10 * powerOfTen(someIntegerValue);
    }

    private static int powerOfTen(int someIntegerValue) {
        if (someIntegerValue < 10)
            return 1;

        return 10 * powerOfTen(someIntegerValue / 10);
    }

    public static String reverseByWords(String someSentence) {
        if (!someSentence.contains(" "))
            return someSentence;

        String[] words = someSentence.split(" ");

        return words[words.length - 1] + " "
                + reverseByWords(someSentence.substring(0, someSentence.indexOf(words[words.length - 1])));
    }

}