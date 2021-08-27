package Java.MasterClass;

public class DeluxeBurger extends Hamburger {

    public DeluxeBurger() {
        super("Deluxe Burger", "Sausage and Bacon", 4.50, "White");
        super.addHamburgerAddition1("Chips", 1);
        super.addHamburgerAddition2("Drink", .85);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }
}
