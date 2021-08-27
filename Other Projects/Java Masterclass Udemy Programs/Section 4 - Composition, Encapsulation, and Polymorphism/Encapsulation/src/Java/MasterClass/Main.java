package Java.MasterClass;

public class Main {

    public static void main(String[] args) {
	/*Encapsulation is the mechanism that allows for restriction, from other classes or code, from the inner workings of an area*/

        /*This did not use encapsulation and certain code was able to be altered*/
//        Player player = new Player();
//        player.name = "Andrew";
//        player.health = 120;
//        player.weapon = "Fucking Fists";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining Health: " + player.healthRemaining());
//
//        damage = 121;
//        player.health = 200;
//        player.loseHealth(damage);
//        System.out.println("Remaining Health: " + player.healthRemaining());

        EnhancedPlayer player = new EnhancedPlayer("Andrew", 213, "Fucking Legs");
        System.out.println("Initial health is " + player.getHealth());

    }
}
