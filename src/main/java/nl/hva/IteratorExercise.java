package nl.hva;

import java.time.Month;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExercise {
    public static void main(String []args){
        //Java has special classes for collections of items (instead of arrays)
        //One of these is an ArrayList.  It is like an array but can grow as elements are added.
        //The size is not specified but the type of element is.  This is done by means of a
        //generic type <T>.  In this case we are going to add Month objects to the List.


        //We can declare an empty list with the generic type of Month.
        List <Month> months = new ArrayList<Month>();

        //TODO - try to add a String object ("January") to the months list to see what happens.
        //months.add("January");

        //To get the size of an array a property called "length" is used:  myArray.length.
        //Not that this referencing a field not a method.  A List (ArrayList) has a method to find
        //the length (size):

        System.out.println ("The length of this array is "+ months.size());

        //Below, defined inside this class, is a class called Month.  Month is not complete, but
        //it is still possible to do this:
        Month january = null;
        months.add(january);

        //TODO:  see the length of the list after adding one or more (null) months.
        System.out.println("Length of the list after adding one or more (null) months: " + months.size());


        //The code below will produce some meaningful output once
        // the Month class is completed.
        // TODO:  complete the Month class (below).

        // TODO:  once you have completed the Month class: Add some more months.
        months.add(new Month("February ", 28));
        months.add(new Month("March ", 31));
        months.add(new Month("April ", 30));
        months.add(new Month("May ", 31));
        months.add(new Month("June ", 30));
        months.add(new Month("July ", 31));
        months.add(new Month("August ", 31));
        months.add(new Month("September ", 30));
        months.add(new Month("October ", 31));
        months.add(new Month("November ", 30));
        months.add(new Month("December ", 31));

        //It is possible to iterate across the list just like with the array.

        for (Month month : months) {
            System.out.println(month);
        }

        //TODO:  write code to print the months in reverse
        for (int i = months.size() - 1; i >= 1; i--) {
            System.out.println("LOOK reverse array number: " + i + " = " + months.get(i));
        }

        //There is another way to iterate over a list.  This users an Iterator (java.util.Iterator).
        //Iterator is an interface.    It is implemented by the List class.
        //TODO - find out what an interface is (in Java) and what
        // it means to implement one.
        /**
         * An interface in java is used to group related methods with empty methods.
         * A class implements an interface by providing code for all its methods.
         */

        // An iterator can be obtained by the following code:

        //The iterator can be used by calling two of its methods:
        // hasNext() and next().
        //TODO look up the Java documentation for Iterator
        // For the class using List (ArrayList) nothing else needs to be known about
        // what a list is or how it is implemented.  Just using the iterator enables
        // the traversal of all the elements in the list. A list might be considered a
        // "simple" data structure with an obvious iteration order (start at 0 and continue
        // until the end) but for other structures, such as a Tree, iteration is more complex
        // and it is very important to be able to get an iterator.
        //TODO - write code to print out m
        for (Month m : months) {
            System.out.println(m);
        }
        // It was first this:
        /*
        while (monthIterator.hasNext()){
        Month m = monthIterator.next();
        System.out.println(m);
       }
         */

    }
    static class Month{
        private final String name;
        private final int numberOfDays;


        //TODO Complete the class by writing code for a constructor.
        public Month(String name, int numberOfDays) {
            this.name = name;
            this.numberOfDays = numberOfDays;
        }
        // The parameters should be the name and number of days.
        //
        //TODO Complete accessor (getter) methods.
        //
        public String getName() {
            return name;
        }

        public int numberOfDays() {
            return numberOfDays;
        }
        //TODO complete the toString method.  It should return the name of the month and the number of days.
        //Note that this is an overridden method! What is the superclass in which this method is defined?
        //TODO Find out about the superclass of all classes in Java.
        // ANSWER -> OBJECT CLASSSSS FROM JAVA LANG PACKAGE :DDDD
        @Override
        public String toString(){
            return name + numberOfDays;
        }

    }

}
