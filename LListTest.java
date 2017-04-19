
package prj5;

import student.TestCase;

/**
 * Test class for the LList class
 * @author Kayley Bogemann (kayley25)
 * @version 2017.04.18
 *
 */
public class LListTest extends TestCase {
    private LList<String> testList;


    /**
     * sets up each test case
     */
    public void setUp() {
        testList = new LList<String>();
    }


    /**
     * tests to make sure the add() method works as expected
     */
    public void testAdd() {
        testList.add("hi");
        testList.add("bye");
        testList.add("yo");
        assertEquals(3, testList.getLength());
        testList.add(2, "lol");
        assertEquals("lol", testList.getEntry(2));
    }


    /**
     * tests to make sure the clear() method works as expected
     */
    public void testClear() {
        testList.add("hi");
        testList.add("lol");
        testList.clear();
        assertEquals(0, testList.getLength());
    }


    /**
     * tests to make sure the contains() method works as expected
     */
    public void testContains() {
        assertFalse(testList.contains("hi"));
        assertFalse(testList.contains(null));
        testList.add("hi");
        testList.add("bye");
        assertFalse(testList.contains("lol"));
        assertTrue(testList.contains("bye"));
    }


    /**
     * tests to make sure the getEntry() method works as expected
     */
    public void testGetEntry() {
        testList.add("yo");
        testList.add("hi");
        testList.add("bye");
        assertEquals("hi", testList.getEntry(2));
        Exception exception = null;
        try {
            testList.getEntry(0);
        }
        catch (Exception e) {
            exception = e;
        }
        assertTrue("getEntry() is throwing the wrong type of exceptions",
            exception instanceof IndexOutOfBoundsException);
        try {
            testList.getEntry(4);
        }
        catch (Exception e) {
            exception = e;
        }
        assertTrue("getEntry() is throwing the wrong type of exceptions",
            exception instanceof IndexOutOfBoundsException);
    }


    /**
     * tests to make sure the getLength() method works as expected
     */
    public void testGetLength() {
        testList.add("hi");
        testList.add("bye");
        assertEquals(2, testList.getLength());
    }


    /**
     * tests to make sure the isEmpty() method works as expected
     */
    public void testIsEmpty() {
        assertTrue(testList.isEmpty());
        testList.add("hi");
        assertFalse(testList.isEmpty());
    }


    /**
     * tests to make sure the remove() method works as expected
     */
    public void testRemove() {
        testList.add("hi");
        testList.add("bye");
        assertEquals("hi", testList.remove(1));
        testList.add("hi");
        assertEquals("hi", testList.remove(2));
        Exception exception = null;
        try {
            testList.remove(0);
        }
        catch (Exception e) {
            exception = e;
        }
        assertTrue("remove() is throwing the wrong type of exceptions",
            exception instanceof IndexOutOfBoundsException);
        try {
            testList.remove(2);
        }
        catch (Exception e) {
            exception = e;
        }
        assertTrue("remove() is throwing the wrong type of exceptions",
            exception instanceof IndexOutOfBoundsException);
    }


    /**
     * tests to make sure the replace() method works as expected
     */
    public void testReplace() {
        testList.add("hi");
        testList.add("bye");
        testList.add("lol");
        assertEquals("bye", testList.replace(2, "yo"));
        assertEquals("yo", testList.getEntry(2));
    }


    /**
     * tests to make sure the toArray() method works as expected
     */
    public void testToArray() {
        LList<?> nullList = null;
        assertEquals(nullList, testList.toArray());
        testList.add("hi");
        testList.add("bye");
        Object[] newArray = { "hi", "bye" };
        assertEquals(newArray, testList.toArray());
    }
}
