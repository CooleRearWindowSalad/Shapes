package nl.hva.board;


import nl.hva.shape.Circle;
import nl.hva.shape.Shape;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

public class CircleTest {
    Circle circle1, circle2, circle3;

    @BeforeEach
    void setUp() {
        circle1 = new Circle(Color.BLACK,10);
        circle2 = new Circle(Color.BLACK,10);
        circle3 = new Circle(Color.BLACK,20);
    }
    @Test
    void circle_is_instance_of_Shape(){
        assertTrue(circle1 instanceof Shape);
    }
    @Test
    void circle_radius_can_be_changed(){
        circle1 = new Circle(Color.BLACK, 5);
        circle1.setRadius(6);
        assertTrue(circle1.getRadius() ==6);
    }

    @Test
    void circle_area_is_correct() {
        assertEquals(314.1592653589793, circle1.getArea());
    }

    @Test
    void two_circles_are_equal() {
        assertTrue(circle1.equals(circle2));
        assertFalse(circle1.equals(circle3));
    }


    /*
     * This is not really correct as a unit test because it is testing the (likely)
     * implementation of the hashCode method in the Circle class.  Here the test is
     * being used to do a check that might be done by a code reviewer (or teacher)
     */
    @Test
    void hash_code_created_correctly(){
        assertEquals(circle1.hashCode(), circle1.getColor().hashCode()+
                Double.valueOf(circle1.getRadius()).hashCode());
    }

    @Test
    void hash_code_equal() {
        assertEquals(circle1.hashCode(), circle2.hashCode());
        assertFalse(circle1.hashCode() == circle3.hashCode());
    }

}
