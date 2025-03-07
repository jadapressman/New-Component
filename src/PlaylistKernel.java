package components.Playlist;

import components.standard.Standard;

/**
 * Playlist kernel component with primary methods. (Note: by package-wide
 * convention, all references are non-null.)
 *
 * @param <String>
 *            type of {@code SequenceKernel} entries
 *
 * @mathmodel type PlaylistKernel is modeled by sequence of Strings
 * @initially {@code
 * ():
 *  ensures
 *   this = <>
 * }
 * @iterator ~this.seen * ~this.unseen = this
 */
public interface PlaylistKernel<String>
        extends Standard<Playlist<String>>, Iterable<String> {

    /**
     * Adds the entry {@code x} at position {@code pos} of {@code this}.
     *
     * @param pos
     *            the position at which to add an entry
     * @param x
     *            the entry to be added
     * @aliases reference {@code x}
     * @updates this
     * @requires {@code 0 <= pos and pos <= |this|}
     * @ensures {@code this = #this[0, pos) * <x> * #this[pos, |#this|)}
     */
    void add(int pos, String x);

    /**
     * Removes and returns the entry at position {@code pos} of {@code this} .
     *
     * @param pos
     *            the position at which to remove an entry
     * @return the entry removed
     * @updates this
     * @requires {@code 0 <= pos and pos < |this|}
     * @ensures {@code
     * this = #this[0, pos) * #this[pos+1, |#this|)  and
     * <remove> = #this[pos, pos+1)
     * }
     */
    String remove(int pos);

    /**
     * Removes and returns the entry at position 0 of {@code this} .
     *
     * @return the entry removed
     * @updates this
     * @requires |this| > 0
     * @ensures {@code
     * this = #this[1, |#this|)  and
     * <remove> = #this[0} }
     */
    String skip();

    /**
     * Reports the length of {@code this}.
     *
     * @return the length
     * @ensures length = |this|
     */
    int length();

}
