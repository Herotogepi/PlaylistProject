/**
 * Sample of a tester file for the Playlist class. This file should demonstrate all the capability of your
 * playlist in the main method. You don't need to follow the testing specifications of this exactly
 * if you want to write your own separate tester instead.
 * Note that there's no need for a Scanner in this project-- all of the playlist can be 'hardcoded' into main.
 * @author
 * @version
 */
public class PlaylistTester {
    public static void main(String[] args) {
        System.out.println("Initializing a Playlist...\n");
        //Make your playlist here
        Playlist p = new Playlist();
        
        System.out.println("Adding songs to the Playlist...\n");
        /**
         * Add some songs here. Note that the format for adding a Song to a Playlist p
         * is something like...
         * p.addSong(new Song(..., ..., ...))
         */
        p.add("Bad Piggies", "Hakkola", 160);
        p.add("Dance Till You're Dead", "ANI", 142);
        p.add("METAL PIPE FALLING", "Blanco y Sancho", 84);
        p.add("Otherside", "Red Hot Chilli Peppers", 255);
        p.add("Bennie and the Jets", "Elton John", 322);


        System.out.println("Printing the songs...\n");
        //Print out all the songs in the playlist to verify it's working correctly
        p.displaySongs();

        System.out.println("\nLiking the songs in position 1, and 3....\n");
        //Once your songs are 'liked', this should be reflected in the next printout
        p.liking("Bad Piggies");
        p.liking("METAL PIPE FALLING");

        System.out.println("Printing the liked songs only...\n");
        p.likedSongs();

        System.out.println("\nRemoving the song in position 3...\n");
        p.removeSong("METAL PIPE FALLING");
        
        System.out.println("Printing the songs...\n");
        p.displaySongs();

        System.out.println("\nPrinting only the liked songs...\n");
        //Your Playlist should be able to do this without looping while in main!
        p.likedSongs();

        System.out.println("\nPrinting the total duration of all songs...\n");
        //Note that the format should look something like minutes:seconds
        System.out.println(p.totalTimeInMins());

        System.out.println("\nRemoving all unliked songs from the playlist...\n");
        //This should be doable with a single method call
        p.removeUnliked();

        System.out.println("Printing all songs...\n");
        //This should now look like only the liked songs list from before
        p.displaySongs();
    }
}
