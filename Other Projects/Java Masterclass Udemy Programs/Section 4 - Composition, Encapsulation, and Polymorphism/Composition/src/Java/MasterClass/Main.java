package Java.MasterClass;

public class Main {

    public static void main(String[] args) {
        /*This project demonstrates the reasons to utilize composition vs. inheritance.
          Composition is primarily utilized for components that make up an item
          while inheritance pertains to the objects that fit under the umbrella of the super class*/

        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220B", "Dell", "600", dimensions);

        //the "new Resolution..." is in place for an instance variable
        Monitor theMonitor = new Monitor("27in Beast", "Acer", 27, new Resolution(2540, 1440));

        Motherboard theMotherBoard = new Motherboard("BJ-200", "Asus", 4, 6, "V2.44");

        PC thePC = new PC(theCase, theMonitor, theMotherBoard);
        thePC.powerUP();

          //This uses composition
//        //"thePC" object uses the "getMonitor()" method in class "PC" to access the "drawPixelAt()" method in "Monitor"
//        thePC.getMonitor().drawPixelAt(1500, 1200, "Red");
//        //Same process occurs
//        thePC.getMotherboard().loadProgram("Windows 1.0");
//        thePC.getTheCase().pressPowerButton();

        //For the challenge
        Wall wall1 = new Wall("North");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("West");
        Wall wall4 = new Wall("South");

        Ceiling ceiling = new Ceiling(10, "Orphan Blue");

        Bed bed = new Bed("Racecar", 2, 2, 2);

        Lamp lamp = new Lamp("Lava", true, 75);

        Bedroom bedroom = new Bedroom("Andrew's", wall1, wall2, wall3, wall4, ceiling, bed, lamp);
        bedroom.makeBed();

        bedroom.getLamp().turnOn();
    }
}
