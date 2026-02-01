package nl.hva.board;
/*

import nl.hva.shape.Circle;
import nl.hva.shape.Rectangle;
import nl.hva.shape.Shape;
import java.awt.Color;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BoardTest {
    Circle circle1, circle2, circle3;
    Rectangle rectangle1, rectangle2, rectangle3;
    Board<Rectangle> rectangleBoard;
    Board<Circle> circleBoard;

    Shape [] shapeArray;
    int boardSize = 3;
    @BeforeEach
    void setUp() {
        circle1 = new Circle(Color.BLACK,10);
        circle2 = new Circle(Color.BLACK,10);
        circle3 = new Circle(Color.BLUE,10);
        rectangle1 = new Rectangle(Color.BLUE, 4,5);
        rectangle2 = new Rectangle(Color.BLUE, 4,5);
        rectangle3 = new Rectangle(Color.BLUE,2,10);

        rectangleBoard = new Board<>(boardSize);
        shapeArray = new Shape[boardSize*boardSize];
        int count = 0;
        for (int y =0; y <boardSize; y++ ){
            for (int x = 0; x< boardSize; x++) {
                Rectangle r = new Rectangle(Color.BLUE, count+1, count+1);
                rectangleBoard.add(r);
                shapeArray[count] = r;
                count++;
            }
        }
        circleBoard = new Board<>(1);
    }
    @Test
    void board_size_is_correct(){
        assertEquals(rectangleBoard.getSize(), boardSize*boardSize);
    }
    @Test
    void board_row_size_is_correct(){
        assertEquals(rectangleBoard.getRowSize(), boardSize);
    }
    @Test
    void can_add_one_shape(){
        assertTrue(rectangleBoard.add(rectangle1,0,0));
    }
    @Test
    void iterator_correctly_returns_the_shapes() {
        int count = 0;
        for (Rectangle rectangle : rectangleBoard) {

            System.out.println(rectangle);
            System.out.println(shapeArray[count]);
            assertEquals(rectangle, shapeArray[count]);
            count++;

        }
        assertEquals(rectangleBoard.getSize(),count);

    }
    @Test
    void add_works_after_iterator(){
        for (Rectangle rectangle : rectangleBoard) {
            System.out.println(rectangle);
        }
        //rectangleBoard.remove(boardSize-1, boardSize-1);
        assertTrue(rectangleBoard.add(rectangle1,boardSize-1, boardSize-1));
    }
    @Test
    void iterator_works_with_board_of_one(){

        circleBoard.add(circle1, 0,0 );
        for (Circle circle : circleBoard) {
            assertEquals(circle1, circle);
        }
    }
    @Test
    void board_can_have_size_1(){
        //a Board of size 1 (a grid of 1 by 1) can only add a Shape at position 0, 0
        //when a shape is added it returns true
        assertTrue(circleBoard.add(circle1, 0, 0));
        //this should not crash but just return false
        assertFalse(circleBoard.add(circle2, 1, 1));

    }
    @Test
    void shape_can_be_added(){
        assertTrue(rectangleBoard.add(rectangle1, 1, 2));
    }
    @Test
    void shape_can_be_removed(){
        rectangleBoard.add(rectangle1, 1, 2);
        assertEquals(rectangle1, rectangleBoard.remove(1,2));
        assertNull(rectangleBoard.get(1,2));
    }
    @Test
    void add_out_of_bounds_does_not_cause_problems(){
        assertTrue(circleBoard.add(circle2, 0, 0));
        assertFalse(circleBoard.add(circle2, -1, -1));
        assertFalse(circleBoard.add(circle2, 1, 1));
    }
    @Test
    void clear_board_removes_all_shapes(){
        rectangleBoard.clear();
        for (Rectangle rectangle : rectangleBoard) {
            assertNull(rectangle);
        }
    }

    @Test
    void cleared_board_can_be_refilled(){
        rectangleBoard.clear();
        for (Rectangle rectangle: rectangleBoard) {
             rectangle = new Rectangle(Color.GREEN,2,4);
            assertTrue(rectangleBoard.add(rectangle));
        }
    }

    @Test
    void can_add_shapes_at_expected_position(){
        rectangleBoard.add(new Rectangle(Color.CYAN, 5,10), 1, 2);
        assertEquals(rectangleBoard.get(1,2).getArea(), 50);
    }

    @Test
    void shapes_can_be_added_sequentially(){
        Board sequentialBoard = new Board(3);
        sequentialBoard.add (new Rectangle(Color.CYAN, 1,1));
        sequentialBoard.add (new Rectangle(Color.CYAN, 2,2));
        sequentialBoard.add (new Rectangle(Color.CYAN, 3,3));
        sequentialBoard.add (new Rectangle(Color.CYAN, 4,4));

        assertEquals(sequentialBoard.get(0,1).getArea(), 16);
    }

    @Test
    void sequential_add_continues_after_interruption(){
        Board sequentialBoard = new Board(3);
        sequentialBoard.add (new Rectangle(Color.CYAN, 1,1));
        sequentialBoard.add (new Rectangle(Color.CYAN, 2,2));
        sequentialBoard.add (new Rectangle(Color.CYAN, 3,3), 0,2);
        sequentialBoard.add (new Rectangle(Color.CYAN, 3,3));
        sequentialBoard.add (new Rectangle(Color.CYAN, 4,4));

        assertEquals(sequentialBoard.get(0,1).getArea(), 16);
    }
}
*/
