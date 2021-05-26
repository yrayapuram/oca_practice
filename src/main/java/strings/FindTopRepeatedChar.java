package strings;

public class FindTopRepeatedChar {

    public static void main(String... args) {

        String word = "ddddaaaeeebbbbbbbbbaaaaaaaa";

        //StringBuilder is not immutable.
        StringBuilder repeatedAlphabets;
        repeatedAlphabets = new StringBuilder();

        for(int index = 0; index < word.length(); index++) {
            char ch = word.charAt(index);
            int counter = 0;
            while (index<word.length() && ch == word.charAt(index)) {
                counter++;
                index++;
            }
            repeatedAlphabets.append(ch);
            repeatedAlphabets.append(counter);
            index--;
        }
        char maxRepeated = repeatedAlphabets.charAt(0);
        int maxRepeatedTimes = Integer.parseInt(String.valueOf(repeatedAlphabets.charAt(1)));

        System.out.println(repeatedAlphabets);

        for(int index = 3; index < repeatedAlphabets.length(); index += 2) {
            int tempMaxRepeatedTimes = Integer.parseInt(String.valueOf(repeatedAlphabets.charAt(index)));
            if(tempMaxRepeatedTimes >= maxRepeatedTimes) {
                maxRepeated = repeatedAlphabets.charAt(index - 1);
                maxRepeatedTimes = tempMaxRepeatedTimes;
            }
        }
        System.out.println(maxRepeated + " : " + maxRepeatedTimes);
    }
}