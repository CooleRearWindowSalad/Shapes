package nl.hva.shape;
import java.awt .*;
/**
 * Simple circle class.
 */
public class Circle extends Shape {

//Todo write the class definition for a Circle.  It should also have an instance field for radius
    private double radius;

    /**
     * Create a circle with radius r
     *
     * @param c the colour of this circle
     * @param r the radius of this circle as a positive real number
     */
    //TODO - write the constructor
    public Circle(Color c, double r) {
        super(c);
        this.radius = r;
    }

    /**
     * get the area of this circle as a double
     *
     * @return area
     */
    //TODO - override the getArea method
    @Override
    public double getArea() {

        return Math.PI * radius * radius;
    }

    /**
     * Get the radius as a double
     *
     * @return the radius
     */
    //TODO - write the required method
    public double getRadius() {
        return radius;
    }

    /**
     * @param radius the size of this circle as a positive real number.
     */
    //TODO - write a method to set the radius

    public void setRadius(double radius) {
        this.radius = radius;
    }


    /**
     * Two circles are equal if their radii are equal.
     * This is the overridden version of the method inherited from Object
     * @param o - another shapes.Circle
     */
    //TODO - override the equals method
    @Override
    public boolean equals(Object o) {
        if (o instanceof Circle object) {
            return radius == object.getRadius() && this.getColor() == object.getColor();
        }
        return false;
    }

    /**
     * Returns an int which is a hashcode for this object.
     * This is the overridden version of the method inherited from Object and the documentation states:
     * "If two objects are equal according to the equals(Object) method,
     * then calling the hashCode method on each of the two objects must produce the same integer result" so
     * the hashcode is generated from the radius. See the documentation in the Java Object class
     */
    //TODO - override the hashCode method (hint:  use Double.valueOf(radius).hashCode()+ super.hashCode() )
    @Override
    public int hashCode() {
        return Double.valueOf(radius).hashCode()+
                super.hashCode();
    }
}


