package recursion;

public class TestReverse {

    public static void main(String[] args) {
        String someWord = "Geek";
        System.out.println("The reversed string is : " + Reverse.reverse(someWord));

        int someInt = 123;
        System.out.println("Integer reversed :- " + Reverse.reverse(someInt));

        String sentence = "Hello Good Morning";
        System.out.println("The Reversed String is : " + Reverse.reverseByWords(sentence));
    }

}