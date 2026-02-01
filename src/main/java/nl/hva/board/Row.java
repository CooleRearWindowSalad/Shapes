package nl.hva.board;

import nl.hva.shape.Shape;

import java.util.Iterator;

/**
 * A class for holding descendants of the Shape class.
 * @param <S>
 */
    //TODO - First write the Row class without implementing Iterable
    //  the class definition would look like this:  public class Row<S extends Shape> .
    // As a second part, make the Row iterable: public class Row<S extends Shape> implements Iterable<S>.
    // You will then need to write the code for returning the Iterator (see end).
    public class Row<S extends Shape> implements Iterable<S> {

    //Use an array to store shapes.
    //TODO declare an array of shapes.  The array must be declared to hold Shape not S.
    private Shape[] shapes;

    /**
     * Create a Row with a given size.  If the size is less than 1 then the size will be 1
     * @param size the number of shapes in the row
     */
    //TODO - write a constructor for the Row class - it should ensure that the size is at least 1
    public Row(int size) {
        if (size < 1) {
            size = 1;
        }
    }

    /**
     * Add a shape at the position supplied.  If the shape is successfully added
     * then true will be returned.  If not, (if the position is not within the size of the Row), then false will be returned.
     * @param s the Shape that will be added
     * @param x the position at which the Shape will be added
     * @return true if the Shape is added, else false.
     */
    //TODO - uncomment the method signature below
    //TODO write code to add the s to the array
    // at the position supplied.  You will need to update the variable keeping track of the latest shape added.
    // Good practice is to create a method for checking the bounds because it will be used a number of times.
    public boolean add (S s, int x) {
        if (x >=0 && 0 <= shapes.length - 1) {
            shapes[x] = s;
            return true;
        }
        return false;
    }

    /**
     * Remove and return the Shape at the position supplied. Removal means that
     * if found, the Shape at the given position will be set to null.
     * @param x the position of the Shape in the row
     * @return the Shape found at that position or null
     */
    //TODO - uncomment the method signature
    //public S remove(int x){
    //TODO check that x is within bounds and remove (and return) the Shape at
    // that position or null if there is no Shape or the position is out of bounds.

    /**
     * Get the Shape at the position supplied.  If there is no Shape or the position is out of bounds,
     * null will be returned.
     * @param x the position of the desired Shape
     * @return the Shape
     */
    //public S get(int x){
    //TODO check that x is within bounds (you should have method for this) and return
    // either the Shape at that position, or null.

    /**
     * Get the size of this Row.
     * @return the size.
     */
    //TODO - complete the method

    /**
     * Remove all shapes from the Row.  All positions should be set to null.
     */
    //TODO write the method clear()


    /**
     * A Row should be displayed by returning a String with names of
     * Shapes in the row separated by a comma.  If there is no Shape at
     * a given position, then "No shape" should appear.  An example is below:
     * Circle,Circle,Circle,No shape,Rectangle,
     * Hint:  use shape.getClass.getSimpleName() to get the name of the class.
     * Using a StringBuilder to build the String is better practice than appending to
     * a String like this:
     * String rowString "";
     * rowString = rowString + "No shape,"
     * @return a String containing the details of this Row
     */
    //TODO - write the toString method

    /**
     *
     * @return a RowIterator instance - an iterator of this row.
     */
    //TODO - when you have written the second version of Row and the RowIterator class (below),
    // uncomment the code below:
    @Override
     public Iterator<S> iterator() {
        return new RowIterator<>();
    }

    //TODO:  write an inner class which will be able to iterate over a Row.
    //It is useful to do this as an inner class because it can access all the
    //fields and methods of the enclosing class (in this case: Row).

    // private class RowIterator<S extends Shape> implements Iterator {
    //TODO:  declare an int called index to hold the position of the current Row element.

    //TODO:  write an implementation of hasNext().  hasNext() will return true if
    // there is a next element.  Is the index still less than the length of the row?

    //TODO:  write an implementation of next().  next() will return the next element of the Row.
    //Hint:  the code should get the element in the row, increment the index, and return the element.  Unfortunately
    //due to some strange workings in Java, the element that you are getting needs to be cast to S.  So the code
    // is given below.
}

