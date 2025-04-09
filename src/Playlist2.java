import javax.sound.midi.Sequence;

/** {@code Playlist} represented as a {@code Sequence} with implementations of
 * primary methods.
 *
 * @convention <pre>
 * [all entries of $this.songs are strings]
 * </pre>
 * @correspondence <pre>
 * this = [a list of songs in order by position]
 * </pre>
 *
 * @author Jada Pressman
 *
 */
public class Playlist2 extends Playlist2Secondary {

    /*
     * Private members --------------------------------------------------------
     */

    /**
     * Representation of {@code this}.
     */
    private Sequence<String> songs;

    /**
     * Creator of initial representation.
     */
    private void createNewRep() {
        this.songs = new Sequence2<>();
    }

    /*
     * Constructors -----------------------------------------------------------
     */

    /**
     * No-argument constructor.
     */
    public Playlist2() {
        this.createNewRep();
    }

    /*
     * Standard methods -------------------------------------------------------
     */

     @Override
     public final NaturalNumber newInstance() {
         try {
             return this.getClass().getConstructor().newInstance();
         } catch (ReflectiveOperationException e) {
             throw new AssertionError(
                     "Cannot construct object of type " + this.getClass());
         }
     }

     @Override
     public final void clear() {
         this.createNewRep();
     }

     @Override
     public final void transferFrom(NaturalNumber source) {
         assert source != null : "Violation of: source is not null";
         assert source != this : "Violation of: source is not this";
         assert source instanceof Playlist2 : ""
                 + "Violation of: source is of dynamic type PlaylistExample";
         /*
          * This cast cannot fail since the assert above would have stopped
          * execution in that case.
          */
         Playlist2 localSource = (Playlist2) source;
         this.songs = localSource.songs;
         localSource.createNewRep();
     }

     /*
      * Kernel methods ---------------------------------------------------------
      */
    Override
     public void add(int pos, String x){
       this.songs.add(pos, x);
     }


    @Override
    public String remove(int pos) {
        return this.songs.remove(pos);
    }


    @Override
    public String skip() {
        return this.songs.remove(0);
    }


    @Override
    public int length() {
     return this.songs.length();
   }
 }
