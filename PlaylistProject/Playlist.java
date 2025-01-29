import java.util.ArrayList;

/**
 * The Playlist class, which will keep track of a playlist of Song objects
 * Refer to the project description to make sure you have access to all available methods
 */
public class Playlist {
    /**
     * Fields-- This will likely just need to be the ArrayList of Songs. Reference our previous problems
     * (CarDealership, Zoo) for structure on how this will look
     */
    private ArrayList<Song> playlist;

    /**
     * Constructor-- this doesn't need any parameters. You should just initialize the ArrayList and
     * then use additional methods to add Songs in one-by-one
     */
    public Playlist()
    {
        playlist = new ArrayList<Song>();
    }


    /**
     * Methods-- Remember that you need to be able to complete all of the following:
     * Adding a song
     * 'liking' a song
     * Removing a specific song
     * Examining all Songs (a String return or void print makes sense here)
     * Examining a sublist of all liked songs
     * Determining the total duration of all songs
     * Removing all unliked songs from the playlist (careful with this one!)
     */

    public void newSong(Song newSong)
    {

    }

    public void add(String name, String artist, int duration)
    {
        playlist.add(new Song(name, artist, duration));
    }

    public void liking(String title)
    {
        for(Song song : playlist)
        {
            if(song.getName().equals(title))
            {
                song.setLiked(true);
            }
        }
    }

    public void likedSongs()
    {
        for(Song song : playlist)
        {
            if(song.isLiked() == true)
            {
                System.out.println(song.toString());
            }
        }
    }

    public void removeSong(String title)
    {
        for(int i = playlist.size() - 1; i >= 0; i--)
        {
            if(playlist.get(i).getName().equals(title))
            {
                playlist.remove(i);
            }
        }
    }

    public void displaySongs()
    {
        for(Song song : playlist)
        {
            System.out.println(song.toString());
        }
    }

    public String totalTimeInMins()
    {
        int totaltime = 0;
        for(Song song : playlist)
        {
            totaltime += song.getDuration();
        }

        return (totaltime/60) + ":" + (totaltime%60);
    }

    public void removeUnliked()
    {
        for(int i = playlist.size() - 1; i >= 0; i--)
        {
            if(!playlist.get(i).isLiked())
            {
                playlist.remove(i);
            }
        }
    }
}
