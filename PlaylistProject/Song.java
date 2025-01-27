/**
 * File for a Song class to be used in the Playlist Project
 * @author Arjun Singh & Cavon Hajimiri
 * @version 1/24/2025
 */
public class Song {
    //Fields-- what information do we want each Song to store?

    private String title;
    private String author;
    private int durationInSeconds;
    private boolean liked;


    /**
     * Constructor-- what information needs to be given to make a Song?
     * How will you handle 'liked' songs? It makes sense for a Song not be 'liked' by default
     */
    public Song(String title, String author, int time)
    {
        this.title = title;
        this.author = author;
        durationInSeconds = time;
        liked = false;
    }


     /**
      * Methods-- what will you want each Song to do?
      * Consider all the getter methods (getName, getArtist, etc.)
      * You should probably have a toString method to be able to get the information for the full
      * song easily as well!
      * What kind of mutator (setter) methods will you need?
      */
    public String getName()
    {
        return title;
    }

    public String getArtist()
    {
        return author;
    }

    public int getDuration()
    {
        return durationInSeconds;
    }

    public boolean isLiked(){
        return liked;
    }

    public void setLiked(boolean status){
        liked = status;
    }
    
    public String toString(){
        return title + " by " + author + " (" + durationInSeconds/60 + ":" + durationInSeconds%60 + ")";
    }
    
}
