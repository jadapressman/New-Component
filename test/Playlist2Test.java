/**
 * Testing structure for the abstract class.
 */
public class Playlist2Test {

    /**
     * testing entry.
     */
    @Test
    public void testEntry() {
        Playlist p = new Playlist2();
        Playlist pCopy = new Playlist2();
        p.add(0, "Baby");
        pCopy.add(0, "Baby");
        assertEquals(pCopy.entry(0), p.entry(0));
        assertEquals(pCopy, p);
    }

    /**
     * testing swap song.
     */
    @Test
    public void testSwapSong() {
        Playlist p = new Playlist2();
        Playlist pCopy = new Playlist2();
        p.add(0, "Baby");
        p.add(1, "All of Me");
        pCopy.add(0, "All of Me");
        pCopy.add(1, "Baby");
        p.swapSong(0, 1);
        assertEquals(pCopy.entry(0), p.entry(0));
        assertEquals(pCopy.entry(1), p.entry(1));
        assertEquals(pCopy, p);
    }

    /**
     * testing append.
     */
    @Test
    public void testAppend() {
        final int three = 3;
        Playlist p1 = new Playlist2();
        Playlist p2 = new Playlist2();
        Playlist pCopy = new Playlist2();
        p1.add(0, "Baby");
        p1.add(1, "All of Me");
        p2.add(0, "Hello");
        p2.add(1, "Happy");
        p1.append(p2);
        pCopy.add(0, "Baby");
        pCopy.add(1, "All of Me");
        pCopy.add(2, "Hello");
        pCopy.add(three, "Happy");
        assertEquals(pCopy, p1);
    }

    /**
     * testing insert.
     */
    @Test
    public void testInsert() {
        Playlist p1 = new Playlist2();
        Playlist p2 = new Playlist2();
        Playlist pCopy = new Playlist2();
        p1.add(0, "Baby");
        p1.add(1, "All of Me");
        p2.add(0, "Hello");
        pCopy.add(0, "Baby");
        p1.insert(1, p2);
        pCopy.add(1, "Hello");
        pCopy.add(2, "All of Me");

        assertEquals(pCopy, p1);
    }

    /**
     * testing extract.
     */
    @Test
    public void testExtract() {
        final int three = 3;
        Playlist p1 = new Playlist2();
        Playlist p2 = new Playlist2();
        Playlist pCopy = new Playlist2();
        p1.add(0, "Baby");
        p1.add(1, "All of Me");
        p1.add(2, "Hello");
        p1.add(three, "Happy");
        pCopy.add(0, "All of Me");
        pCopy.add(1, "Hello");
        p1.extract(1, three, p2);

        assertEquals(pCopy, p1);
    }

    /**
     * testing look up when it is true.
     */
    @Test
    public void testLookUpTrue() {
        Playlist p = new Playlist2();
        Playlist pCopy = new Playlist2();
        p.add(0, "Baby");
        assertEquals(true, p.lookUp("Baby"));
    }

    /**
     * testing look up when it is false.
     */
    @Test
    public void testLookUpFalse() {
        Playlist p = new Playlist2();
        Playlist pCopy = new Playlist2();
        assertEquals(false, p.lookUp("Baby"));
    }
}
