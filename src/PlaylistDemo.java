
/**
 * PlaylistDemo.java.
 */
public class Playlist {

    /**
     * Playlist.
     */
    private Playlist<String> songs;

    /**
     * displaying the playlist nicely.
     */
    public final void displayPlaylist() {
        System.out.println("Playlist:");
        for (int i = 0; i < songs.length(); i++) {
            System.out.println((i + 1) + ". " + songs.entry(i));
        }
    }
}

/**
 * PlaylistDemo class. This class demonstrates the usage of the Playlist class.
 */
final class PlaylistDemo {

    /**
     * Private constructor to prevent instantiation.
     */
    private PlaylistDemo() {
    }

    /**
     * Main method to run the demo.
     *
     * @param args
     *            command line arguments
     */
    public static void main(String[] args) {
        Playlist<String> playlist = new Playlist2<>();

        String song1 = "Shape of You";
        String song2 = "Blinding Lights";
        String song3 = "Bohemian Rhapsody";

        playlist.add(song1);
        playlist.add(song2);
        playlist.add(song3);

        System.out.println("Initial Playlist:");
        playlist.displayPlaylist();

        System.out.println("\nRemoving a song...");
        playlist.remove(song2);

        System.out.println("\nUpdated Playlist:");
        playlist.displayPlaylist();
    }
}
