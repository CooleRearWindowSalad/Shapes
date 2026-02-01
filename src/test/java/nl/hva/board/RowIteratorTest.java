package nl.hva.board;
/*

import nl.hva.shape.Circle;
import nl.hva.shape.Rectangle;
import nl.hva.shape.Shape;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RowIteratorTest {
    Shape [] rectangleArray;
    Shape [] shapeArray;
    Row <Rectangle> rectangleTestRow;
    Row <Shape> shapeTestRow;
    int rowSize = 4;

    @BeforeEach
    void setUp() {
        rectangleArray = new Shape[rowSize];
        shapeArray = new Shape[rowSize*2];
        rectangleTestRow = new Row (rowSize);
        shapeTestRow = new Row(rowSize*2);

        for (int x = 0; x< rowSize; x++) {
            Rectangle r = new Rectangle(Color.BLUE, x+1, x+1);
            Circle c = new Circle(Color.BLACK, x+1);
            rectangleTestRow.add(r, x);
            shapeTestRow.add(r, x);
            shapeTestRow.add(c, x+rowSize);
            rectangleArray[x] = r;
            shapeArray[x] = r;
            shapeArray[x+rowSize]= c;
        }
    }
    @Test
    void iterator_correctly_iteratates_rectangle_row() {
        int count = 0;
        Iterator<Rectangle> iterator = rectangleTestRow.iterator();
        while (iterator.hasNext()) {
            Rectangle r =  iterator.next();
            System.out.println(r);
            System.out.println(rectangleArray[count]);
            assertEquals(r, rectangleArray[count]);
            count++;
        }
    }
    @Test
    void iterator_for_each_returns_the_shapes() {
        int count = 0;
        for (Shape s : shapeTestRow) {

            System.out.println(s);
            System.out.println(shapeArray[count]);
            assertEquals(s, shapeArray[count]);
            count++;
        }
    }
}
*/
