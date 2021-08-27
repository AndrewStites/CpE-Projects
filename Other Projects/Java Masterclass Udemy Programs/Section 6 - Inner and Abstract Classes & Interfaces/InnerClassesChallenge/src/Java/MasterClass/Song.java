package Java.MasterClass;

public class Song {
    private String title;
    private double duration;

    public Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    //Allows us to print the title and duration side-by-side
    //We overrided the "toString" method which is an internal java method
    //This allows us to use it for our purpose such as printing song names and durations
    @Override
    public String toString() {
        return this.title + ": " + this.duration;
    }
}
