
package prj5;

import student.TestCase;

/**
 * @author Kayley Bogemann (kayley25)
 * @version 2017.04.17
 *
 */
public class SongTest extends TestCase {
    private Song testSong;


    /**
     * sets up each test case
     */
    public void setUp() {
        testSong = new Song("Somebody To Love", "Queen", "Classic Rock", 1976);
    }


    /**
     * tests to make sure the getGenre() method works as expected
     */
    public void testGetGenre() {
        assertEquals("Classic Rock", testSong.getGenre());
    }


    /**
     * tests to make sure the getArtist() method work as expected
     */
    public void testGetArtist() {
        assertEquals("Queen", testSong.getArtist());
    }


    /**
     * tests to make sure the getName() method works as expected
     */
    public void testGetName() {
        assertEquals("Somebody To Love", testSong.getName());
    }


    /**
     * tests to make sure the getYear() method works as expected
     */
    public void testGetYear() {
        assertEquals(1976, testSong.getYear());
    }


    /**
     * tests to make sure the toString() method works as expected
     */
    public void testToString() {
        StringBuilder s = new StringBuilder();
        s.append("Song Title: ");
        s.append("Somebody To Love");
        s.append("\nSong Artist: ");
        s.append("Queen");
        s.append("\nSong Genre: ");
        s.append("Classic Rock");
        s.append("\nSong Year: ");
        s.append(1976);
        assertEquals(s.toString(), testSong.toString());
    }


    /**
     * tests to make sure the equals() method works as expected
     */
    public void testEquals() {
        assertTrue(testSong.equals(testSong));
        Song otherSong = new Song("Hello", "Adele", "Pop", 2015);
        assertFalse(testSong.equals(otherSong));
        Song sameSong = new Song("Somebody To Love", "Queen", "Classic Rock",
            1976);
        assertTrue(testSong.equals(sameSong));
        int x = 0;
        assertFalse(testSong.equals(x));
        Song nullSong = null;
        assertFalse(testSong.equals(nullSong));
    }
}
