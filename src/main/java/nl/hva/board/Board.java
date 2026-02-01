package nl.hva.board;

import nl.hva.shape.Shape;

import java.util.Iterator;

/**
 * A class to hold Shapes in a 2D Grid.
 * @param <S>
 */
//TODO - write the class definition for Board  - it must have a generic type <S extends Shape> and
// it must implement the Iterable interface (with a generic type <S> )

//TODO - declare instance fields to hold an array of Row (with a generic type S)
//TODO - declare two int instance fields for the current position of x and y (in the grid)

    /**
     * Create a board of the given size.  The board
     * is always square.
     * @param size
     */
    //TODO - write a constructor for Board.  It must have a parameter for the size and
    //it should ensure that the size is at least 1

    /**
     * Add a Shape at the given position.  Position 0,0 is the first position on the Board.
     * A Board with row size (getRowSize) 4, (size - total number of positions = 16), will have a last position of 3,3
     * @param s - the Shape to add
     * @param x - the horizontal position (column) of the Shape
     * @param y - the vertical position (row) of the Shape.
     * @return
     */
    //TODO write the method to add a Shape at a specified position.  You will need an S as a parameter and
    //the x and y position. The method should return true (if the shape is added) or false.


    /**
     * Add shapes sequentially.  This will fill row by row until the board is full. It will overwrite shapes
     * already in the Board.  It is reset by clearing the board.
     * @param s
     * @return
     */
    //TODO - write the method.  It only needs a parameter of type S


    /**
     * The returns a reference to the Shape at the position specified, leaving the Shape in the Board.
     * @param x
     * @param y
     * @return a reference to the Shape or null if there is no S at that position.
     */
    //TODO - write a method to return S at the position x, y

    /**
     * Returns a reference to the Shape at the position specifed and deletes the Shape in the Board.
     * @param x
     * @param y
     * @return a reference to S or null if there is no S at that position.
     */
    //TODO - write a method to remove the S from a given position and return the S.  You should make use of the remove
    // method in Row


    /**
     * Gets the dimension of the Board.
     * @return the size of one row (the board is square)
     */
    //TODO write a method to get the row size of this Board


    /**
     * The grid size is the total number of positions in the board (width X length)
     * @return the total size of the board
     */
    //TODO - write a method to get the size (total positions) in the Board

    /**
     * Removes all Shapes from the Board.
     */
    //TODO - write a method to clear the Board of all shapes.

//TODO use this method to initial the board's grid
    /*private void initializeGrid(int size){

        grid = new Row[size];
        for (int x = 0; x < size; x++){
            grid[x] = new Row<>(size);
        }
        currentX = currentY = 0;
    }*/

    /**
     * Returns a String containing information about this Grid.This method makes use of
     * Row toString, printing each Row on a new line.  The output is something like:
     * Circle,Circle,Circle,Circle,
     * Rectangle,No shape,No shape,Circle,
     * Circle,No shape,No shape,Circle,
     * Circle,No shape,No shape,Rectangle,
     * @return a String describing this Board
     */
    //TODO - override the toString method

//TODO - override the iterator() method (see code in Row for help)


    //TODO write the class definition for BoardIterator (see RowIterator for hint)


    //TODO - declare two instance fields: int to keep a y index and
    // a RowIterator

    //TODO - Write the constructor for BoardIterator

    //TODO - write the hasNext method (you should call rowIterator.hasNext() )

    //TODO - write the next() method (you should call rowIterator. next() )

