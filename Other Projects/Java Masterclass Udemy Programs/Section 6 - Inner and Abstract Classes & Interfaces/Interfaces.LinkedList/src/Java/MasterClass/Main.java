package Java.MasterClass;

import java.util.*;

public class Main {

    //private field ArrayList of our album objects
    //static for main method
    //changed LinkedList to List
    private static List<Album> albums = new ArrayList<Album>();

    //Java libraries use interfaces so interchangeability is possible
    //Multiple inheritances are only possible with multiple Interfaces in java

    public static void main(String[] args) {

        Album album = new Album("StormBringer", "Deep Purple");
        album.addSong("StormBringer", 4.6);
        album.addSong("Love don't mean a thing", 3.2);
        album.addSong("Holy man", 6.4);
        album.addSong("Hold on", 1.2);
        album.addSong("Lady double dealer", 8.2);
        album.addSong("You can't do it right", 2.2);
        album.addSong("The gypsy", 4.2);
        album.addSong("Highball shooter", 56.5);
        album.addSong("Soldier of fortune", 1);
        albums.add(album);

        //Here we made a new object instead of just a reference
        album = new Album("For those about to rock", "AC/DC");
        album.addSong("For those about to rock", 5.2);
        album.addSong("I put a finger on you", 5.2);
        album.addSong("Let's go", 5.2);
        album.addSong("inject the venom", 5.2);
        album.addSong("Snowballed", 5.2);
        album.addSong("Evil Walks", 5.2);
        album.addSong("C.O.D.", 5.2);
        album.addSong("Breaking the rules", 5.2);
        album.addSong("Night of the long knives", 5.2);
        albums.add(album);

        //The playlist will be stored in a Linkedlist
        //While the albums are stored in an ArrayList
        //changed LinkedList to List
        //could change ArrayList to Vector(vector is a type of list)
        //It is best to use a generic List as the type then initialize it as a specific list, i.e. ArrayList, Vector, etc.
        List<Song> playlist = new ArrayList<>();
        //"albums.get(0)..." calls the first album we added to the ArrayList
        //The title has to match in order for it to match in .addToPlayList
        albums.get(0).addToPlaylist("You can't do it right", playlist);
        albums.get(0).addToPlaylist("Holy man", playlist);
        albums.get(0).addToPlaylist("Stan", playlist);
        //.addToPlayList is grabbing the song that has the index 8 due to being added 1
        albums.get(0).addToPlayList(9, playlist);
        //The 1 refers to the second album
        albums.get(1).addToPlayList(8, playlist);
        albums.get(1).addToPlayList(3, playlist);
        albums.get(1).addToPlayList(2, playlist);
        //This will call forth an error
        albums.get(1).addToPlayList(24, playlist);

        play(playlist);



    }

    //This static method takes in the LinkedList playlist
    //changed LinkedList to List
    private static void play(List<Song> playlist)
    {
        Scanner input = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        //playlist is a LinkedList object
        //The ListIterator cycles through each song inputted
        ListIterator<Song> listIterator = playlist.listIterator();
        if(playlist.size() == 0)
        {
            System.out.println("No songs in playlist");
            //Not necessary
            return;
        }
        else
        {
            //This calls the Overridden method in class Song that prints the title next to the duration
            System.out.println("Now playing " + listIterator.next().toString());
            printMenu();
        }

        while(!quit)
        {
            int action = input.nextInt();
            input.nextLine();

            switch(action)
            {
                case 0:
                    System.out.println("Playlist complete.");
                    quit = true;
                    break;
                case 1:
                    if (!forward)
                    {
                        if (listIterator.hasNext())
                        {
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if (listIterator.hasNext())
                    {
                        System.out.println("Now playing " + listIterator.next().toString());
                    }
                    else
                    {
                        System.out.println("We have reached the end of the playlist");
                        forward = false;
                    }
                    break;
                case 2:
                    if (forward)
                    {
                        if (listIterator.hasPrevious())
                        {
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if (listIterator.hasPrevious())
                    {
                        System.out.println("Now playing " + listIterator.previous().toString());
                    }
                    else
                    {
                        System.out.println("We are at the start of the playlist");
                        forward = true;
                    }
                    break;
                case 3:
                    if (forward)
                    {
                        if (listIterator.hasPrevious())
                        {
                            System.out.println("Now replaying " + listIterator.previous().toString());
                            forward = false;
                        }
                        else
                        {
                            System.out.println("We are at the start of the list");
                        }
                    }
                    else
                    {
                        if (listIterator.hasNext())
                        {
                            System.out.println("Now replaying " + listIterator.next().toString());
                            forward = true;
                        }
                        else
                        {
                            System.out.println("We have reached the end of the list");
                        }
                    }
                    break;
                case 4:
                    printList(playlist);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    //we have a check up above regarding the amount of songs being greater than 0
                    //now that we can remove songs, it is best to have this second check
                    if (playlist.size() > 0)
                    {
                        listIterator.remove();
                        //if there are elements in front, then it checks to see what the previous element is
                        if (listIterator.hasNext())
                        {
                            System.out.println("Now playing " + listIterator.next());
                        }
                        //if there are no more elements in front, then it checks to see what the previous element is
                        else if (listIterator.hasPrevious())
                        {
                            System.out.println("Now playing " + listIterator.previous());
                        }
                    }
                    break;
                default:
                    System.out.println("That was an invalid input");
            }
        }
    }

    private static void printMenu()
    {
        System.out.println("Available actions: \npress");
        System.out.println("0 - to quit\n" +
                "1 - to play next song\n" +
                "2 - to play previous song\n" +
                "3 - to replay the current song\n" +
                "4 - list songs in the playlist\n" +
                "5 - print available actions\n" +
                "6 - to remove a song");
    }

    //changed LinkedList to List
    private static void printList(List<Song> playlist)
    {
        Iterator<Song> iterator = playlist.iterator();
        System.out.println("=====================================");

        while (iterator.hasNext())
        {
            //".toString()" can be used but is not necessary
            System.out.println(iterator.next());
        }

        System.out.println("=====================================");
    }



}
