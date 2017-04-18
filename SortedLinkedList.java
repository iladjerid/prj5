package prj5;

/**
 * @author Kayley Bogemann (kayley25)
 * @version 2017.04.17
 *
 */
public class SortedLinkedList<T extends Comparable<? super T>>
    implements SortedListInterface<T> {
    private LList<T> list;


    /**
     * default constructor
     */
    public SortedLinkedList() {
        list = new LList<T>();
    }


    /**
     * compares two objects for equality
     * 
     * @param object
     *            being compared
     * @return 0 if equal, negative number if this is less than, positive number
     *         if this is greater than
     */
    @Override
    public int compareTo(T arg0) {
        // TODO Auto-generated method stub
        return 0;
    }


    /**
     * adds an entry to end of list
     * 
     * @param newEntry
     *            entry to be added
     */
    @Override
    public void add(T newEntry) {
        list.add(newEntry);
    }


    /**
     * removes a given entry
     * 
     * @param anEntry
     *            entry to be removed
     * @return true if successfully removed
     */
    @Override
    public boolean remove(T anEntry) {
        if (list.contains(anEntry)) {
            for (int i = 1; i <= list.getLength(); i++) {
                if (list.getEntry(i) == anEntry) {
                    list.remove(i);
                }
            }
            return true;
        }
        else {
            return false;
        }
    }


    /**
     * get position of a given entry
     * 
     * @param anEntry
     *            entry to find position of
     * @return position of entry
     */
    @Override
    public int getPosition(T anEntry) {
        if (!list.contains(anEntry)) {
            return (list.getLength() + 1) * -1;
        }
        else {
            for (int i = 0; i < list.getLength(); i++) {
                if (list.getEntry(i) == anEntry) {
                    return i;
                }
            }
        }
        return 0;
    }


    /**
     * gets an entry at a given position
     * 
     * @param givenPosition
     *            position to retrieve entry at
     * @return entry at given position
     */
    @Override
    public T getEntry(int givenPosition) {
        return list.getEntry(givenPosition);
    }


    /**
     * checks if list contains a given entry
     * 
     * @param anEntry
     *            entry to be checked for containing
     * @return true if contains
     */
    @Override
    public boolean contains(T anEntry) {
        return list.contains(anEntry);
    }


    /**
     * removes an object at a given position
     * 
     * @param givenPosition
     *            position to remove object at
     * @return removed object
     */
    @Override
    public T remove(int givenPosition) {
        T removed = list.remove(givenPosition);
        return removed;
    }


    /**
     * clears list
     */
    @Override
    public void clear() {
        list.clear();
    }


    /**
     * gets length of list
     * 
     * @return length of list
     */
    @Override
    public int getLength() {
        return list.getLength();
    }


    /**
     * checks if list is empty
     * 
     * @return true if empty
     */
    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }


    /**
     * changes list to an array
     * 
     * @return array representation of list
     */
    @SuppressWarnings("unchecked")
    @Override
    public T[] toArray() {
        return (T[])list.toArray();
    }

}
