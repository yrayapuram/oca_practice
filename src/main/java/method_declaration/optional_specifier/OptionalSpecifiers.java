package method_declaration.optional_specifier;

public abstract class OptionalSpecifiers {

    //optional specifier can appear before access modifier.
    static private String callStatic() {
        return "I am static";
    }

    //abstract method can not have body.
    abstract String implementAbstract();

    //final method can not be overridden in sub-class.
    final String itIsFinal() {
        return "It's final";
    }

    //multiple optional specifiers allowed.
    public final static synchronized String stayThreadSafe() {
        return "In thread safe";
    }

    //implementation for this method will be in other languages like c, c++.
    public native String callNative();

    //strictfp will ensure result of floating point computation is always same on
    //all platforms
    public static strictfp double calcSquare(double number) {
        return number * number;
    }

    public static void main(String... args) {

        OptionalSpecifiers optionalSpecifiers = new OptionalSpecifiers() {
            @Override
            String implementAbstract() {
                return "from abstract";
            }
        };

        //prints: I am static
        System.out.println(callStatic());

        //prints: from abstract
        System.out.println(optionalSpecifiers.implementAbstract());

        //prints: It's final
        System.out.println(optionalSpecifiers.itIsFinal());

        //prints: In thread safe
        System.out.println(stayThreadSafe());

        //prints: 81.0
        System.out.println(calcSquare(9));

    }
}