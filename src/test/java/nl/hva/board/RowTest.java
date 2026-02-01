package nl.hva.board;
/*

import nl.hva.shape.Circle;
import nl.hva.shape.Rectangle;
import nl.hva.shape.Shape;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.Color;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RowTest {
    Circle circle1, circle2, circle3;
    Rectangle rectangle1, rectangle2, rectangle3;
    Row <Rectangle> rectangleRow;
    Row <Circle> circleRow;

    int rowSize = 4;
    Shape [] shapeArray;
    @BeforeEach
    void setUp() {
        circle1 = new Circle(Color.BLACK,10);
        circle2 = new Circle(Color.BLACK,10);
        circle3 = new Circle(Color.BLUE,10);
        rectangle1 = new Rectangle(Color.BLUE, 4,5);
        rectangle2 = new Rectangle(Color.BLUE, 4,5);
        rectangle3 = new Rectangle(Color.BLUE,2,10);

        rectangleRow = new Row<>(rowSize);
        rectangleRow.add(rectangle1,0);
        rectangleRow.add(rectangle2, 1);
        rectangleRow.add(rectangle3, 2);

        circleRow = new Row<>(1);

        shapeArray = new Shape[rowSize];

    }
    //A row should have a minimum size of one.
    @Test
    void row_has_a_minimum_size(){
        Row<Shape> r = new Row<>(-1);
        assertEquals(1, r.getSize());
    }
    @Test
    void row_of_size_one_can_accept_shape(){
        //when a shape is added it returns true
        assertTrue(circleRow.add(circle1, 0));
        //this should not crash but just return false
        assertFalse(circleRow.add(circle2, 1));
    }

    @Test
    void shape_can_be_added(){
        //a shape can be added to the last place of the row
        assertTrue(rectangleRow.add(rectangle1, 3));

    }
    @Test
    void adding_shape_replaces_existing_shape(){
        //a shape can be added to the last place of the row
        rectangleRow.add(rectangle1, 3);
        rectangleRow.add (new Rectangle(Color.BLACK, 4,4), 3);
        assertEquals(rectangleRow.get(3).getArea(), 16);

    }
    @Test
    void cannot_add_more_than_row_size(){
        //trying to add a shape to a place outside the row returns false
        assertFalse(
                rectangleRow.add(new Rectangle(Color.BLUE, 4,4),
                        rectangleRow.getSize()+1));
    }
    @Test
    void cannot_add_less_than_position_zero(){
        assertFalse(
                rectangleRow.add(new Rectangle(Color.BLUE, 4,4),
                        -1));
    }
    @Test
    void shape_can_be_retrieved(){
        rectangleRow.add(rectangle1, 3);
        Rectangle r = rectangleRow.get(3);
        assertEquals(r, rectangle1);
    }
    @Test
    void shape_retrieval_is_not_removal(){
        rectangleRow.add(rectangle1, 3);
        Rectangle r = rectangleRow.get(3);
        assertNotNull(rectangleRow.get(3));
    }
    @Test
    void removed_shape_is_returned(){
        Rectangle r = rectangleRow.remove(0);
        assertEquals(r, rectangle1);
    }
    @Test
    void removed_shape_leaves_space_in_row(){
        // when a shape is removed from a row, the position occupied by the shape is set to null.
        Rectangle r = rectangleRow.remove(0);
        assertNull(rectangleRow.get(0));
    }

    @Test
    void shape_removal_at_illegal_position_is_safe(){
        assertNull(rectangleRow.remove(rowSize+1));
        assertNull(rectangleRow.remove(-1));
    }

    @Test
    void shape_can_be_removed(){
       rectangleRow.add(rectangle1, 3);
        assertEquals(rectangle1, rectangleRow.remove(3));
        assertNull(rectangleRow.get(3));
    }
    @Test
    void shapes_can_be_cleared(){
        assertNotNull(rectangleRow.get(0));
        rectangleRow.clear();
        assertNull(rectangleRow.get(0));
    }
    //There may be differences on some platforms that cause this test to fail,
    //even if the output of toString is correct.
    @Test
    void to_string_prints_correctly(){
        Row<Shape> row = new Row<>(5);
        row.add (new Circle(Color.BLUE,80), 0);
        row.add (new Circle(Color.GREEN,100), 1);
        row.add (new Circle(Color.YELLOW,75), 2);
        row.add (new Rectangle((Color.CYAN), 100, 45),4);

        assertEquals(row.toString(), "Circle,Circle,Circle,No shape,Rectangle,");

    }
}
*/
