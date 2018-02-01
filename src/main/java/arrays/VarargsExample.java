package arrays;

public class VarargsExample {

    //Prints Sheel
    public static void printFirstName(String... name) {
        System.out.println(name[0]);
    }

    public static void main(String[] args) {
        printFirstName("Sheel", "Dave");
    }
}
