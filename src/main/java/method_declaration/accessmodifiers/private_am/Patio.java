package method_declaration.accessmodifiers.private_am;

public class Patio extends House {

    private boolean firePit;

    public void setFirePit(boolean firePit) {
        this.firePit = firePit;
    }

    public boolean getFirePit() {
        return firePit;
    }

    public static void main(String... args) {

        House house = new House();
        house.setBedrooms(3);

        //prints: How many bedrooms? 3
        //There is no way to access private members of House class
        //directly. Have to use get or set public methods.
        System.out.println("How many bedrooms? " + house.getBedrooms());

        house = new Patio();

        //since reference type is House. Parent class
        //public members are accessible.
        house.setBedroom1("Master");
        System.out.println(house.getBedroom1());

        //Type casting helps to access subclass members.
        ((Patio) house).setFirePit(true);
        System.out.println("Has fire pit? " + ((Patio) house).getFirePit());

    }
}