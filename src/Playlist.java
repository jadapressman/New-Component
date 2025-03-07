package components.Playlist;

/**
 * {@code SequenceKernel} enhanced with secondary methods.
 *
 * @param <String>
 *            type of {@code Sequence} entries
 */
public interface Playlist<String> extends PlaylistKernel<String> {

    /**
     * Reports the entry at position {@code pos} of {@code this}.
     *
     * @param pos
     *            the position of the entry
     * @return the entry at that position
     * @aliases reference returned by {@code entry}
     * @requires {@code 0 <= pos and pos < |this|}
     * @ensures {@code <entry> = this[pos, pos+1)}
     */
    String entry(int pos);

    /**
     * Swaps the entry at position {@code pos1} of {@code this} with the entry
     * at position {@code pos2}.
     *
     * @param pos1
     *            the first position at which to swap the entries
     * @param pos2
     *            the entry swapping with the first one
     * @aliases reference {@code x}
     * @updates this
     * @requires {@code 0 <= pos and pos < |this|}
     * @ensures |this| = |#this| and this = #this[0,pos) * #this[pos2] *
     *          #this(pos1, pos2) * #this[pos1] * #this(pos2,|#this|]
     */
    void swapSong(int pos1, int pos2);

    /**
     * Concatenates ("appends") {@code s} to the end of {@code this}.
     *
     * @param s
     *            the {@code Playlist} to be appended
     * @updates this
     * @clears s
     * @ensures this = #this * #s
     */
    void append(Playlist<String> s);

    /**
     * Inserts {@code s} into {@code this} at position {@code pos}, i.e., after
     * the {@code pos}-th entry of {@code this}; and clears {@code s}.
     *
     * @param pos
     *            the position at which to insert
     * @param s
     *            the {@code Playlist} to be inserted
     * @updates this
     * @clears s
     * @requires {@code 0 <= pos and pos <= |this|}
     * @ensures this = #this[0, pos) * #s * #this[pos, |#this|)
     */
    void insert(int pos, Playlist<String> s);

    /**
     * Removes the substring of {@code this} starting at position {@code pos1}
     * and ending at position {@code pos2-1} and puts in it {@code s}.
     *
     * @param pos1
     *            the position of the first entry that is extracted
     * @param pos2
     *            the position of the first entry, after the extracted
     *            substring, that is not extracted
     * @param s
     *            upon return, the extracted substring
     * @updates this
     * @replaces s
     * @requires {@code 0 <= pos1 and pos1 <= pos2 and pos2 <= |this|}
     * @ensures <pre>
     * this = #this[0, pos1) * #this[pos2, |#this|)  and
     * s = #this[pos1, pos2)
     * </pre>
     */
    void extract(int pos1, int pos2, Playlist<String> s);

}
