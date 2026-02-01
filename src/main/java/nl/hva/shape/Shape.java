package nl.hva.shape;

import java.awt.*;

/**
 * Abstract class for a Shape.  All Shape objects have a colour and an area.
 **/
public abstract class Shape {
    private final Color colour;
    /*
    Create a Shape with a colour
    @param Color
     */
    public Shape(Color colour){
        this.colour = colour;
    }
    /**
     * Returns the area of a Shape
     * @return the area
     **/
    public abstract double getArea();

    /**
     * Returns the colour of a Shape
     **/
    public Color getColor(){
        return colour;
    }

    /**
     * @return a String representation of this Shape.
     */
    public String toString(){
        Class<? extends Shape> c = getClass();
        return "Shape: "+c.getSimpleName()+" with colour: "+ colour + " and its area is "+getArea();
    }

    /*
      Two Shapes are equal if their colour is equal.  Note that area is not a basis for equality here.
      @returns a string representation of this shape
     */

    public boolean equals (Object o){
        if (o instanceof Shape other){
            return other.getColor().equals(colour);
        }
        return false;
    }

    /*

     * This is the overridden version of the method inherited from Object and the documentation states:
     * "If two objects are equal according to the equals(Object) method,
     * then calling the hashCode method on each of the two objects must produce the same integer result"
        @returns an int which is a hashcode for this object.
     */

    @Override
    public int hashCode() {
        return colour.hashCode();
    }

}