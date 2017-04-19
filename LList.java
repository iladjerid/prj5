package prj5;

import list.ListInterface;

/**
 * @author Kayley Bogemann (kayley25)
 * @version 2017.04.17
 * class used to set up the data structure for LList
 * to be used to sort through out our program
 *
 */
public class LList<T> implements ListInterface<T> {
    private Node firstNode; // Reference to first node of chain
    private int numberOfEntries;


    /**
     * default constructor
     */
    public LList() {
        initializeDataFields();
    }


    /**
     * adds a new entry to end of list
     * 
     * @param newEntry
     *            entry to be added
     */
    @Override
    public void add(T newEntry) {
        Node newNode = new Node(newEntry);
        if (isEmpty()) {
            firstNode = newNode;
        }
        else {
            Node lastNode = getNodeAt(numberOfEntries);
            lastNode.setNextNode(newNode);
        }
        numberOfEntries++;
    }


    /**
     * adds an entry at a given position
     * 
     * @param givenPosition
     *            position entry to be added at
     * @param newEntry
     *            entry to be added
     */
    @Override
    public void add(int givenPosition, T newEntry) {
        Node beforeNode = getNodeAt(givenPosition - 1);
        Node currentNode = beforeNode.getNextNode();
        Node newNode = new Node(newEntry);
        beforeNode.setNextNode(newNode);
        newNode.setNextNode(currentNode);
        numberOfEntries++;
    }


    /**
     * clears list
     */
    @Override
    public void clear() {
        initializeDataFields();
    }


    /**
     * Initializes the class's data fields to indicate and empty list
     */
    private void initializeDataFields() {
        firstNode = null;
        numberOfEntries = 0;
    }


    /**
     * Precondition: List is not empty;
     * 1 <= givePosition <= numberOfEntries
     * 
     * @param givenPosition
     *            position to get node at
     * @return a reference to the node at a given position
     */
    private Node getNodeAt(int givenPosition) {
        assert (firstNode != null) && (1 <= givenPosition)
            && (givenPosition <= numberOfEntries);
        Node currentNode = firstNode;
        for (int i = 1; i < givenPosition; i++) {
            currentNode = currentNode.getNextNode();
        }
        assert currentNode != null;
        return currentNode;
    }


    /**
     * checks if list contains an entry
     * 
     * @param anEntry
     *            entry to be checked for
     * @return true if contains entry
     */
    @Override
    public boolean contains(T anEntry) {
        if (anEntry == null || numberOfEntries == 0) {
            return false;
        }
        Node currentNode = firstNode;
        for (int i = 1; i < numberOfEntries; i++) {
            if (currentNode.getData() == anEntry) {
                return true;
            }
            else {
                currentNode = currentNode.getNextNode();
            }
        }
        return false;
    }


    /**
     * gets an entry at a given position
     * 
     * @param givenPosition
     *            position to get entry at
     * @return entry's data
     */
    @Override
    public T getEntry(int givenPosition) {
        if ((givenPosition >= 1) && (givenPosition <= numberOfEntries)) {
            assert !isEmpty();
            return getNodeAt(givenPosition).getData();
        }
        else {
            throw new IndexOutOfBoundsException(
                "Illegal position given to getEntry operation");
        }
    }


    /**
     * gets length of list
     * 
     * @return length of list
     */
    @Override
    public int getLength() {
        return numberOfEntries;
    }


    /**
     * decides if list is empty
     * 
     * @return true if empty
     */
    @Override
    public boolean isEmpty() {
        return numberOfEntries == 0;
    }


    /**
     * removes node at given position
     * 
     * @param givenPosition
     *            position to remove node at
     * @return removed entry's data
     */
    @Override
    public T remove(int givenPosition) {
        T result = null;
        if ((givenPosition >= 1) && (givenPosition <= numberOfEntries)) {
            assert !isEmpty();
            if (givenPosition == 1) {
                result = firstNode.getData();
                firstNode = firstNode.getNextNode();
            }
            else {
                Node nodeBefore = getNodeAt(givenPosition - 1);
                Node nodeToRemove = nodeBefore.getNextNode();
                result = nodeToRemove.getData();
                Node nodeAfter = nodeToRemove.getNextNode();
                nodeBefore.setNextNode(nodeAfter);
            }
            numberOfEntries--;
            return result;
        }
        else {
            throw new IndexOutOfBoundsException(
                "Illegal position given to remove operation");
        }
    }


    /**
     * replaces an entry with a new entry at a certain position
     * 
     * @param givenPosition
     *            position to replace node at
     * @param newEntry
     *            entry that is replacing node
     * @return entry that was replaced's data
     */
    @Override
    public T replace(int givenPosition, T newEntry) {
        if ((givenPosition >= 1) && (givenPosition <= numberOfEntries)) {
            assert !isEmpty();
            Node desiredNode = getNodeAt(givenPosition);
            T originalEntry = desiredNode.getData();
            desiredNode.setData(newEntry);
            return originalEntry;
        }
        else {
            throw new IndexOutOfBoundsException(
                "Illegal position given to replace operation");
        }
    }


    /**
     * changes list to an array object
     * 
     * @return array representation of list
     */
    @Override
    public Object[] toArray() {
        if (numberOfEntries == 0) {
            return null;
        }
        Object[] newArray = new Object[numberOfEntries - 1];
        Node currentNode = firstNode;
        for (int i = 1; i < numberOfEntries; i++) {
            newArray[i - 1] = currentNode.getData();
            currentNode = currentNode.getNextNode();
        }
        return newArray;
    }


    /**
     * private inner class
     * 
     * @author Kayley Bogemann
     * @version 2017.04.17
     *
     */
    private class Node {
        private T data;
        private Node next;


        /**
         * Constructor
         * 
         * @param dataPortion
         *            data to be entered into node
         */
        public Node(T dataPortion) {
            data = dataPortion;
            next = null;
        }


        /**
         * gets next node in list
         * 
         * @return next node in list
         */
        public Node getNextNode() {
            return next;
        }


        /**
         * sets next node in list
         * 
         * @param node
         *            Node to be set
         */
        public void setNextNode(Node node) {
            next = node;
        }


        /**
         * gets node data
         * 
         * @return data in node
         */
        public T getData() {
            return data;
        }


        /**
         * sets data
         * 
         * @param newEntry
         *            data to be set
         */
        public void setData(T newEntry) {
            data = newEntry;
        }

    }

}
