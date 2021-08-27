package Java.MasterClass;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Map<Integer, Location> locations = new HashMap<Integer, Location>();

    /*this is an adventure game based on the old game Colossal Cave*/
    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);

	    //we have the original key after .put that is an integer and gets converted to an Integer object by autoboxing and allows us to access it
        //we create a new location with the same integer as the locationID and a description respectively
	    locations.put(0, new Location(0, "You are sitting in front of a computer learning Java"));
        locations.put(1, new Location(1, "You are standing at the end of a road before a small brick building"));
        locations.put(2, new Location(2, "You are at the top of a hill"));
        locations.put(3, new Location(3, "You are inside a building, a well house for a small spring"));
        locations.put(4, new Location(4, "You are in a valley beside a stream"));
        locations.put(5, new Location(5, "You are in the forest"));

        //This is making options for which location you are in
        //for instance, these are all the options for location 1 (Road)
        locations.get(1).addExit("W", 2);
        locations.get(1).addExit("E", 3);
        locations.get(1).addExit("S", 4);
        locations.get(1).addExit("N", 5);
        //locations.get(1).addExit("Q", 0);

        //location 2 options (Hill)
        locations.get(2).addExit("N", 5);
        //locations.get(2).addExit("Q", 0);

        //location 3 options (Building)
        locations.get(3).addExit("W", 1);
        //locations.get(3).addExit("Q", 0);

        //location 4 options (Valley)
        locations.get(4).addExit("N", 1);
        locations.get(4).addExit("W", 2);
        //locations.get(4).addExit("Q", 0);

        //location 5 options (Forest)
        locations.get(5).addExit("S", 1);
        locations.get(5).addExit("W", 2);
        //locations.get(5).addExit("Q", 0);

        //This is another map for adding full words to the game
        Map<String, String> vocabulary = new HashMap<String, String>();
        vocabulary.put("QUIT", "Q");
        vocabulary.put("NORTH", "N");
        vocabulary.put("SOUTH", "S");
        vocabulary.put("WEST", "W");
        vocabulary.put("EAST", "E");

        int loc = 1;

        while(true)
        {
            //this grabs the locationID and then uses the getter to get the description
            System.out.println(locations.get(loc).getDescription());
            if (loc == 0)
            {
                break;
            }

            //grabs a copy of the map regarding the exits for whatever location
            //loc being the ID number and utilizing the getter to access the game exits respectively
            Map<String, Integer> exits = locations.get(loc).getExits();
            System.out.print("Available exits are ");

            for (String exit : exits.keySet())
            {
                System.out.print(exit + ", ");
            }

            System.out.println();

            String direction = input.nextLine().toUpperCase();
            //checks the amount of characters inputted
            if (direction.length() > 1)
            {
                //creates an array of a String split word by word; ex. {the, brown, fox, jumps,..}
                String[] words = direction.split(" ");
                //checks to see if the "direction" is present in the String inputted
                for(String word: words)
                {
                    //checks for the String inputted compared to the "vocabulary" in the Map above
                    if (vocabulary.containsKey(word))
                    {
                        //assigns it to direction if presented
                        direction = vocabulary.get(word);
                        break;
                    }
                }
            }

            if (exits.containsKey(direction))
            {
                loc = exits.get(direction);
            }
            else
            {
                System.out.println("You cannot go in that direction");
            }

//            //if locations doesn't have the locationID that the user inputted, then the message will display
//            if (!locations.containsKey(loc))
//            {
//                System.out.println("You cannot go in that direction");
//            }
        }
    }
}
