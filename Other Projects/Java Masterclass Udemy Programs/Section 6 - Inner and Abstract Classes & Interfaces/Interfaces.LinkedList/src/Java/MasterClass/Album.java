package Java.MasterClass;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Album {
    private String name;
    private String artist;
    //This uses the class Song to collect each song into an album
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    public boolean addSong(String title, double duration)
    {
        //This is a comparison test as to not duplicate a song
        if (findSong(title) == null)
        {
            //adds the users song and duration into the LinkedList
            this.songs.add(new Song(title, duration));
            return true;
        }
        return false;
    }

    private Song findSong(String title)
    {
        //Alternative way to go through songs; it's called the "for each"
        for (Song checkedSong: this.songs)
        {
            if (checkedSong.getTitle().equals(title))
            {
                //returns the title of song
                return checkedSong;
            }
        }
        return null;
    }

    //changed LinkedList to List
    public boolean addToPlayList(int trackNumber, List<Song> playList)
    {
        int index = trackNumber - 1;
        if ((index >= 0) && (index <= this.songs.size()))
        {
            playList.add(this.songs.get(index));
            return true;
        }
        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }

    //changed LinkedList to List
    public boolean addToPlaylist(String title, List<Song> playlist)
    {
        Song checkedSong = findSong(title);
        if(checkedSong != null)
        {
            playlist.add(checkedSong);
            return true;
        }
        System.out.println("The song " + title + " is not in this album");
        return false;
    }



}
