package lambdas;

import java.util.ArrayList;
import java.util.List;

public class FindFruit {

    private static void findFruit(List<Fruit> fruits, TasteFruit tasteFruit) {
        for(Fruit f: fruits) {
            if(tasteFruit.findAboutFruit(f))
                System.out.println(f);
        }
    }

    public static void main(String... args) {

        List<Fruit> fruits = new ArrayList<>();

        fruits.add(new Fruit("Banana", true, true));

        fruits.add(new Fruit("Orange", false, true));

        fruits.add(new Fruit("Mango", true,true));

        //Prints Banana Mango
        findFruit(fruits, fruit -> fruit.isSweet());

        //Prints Banana Orange Mango
        findFruit(fruits, fruit -> fruit.isGoodForHealth());

        //Prints all fruit names with prefix I love
        findFruit(fruits, fruit -> {
            System.out.println(" I love " + fruit);
            return true;
        });
    }

}
