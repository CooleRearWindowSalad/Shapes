package nl.hva;
/*
import nl.hva.board.Board;
import nl.hva.shape.Shape;
import nl.hva.shape.Circle;
import nl.hva.shape.Rectangle;

import java.awt.*;
import java.util.Iterator;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Circle c = new Circle(Color.BLACK, 15.00) ;

        Board<Shape> board = new Board<>(4);
        Random random = new Random();
        Iterator iterator = board.iterator();

        while (iterator.hasNext()){
            int size = random.nextInt(1,10);
            if (size%2 == 0) {
                board.add(new Circle(Color.BLUE, size));
            }
            else {
                board.add(new Rectangle(Color.GREEN, size, size+1));
            }
             iterator.next();
        }

        iterator = board.iterator();
        while (iterator.hasNext()){
           System.out.println(iterator.next());
        }
        System.out.println();

        //Without the iterator this would be the only way of printing all the Shapes
        //The y value is the vertical (row) and the x is the column.  Computer graphics
        //works with the origin (x =0, y=0) in the top left hand corner of the screen.
        //The y value increases from the top to the bottom (unlike a typical mathematical graph).
        for (int y = 0; y < board.getRowSize(); y++){
            for (int x = 0; x < board.getRowSize(); x++){
                System.out.println(board.get(x, y));
            }
        }
        System.out.println();

        //The iterator also enables this:
        for (Shape s: board){
            System.out.println(s);
        }

    }
}
 */