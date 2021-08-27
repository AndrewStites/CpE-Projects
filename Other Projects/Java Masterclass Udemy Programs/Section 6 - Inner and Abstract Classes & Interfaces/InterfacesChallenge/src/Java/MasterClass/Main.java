package Java.MasterClass;

import java.time.chrono.IsoChronology;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Player andrew = new Player("Andrew", 100, 100);
        System.out.println(andrew.toString());
        saveObject(andrew);

        andrew.setHitPoints(50);
        System.out.println(andrew);
        andrew.setWeapon("My Ass");
        saveObject(andrew);
        //loadObject(andrew);
        System.out.println(andrew);

        ISaveable werewolf = new Monster("Werewolf", 10, 10);
        //casting it to the "Monster" class
        System.out.println("Strength = " + ((Monster) werewolf).getStrength());
        saveObject(werewolf);
    }

    public static ArrayList<String> readValues()
    {
        ArrayList<String> values = new ArrayList<String>();

        Scanner input = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                            "1 to enter a string\n" +
                            "0 to quit");

        while (!quit)
        {
            System.out.println("Choose an option: ");
            int choice = input.nextInt();
            input.nextLine();

            switch (choice)
            {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("Enter a string: ");
                    String stringInput = input.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }

    public static void saveObject(ISaveable objectToSave)
    {
        for (int i = 0; i < objectToSave.write().size(); i++)
        {
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device");
        }
    }

    public static void loadObject(ISaveable objectToLoad)
    {
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }
}

