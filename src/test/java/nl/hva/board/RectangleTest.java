package nl.hva.board;


import nl.hva.shape.Shape;
import nl.hva.shape.Rectangle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;


class RectangleTest {

    Rectangle rectangle1, rectangle2, rectangle3;

    @BeforeEach
    void setUp() {
        rectangle1 = new Rectangle(Color.BLUE, 4,5);
        rectangle2 = new Rectangle(Color.BLUE, 4,5);
        rectangle3 = new Rectangle(Color.BLUE,2,10);
    }
    //This test is really being used to assess how the class designed.  It is
    //not really a normal unit test.
    @Test
    void rectangle_instance_of_shape(){
        assertTrue(rectangle1 instanceof Shape);
    }

    @Test
    void rectangle_area_is_correct() {
        assertEquals(20, rectangle1.getArea());
    }

    @Test
    void rectangle_has_single_parameter_constructor(){
        rectangle1 = new Rectangle(Color.BLUE, 6);
        assertEquals(rectangle1.getWidth(), rectangle1.getLength());
    }
    @Test
    void width_can_be_changed(){
        rectangle1.setWidth(55);
        assertTrue(rectangle1.getWidth()==55);
    }

    @Test
    void length_can_be_changed(){
        rectangle1.setLength(55);
        assertTrue(rectangle1.getLength()==55);
    }

   @Test
    void two_rectangles_are_equal() {
        assertTrue(rectangle1.equals(rectangle2));
    }
    @Test
    void equal_area_does_not_mean_equality(){
        Rectangle r1 = new Rectangle(Color.YELLOW, 4, 4);
        Rectangle r2 = new Rectangle(Color.YELLOW, 2,8);
        assertFalse(r1.equals(r2));
        assertTrue(r1.getArea()== r2.getArea());
    }
    @Test
    void hash_code_equal() {
        assertTrue(rectangle1.hashCode() == rectangle2.hashCode());
    }

}
