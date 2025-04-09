package components.Playlist;

/**
 * Layered implementations of secondary methods for {@code Sequence}.
 *
 * @param <String>
 *            type of {@code Sequence} entries
 */
public abstract class PlaylistSecondary<String> implements Playlist<String> {

    @Override
    public String entry(int pos) {
        String song = this.Playlist.remove(pos);
        Playlist.add(pos, song);
        return song;
    }

    @Override
    public void swapSong(int pos1, int pos2) {
        String song2 = this.Playlist.remove(pos2);
        String song1 = this.Playlist.remove(pos1);

        this.Playlist.add(song2, pos1);
        this.Playlist.add(song1, pos2);
    }

@Override
     public void append(Playlist<String> s) {
        int i = this.Playlist.length();
        for(String x : s){
            this.Playlist.add(s,i)
            i++;
        }
        s.clear();
     }

@Override
     public void insert(int pos, Playlist<String> s) {
        int i = pos;
        for(String x : s){
            this.Playlist.add(s,i)
            i++;
        }
        s.clear();
     }

@Override
     public void extract(int pos1, int pos2, Playlist<String> s){
        int j = 0;
        for(int i = pos1; i < pos2; i++){
            String song = this.Playlist.remove(i);
            s.Playlist.add(song, j)
            j++;
        }
     }

@Override
    public static boolean lookUp(String){
        boolean isIn = false;
        for (String x : this.Playlist) {
            if (x.equals(song)) {
                isIn = true;
            }
        }
        return isIn;
         }

    @Override
    public String toString() {
        StringBuffer buf = new StringBuffer();
        for (int i = 0; i < this.Playlist.length(); i++) {
            String song = this.Playlist.remove(0);
            buf.append(song);
            buf.append(", ");
        }
        return buf.toString();
    }

    @Override
    public boolean equals(Object play2) {
        boolean isEqual = false;
        if (Playlist == play2) {
            isEqual = true;
        }
        if (Playlist == null || play2 == null) {
            isEqual = false;
        }
        return isEqual;
    }

}
