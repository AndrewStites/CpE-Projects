package Java.MasterClass;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Location {
    private final int locationID;
    private final String description;
    private final Map<String, Integer> exits;

    public Location(int locationID, String description) {
        this.locationID = locationID;
        this.description = description;
        this.exits = new HashMap<String, Integer>();
        //this gives us the ability to quit out of the program whenever and saves us from redundant code
        this.exits.put("Q", 0);
    }

    public void addExit(String direction, int location)
    {
        exits.put(direction, location);
    }

    public int getLocationID() {
        return locationID;
    }

    public String getDescription() {
        return description;
    }

    public Map<String, Integer> getExits() {
        //a new map is created but has all the data from the exits map
        //this allows a defense so nothing outside our class can access or change it
        return new HashMap<String, Integer>(exits);
    }
}
