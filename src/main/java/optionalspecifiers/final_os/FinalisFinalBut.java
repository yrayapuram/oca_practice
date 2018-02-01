package optionalspecifiers.final_os;

public class FinalisFinalBut {

    static final int SCORE;

    //this will throw compile error
    //because YOUR_SCORE is not initialized via
    //static initializer.
    //static final int YOUR_SCORE;

    static {
        //final variable re-initialization allowed here
        //because static initializer is doing the first initialization for static SCORE.
        SCORE = 100;
    }

    public static void main(String... args) {

        //COMPILE Error because final variable can not
        //be re-initialized.
        //SCORE = 1;

        //prints 100
        System.out.println(SCORE);

    }
}
