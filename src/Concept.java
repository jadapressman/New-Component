/**
     * Representation of {@code this}.
     */
    private Sequence playlist;

    /**
     * Creator of initial representation.
     */
    private void createNewRep() {
        this.playlist = new Sequence1L<>();
    }

    /*
     * Constructors -----------------------------------------------------------
     */

    /**
     * No-argument constructor.
     */
    public Playlist1L() {
        this.createNewRep();
    }

/**
 * using a sequence to add new songs into the queue, like in the real world
 * where you swipe on a song to play next and it adds it to the queue
 *
 * @param song
 *            the song being added
 */
public void add(String song) {
    this.playlist.add(0, song);
}

/**
 * Removing any song from the queue
 *
 *
 * @param song
 *            the song being removed
 */
public void remove(String song) {
    int i = 0;
    for (String x : this.playlist) {
        if (x.equals(song)) {
            this.playlist.remove(i, song);
        }
        i++;
    }
}

/**
 * Skips the song at the front and returns it.
 *
 * @return song to be skipped, front of the sequence
 */
public static String skip() {
    return this.playlist.remove(0);
}

/**
 * takes the length of the sequence to see how many songs there are.
 *
 *
 * @return length of the sequence
 */
public int length() {
    int i = 0;
    for (String x : this.playlist) {
        i++;
    }
    return i;
}

/**
 * checks if a song is in the sequence and returns true if it is, false
 * otherwise
 *
 *
 * @param song
 * @return if it is in the sequence or not
 */
public static boolean lookUp(String song) {
    boolean isIn = false;
    for (String x : this.playlist) {
        if (x.equals(song)) {
            isIn = true;
        }
    }
    return isIn;
}

public static void main(String[] args) {
    Playlist popHits = new Playlist1L();
    popHits.add("Baby");
    popHits.add("Flowers");
    popHits.add("Die with a Smile");
    int length = popHits.length();
    boolean canFind = popHits.lookUp("Baby");
    String skipped = popHits.skip();
}
