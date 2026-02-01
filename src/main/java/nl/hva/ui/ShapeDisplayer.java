//package nl.hva.ui;
//
//import nl.hva.board.Board;
//import nl.hva.board.Row;
//import nl.hva.shape.Circle;
//import nl.hva.shape.Rectangle;
//import nl.hva.shape.Shape;
//
//import javax.swing.*;
//import java.awt.*;
//
///**
//     * Class for drawing shapes either as a single shape, a row of shapes or a grid of shapes.
//     */
//
//    public class ShapeDisplayer {
//        private JFrame frame;
//        private Shape shape;
//        private Dimension screenSize;
//
//        public ShapeDisplayer(Shape shape) {
//            this.shape = shape;
//            setUpDisplay("Single Shape Display");
//            ShapePaintComponent paintComponent = new ShapePaintComponent();
//            paintComponent.setShapePaintComponentSize();
//            frame.add(paintComponent);
//        }
//
//        private void setUpDisplay(String title) {
//            frame = new JFrame(title);
//            screenSize = Toolkit.getDefaultToolkit().getScreenSize();
//            frame.setSize(screenSize);
//            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//            frame.setVisible(true);
//        }
//
//        //The class that draws a single Shape
//        class ShapePaintComponent extends Component {
//            private Point shapeDrawingPosition;
//
//            public void setShapePaintComponentSize() {
//                super.setSize(screenSize);
//                //Find the middle of the screen
//                shapeDrawingPosition = new Point((int) (screenSize.getWidth() / 2), (int) (screenSize.getHeight() / 2));
//            }
//
//            public void paint(Graphics g) {
//
//                Graphics2D g2d = (Graphics2D) g;
//                int shapePositionX = 0;
//                int shapePositionY = 0;
//                //Font for printing out the area
//                Font currentFont = g.getFont();
//                Font newFont = currentFont.deriveFont(currentFont.getSize() * 2F);
//                //There is only one shape so the colour can be obtained here
//                g2d.setColor(shape.getColor());
//                if (shape instanceof Circle c) {
//                    int widthOfShape = (int) (c.getRadius() * 2);
//                    shapePositionX = shapeDrawingPosition.x - (widthOfShape / 2);
//                    shapePositionY = shapeDrawingPosition.y - (widthOfShape / 2);
//                    g2d.fillOval(shapePositionX, shapePositionY, widthOfShape, widthOfShape);//
//
//                } else if (shape instanceof nl.hva.shape.Rectangle r) {
//
//                    int width = r.getLength();
//                    int height = r.getWidth();
//                    shapePositionX = shapeDrawingPosition.x - (width / 2);
//                    shapePositionY = shapeDrawingPosition.y - (height / 2);
//                    g2d.fillRect(shapePositionX, shapePositionY, width, height);
//
//                }
//                //draw the text for the area in black
//                g2d.setColor(Color.BLACK);
//                g.setFont(newFont);
//                g2d.drawString("Area: " + Math.round(shape.getArea()), shapePositionX, shapePositionY);
//            }
//        }
//
//}

