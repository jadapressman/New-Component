
/**
 * PlayListDemo2.java.
 */
final class PlayListDemo2 {
    /**
     * Private constructor to prevent instantiation.
     */
    private PlayListDemo2() {
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

        playlist.add(0, song1);
        playlist.add(1, song2);
        playlist.add(2, song3);

        System.out.println("Removing a song...");
        playlist.remove(song2);
        playlist.swapSong(0, 1);

        System.out.println("\nUpdated Playlist:");
        song2 = playlist.remove(1);
        song1 = playlist.remove(0);
        System.out.println(
                "New order of playlist is: " + song1 + " and then " + song2);
    }
}
