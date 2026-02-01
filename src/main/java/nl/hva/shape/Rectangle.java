package nl.hva.shape;

import java.awt.*;

/**
 *Simple rectangle class
 **/

//TODO - write the code for a Rectangle class
    public class Rectangle extends Shape{
    private double width;
    private double height;

    /**
     * Constructor supplying width and height.  Values should be positive
     * @param c the colour
     * @param w the width - a positive integer greater than 0
     * @param h the height - a positive integer greater than 0
     */
//TODO - write a constructor
    public Rectangle(Color c, double w, double h) {
        super(c);
        this.width = w;
        this.height = h;
    }

    /**
     * Constructor supplying width and height.  Values should be positive
     * @param c the colour
     * @param side the width and height - a positive integer greater than 0
     *
     */
//TODO - write an overloaded constructor with just parameter for the side length
    public Rectangle(Color c, int side) {
        super(c);
        this.width = side;
        this.height = side;
    }

    /**
     *Returns the area as a double
     * @return the area
     */
//TODO - write the code for this method
    @Override
    public double getArea() {

        return height * width;
    }

    /**
     *
     * @return the width
     */
//TODO - write the code
    public double getWidth() {
        return width;
    }

    /**
     * Sets the width of this rectangle.  It should be a positive integer.
     *
     * @param width
     */
//TODO - write the code
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     *
     * @return the length
     */
//TODO - write the code
    public double getLength() {
        return height;
    }


    /**
     *
     * @param length the length as a positive integer
     */
//TODO - write the code
    public void setLength(int height) {
        this.height = height;
    }



    /**
     * Two rectangles cannot necessarily be judged equal by area so width and height must be used.
     * This is the overridden version of the method inherited from Object
     * @param o - another shapes.Rectangle
     */
//TODO - write the code to override the equals method
    @Override
    public boolean equals(Object o) {
        if (o instanceof Rectangle object) {
            return this.width == object.getWidth() &&
                    this.height == object.getLength() &&
                    this.getColor().equals(object.getColor());
        }
        return false;
    }

    /**
     * Returns an int which is a hashcode for this object.
     * This is the overridden version of the method inherited from Object and the documentation states:
     * "If two objects are equal according to the equals(Object) method,
     * then calling the hashCode method on each of the two objects must produce the same integer result" so
     * the hashcode is generated from the dimensions.
     */
//TODO - override the hashCode method:  hint - use width+length+super.hashCode()
    @Override
    public int hashCode() {
        return Double.valueOf(width).hashCode()
                + Double.valueOf(height).hashCode()
                + super.hashCode();
    }
}

