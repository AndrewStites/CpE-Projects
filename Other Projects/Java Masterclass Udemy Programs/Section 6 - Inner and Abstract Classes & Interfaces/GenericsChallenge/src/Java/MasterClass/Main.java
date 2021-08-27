package Java.MasterClass;

import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        //Using "Generics" is better than using a "raw type" due to being dangerous if used incorrectly
        //The best time to use "raw types" is for legacy code, java code before 1.5.

        //having diamonds within diamonds allow for restrictions
        //only "football teams" can be in this league
        League<Team<FootballPlayer>> footballLeague = new League<>("AFL");

        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        Team<FootballPlayer> hawthorn = new Team<>("Hawthorn");
        Team<FootballPlayer> fremantle = new Team<>("Fremantle");

        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");

        footballLeague.add(adelaideCrows);
        footballLeague.add(melbourne);
        footballLeague.add(hawthorn);
        footballLeague.add(fremantle);

        hawthorn.matchResult(fremantle, 1, 0);
        hawthorn.matchResult(adelaideCrows, 3, 8);

        adelaideCrows.matchResult(fremantle, 2, 1);

        //this is using the raw types way
//        BaseballPlayer pat = new BaseballPlayer("Pat");
//        SoccerPlayer beckham = new SoccerPlayer("Bechham");
//
//        Team rawTeam = new Team("Raw Team");
//        rawTeam.addPlayer(beckham);
//        rawTeam.addPlayer(pat);
//
//        footballLeague.add(rawTeam);
//
//        League<Team> rawLeague = new League<>("Raw");
//        rawLeague.add(adelaideCrows);
//        rawLeague.add(baseballTeam);
//        rawLeague.add(rawTeam);
//
//        League reallyRaw = new League<("Really Raw");
//        reallyRaw.add(adelaideCrows);
//        reallyRaw.add(baseballTeam);
//        reallyRaw.add(rawTeam);







    }
}
