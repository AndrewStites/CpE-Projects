package Java.MasterClass;

public class Main {

    public static void main(String[] args) {
	Hamburger hamburger = new Hamburger("Basic", "Sausage", 2.50, "White");
	double price = hamburger.itemizeHamburger();
	hamburger.addHamburgerAddition1("Tomato", 0.20);
	hamburger.addHamburgerAddition2("Cheese", 0.50);
	hamburger.addHamburgerAddition3("Lettuce", 0.10);
	hamburger.addHamburgerAddition4("Onion", 0.5);
	//price = hamburger.itemizeHamburger();
	System.out.println("Total Burger price is " + String.format("%.02f",hamburger.itemizeHamburger()));

	System.out.println("\n");

	HealthyBurger healthyBurger = new HealthyBurger("Bacon", 3.00);
	healthyBurger.addHamburgerAddition1("Egg", 2.50);
	healthyBurger.addHamburgerAddition2("Lentils", .75);
	System.out.println("Total Burger price is " + String.format("%.02f", healthyBurger.itemizeHamburger()));

	System.out.println("\n");

	DeluxeBurger db = new DeluxeBurger();
	db.addHamburgerAddition3("Egg", 250);
	System.out.println("Total Burger price is " + String.format("%.02f", db.itemizeHamburger()));


    }
}
