package Java.MasterClass;

import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team> {
    public String name;
    private ArrayList<T> league = new ArrayList<>();

    public League(String name) {
        this.name = name;
    }

    public boolean add(T team)
    {
        if (league.contains(team))
        {
            return false;
        }
        league.add(team);
        return true;
    }

    public void showLeagueTable()
    {
        //This will use the framework of Collections to access the compareTo override method in Team
        Collections.sort(league);

        //Runs through every item in league and assigns it to "t"
        for(T t : league)
        {
            System.out.println(t.getName() + ": " + t.ranking());
        }
    }
}
