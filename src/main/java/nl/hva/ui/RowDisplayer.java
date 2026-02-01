package nl.hva.ui;
/*

import nl.hva.board.Board;
import nl.hva.board.Row;
import nl.hva.shape.Circle;
import nl.hva.shape.Rectangle;
import nl.hva.shape.Shape;

import javax.swing.*;
import java.awt.*;

public class RowDisplayer {
    private JFrame frame;
    private Row<Shape> row;

    private Dimension screenSize;


    public RowDisplayer(Row<Shape> row) {
        this.row = row;
        setUpDisplay("Shape Row Display");
        RowPaintComponent paintComponent;
        paintComponent = new RowPaintComponent();
        paintComponent.setRowPaintComponentSize();
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

    //The class that does the drawing for Row
    class RowPaintComponent extends Component {
        //This will be updated as the drawing progresses
        private Point currentPosition;
        //This will be used as the position to start drawing the row
        private final Point rowStartDrawingPosition = new Point();
        //The row element size is determined by looking at all the shapes in the Row and finding the largest.
        int rowElementSize;

        public void setRowPaintComponentSize() {
            super.setSize(screenSize);
            currentPosition = new Point(0, (int) (screenSize.getHeight() / 2));
        }

        //Find the correct row element size.  The row element must be equal to the largest shape.
        //Allowance is also made for a row position that has no shape.
        private void setUpDrawingGrid() {
            for (int i = 0; i < row.getSize(); i++) {
                Shape s = row.get(i);
                if (s instanceof Circle c) {
                    int widthOfShape = (int) (c.getRadius() * 2);
                    if (widthOfShape > rowElementSize) {
                        rowElementSize = widthOfShape;
                    }

                } else if (s instanceof nl.hva.shape.Rectangle r) {
                    int width = r.getLength();
                    int height = r.getWidth();
                    if (width > height) {//use the largest dimension of the rectangle to set the row element size
                        if (width > rowElementSize) {
                            rowElementSize = width;
                        }
                    } else {//if height is the largest dimension
                        if (height > rowElementSize) {
                            rowElementSize = height;
                        }
                    }
                }
            }
        }
        //once the grid is set up, the starting position of that grid can be found
        private void setRowDrawStartingPosition() {
            rowStartDrawingPosition.x = (getWidth() / 2) - (row.getSize() * rowElementSize / 2);
            rowStartDrawingPosition.y = (getHeight() / 2) - (rowElementSize / 2);
        }

        public void paint(Graphics g) {
            setRowDrawStartingPosition();//where to start drawing the row

            currentPosition.x = rowStartDrawingPosition.x;//currentPosition will change each time a row element is drawn
            currentPosition.y = rowStartDrawingPosition.y;
            // Retrieve the graphics context; this object is used to paint shapes
            Graphics2D g2d = (Graphics2D) g;
            Font currentFont = g.getFont();
            Font newFont = currentFont.deriveFont(currentFont.getSize() * 2F);
            int shapePositionX;
            int shapePositionY;
            for (int i = 0; i < row.getSize(); i++) {
                Shape s = row.get(i);
                g2d.setPaint(Color.black);
                g2d.drawRect(currentPosition.x, currentPosition.y, rowElementSize, rowElementSize);

                if (s instanceof Circle c) {
                    g2d.setColor(c.getColor());//must be here in case there is no Shape at a given position.
                    int widthOfShape = (int) (c.getRadius() * 2);
                    shapePositionX = currentPosition.x + (rowElementSize / 2) - (widthOfShape / 2);
                    shapePositionY = currentPosition.y + (rowElementSize / 2) - (widthOfShape / 2);
                    g2d.fillOval(shapePositionX, shapePositionY, widthOfShape, widthOfShape);

                } else if (s instanceof nl.hva.shape.Rectangle r) {
                    g2d.setColor(r.getColor());
                    int width = r.getLength();
                    int height = r.getWidth();
                    shapePositionX = currentPosition.x + (rowElementSize / 2) - (width / 2);
                    shapePositionY = currentPosition.y + (rowElementSize / 2) - (height / 2);
                    g2d.fillRect(shapePositionX, shapePositionY, width, height);

                }
                if (s != null) {//don't try to find an area for a null Shape.
                    g2d.setColor(Color.BLACK);
                    g.setFont(newFont);
                    g2d.drawString("Area: " + Double.toString(Math.round(s.getArea())), currentPosition.x, currentPosition.y + (rowElementSize / 2));
                }
                currentPosition.x += rowElementSize;

            }

        }
    }

}
*/
