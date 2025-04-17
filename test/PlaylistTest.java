/**
 * Testing structure for the kernel class.
 */
public class PlaylistTest {

    /**
     * testing add.
     */
    @Test
    public void testAdd() {
        Playlist p = new Playlist2();
        Playlist pCopy = new Playlist2();

        p.add(0, "Baby")
        pCopy.add(0, "Baby")
        assertEquals(pCopy, p);
    }

    /**
     * testing remove.
     */
    @Test
    public void testRemove() {
        Playlist p = new Playlist2();
        Playlist pCopy = new Playlist2();

        p.add(0, "Baby")
        p.remove(0);

        assertEquals(pCopy, p);
    }

    /**
     * testing skip.
     */
    @Test
    public void testSkip() {
        Playlist p = new Playlist2();
        Playlist pCopy = new Playlist2();
        p.add(0, "Baby")
        p.add(1, "All of Me")
        pCopy.add(0, "All of Me")
        p.skip();
        assertEquals(pCopy, p);
    }

    /**
     * testing length when empty.
     */
    @Test
    public void testLengthEmpty() {
        Playlist p = new Playlist2();
        Playlist pCopy = new Playlist2();
        assertEquals(0, p.length());
        assertEquals(pCopy, p);
    }

    /**
     * testing length when non empty.
     */
    @Test
    public void testLengthNonEmpty() {
        Playlist p = new Playlist2();
        Playlist pCopy = new Playlist2();
        p.add(0, "Baby");
        pCopy.add(0, "Baby");
        assertEquals(1, p.length());
        assertEquals(pCopy, p);
    }
}
