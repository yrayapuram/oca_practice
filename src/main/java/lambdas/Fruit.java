package lambdas;

public class Fruit {

    private String name;
    private boolean isSweet;
    private boolean isGoodForHealth;

    public Fruit(String name, boolean isSweet, boolean isGoodForHealth) {
        this.name = name;
        this.isSweet = isSweet;
        this.isGoodForHealth = isGoodForHealth;
    }

    public String toString() {
        return name;
    }

    public boolean isSweet() {
        return isSweet;
    }

    public boolean isGoodForHealth() {
        return isGoodForHealth;
    }
}
