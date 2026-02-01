package nl.hva.ui;
/*

import nl.hva.board.Board;
import nl.hva.board.Row;
import nl.hva.shape.Circle;
import nl.hva.shape.Rectangle;
import nl.hva.shape.Shape;

import javax.swing.*;
import java.awt.*;

*/
/**
 * Class for drawing shapes either as a single shape, a row of shapes or a grid of shapes.
 *//*

public class BoardDisplayer {
    private JFrame frame;
    private Board<Shape> board;

    private Dimension screenSize;

   public BoardDisplayer(Board<Shape> board) {
        this.board = board;
        setUpDisplay("Shape Board Display");
        BoardPaintComponent paintComponent = new BoardPaintComponent();
        paintComponent.setBoardPaintComponentSize();
        paintComponent.setUpDrawingGrid();
        frame.add(paintComponent);
    }

    private void setUpDisplay(String title) {
        frame = new JFrame(title);
        screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setSize(screenSize);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }


    //The class that does the drawing for a grid (2D).
    class BoardPaintComponent extends Component {

        private Point currentPosition;
        private final Point gridDrawingStartPosition = new Point();
        int gridSize;

        public void setBoardPaintComponentSize() {
            super.setSize(screenSize);
            currentPosition = new Point(screenSize.width / 2, screenSize.height / 2);

        }

        //Set up the grid (2d).
        void setUpDrawingGrid() {
            for (int y = 0; y < board.getRowSize(); y++) {
                for (int x = 0; x < board.getRowSize(); x++) {

                    Shape s = board.get(x, y);
                    if (s instanceof Circle c) {
                        int widthOfShape = (int) (c.getRadius() * 2);
                        if (widthOfShape > gridSize) {
                            gridSize = widthOfShape;
                        }

                    } else if (s instanceof Rectangle r) {
                        int width = r.getLength();
                        int height = r.getWidth();
                        if (width > height) {
                            if (width > gridSize) {
                                gridSize = width;
                            }
                        } else {
                            if (height > gridSize) {
                                gridSize = height;
                            }
                        }
                    }
                }
            }

        }

        private void setGridDrawStartingPosition() {
            gridDrawingStartPosition.x = (getWidth() / 2) - (board.getRowSize() * gridSize / 2);
            gridDrawingStartPosition.y = (getHeight() / 2) - (board.getRowSize() * gridSize / 2);
        }

        public void paint(Graphics g) {

            setGridDrawStartingPosition();
            currentPosition.y = gridDrawingStartPosition.y;//will be updated to draw each grid element
            currentPosition.x = gridDrawingStartPosition.x;
            Graphics2D g2d = (Graphics2D) g;
            int shapePositionX;//actual shape position is different to the grid position
            int shapePositionY;
            Font currentFont = g.getFont();
            Font newFont = currentFont.deriveFont(currentFont.getSize() * 2F);
            for (int y = 0; y < board.getRowSize(); y++) {//thinking of y coordinates (rows)
                for (int x = 0; x < board.getRowSize(); x++) {//x coordinates (columns)
                    Shape s = board.get(x, y);
                    g2d.setPaint(Color.black);
                    g2d.drawRect(currentPosition.x, currentPosition.y, gridSize, gridSize);

                    if (s instanceof Circle c) {
                        g2d.setColor(s.getColor());//must be here in case there is no Shape at a given position .
                        int widthOfShape = (int) (c.getRadius() * 2);
                        shapePositionX = currentPosition.x + (gridSize / 2) - (widthOfShape / 2);
                        shapePositionY = currentPosition.y + (gridSize / 2) - (widthOfShape / 2);
                        g2d.fillOval(shapePositionX, shapePositionY, widthOfShape, widthOfShape);
                    } else if (s instanceof Rectangle r) {
                        g2d.setColor(s.getColor());
                        int width = r.getLength();
                        int height = r.getWidth();
                        shapePositionX = currentPosition.x + (gridSize / 2) - (width / 2);
                        shapePositionY = currentPosition.y + (gridSize / 2) - (height / 2);
                        g2d.fillRect(shapePositionX, shapePositionY, width, height);
                    }
                    if (s != null) {//if there is no Shape in that board square do not try to get the area
                        g2d.setColor(Color.BLACK);
                        g.setFont(newFont);
                        g2d.drawString("Area: " + Double.toString(Math.round(s.getArea())), currentPosition.x, currentPosition.y + (gridSize / 2));
                    }
                    currentPosition.x += gridSize; // update x to move from left to right
                }
                currentPosition.x = gridDrawingStartPosition.x;//set x back to start position
                currentPosition.y += gridSize;//increase y
            }

        }
    }
}
*/
