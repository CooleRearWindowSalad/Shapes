package nl.hva;


import java.util.Iterator;

public class ArrayExercise {
    // Begin by looking at the Java tutorial on Arrays:
    // https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html
    public static void main(String []args) {

        //TODO - declare an array to hold 10 int values
        int[] row = new int[10];

        //An array has a property - its length.  This is fixed once the array has been declared
        //TODO - print out the length of the array declared above
        System.out.println("The length row is: " + row.length);

        //values can be added to the array
        //TODO - assign the value of 0 to the first position in the array
        row[0] = 0;

        //TODO - print out the value with a suitable message
        System.out.println("The first number is " + row[0]);


        // It is possible to iterate over the array to add, change or get elements
        for (int i = 0; i < row.length; i++) {
            row[i] = i * i;
        }
        for (int i = 0; i < row.length; i++) {
            System.out.println("The element in position " + i + " is " + row[i]);
        }

        //TODO: write code to print the array in reverse
        for (int i = row.length - 1; i >= 0; i--) {
            System.out.println("LOOK reverse array number: " + i + " = " + row[i]);
        }

        //There is a more concise method to iterate over arrays:  This is sometimes called a "for each".

        for (int i : row) {
            System.out.println("i retrieved with for each method: " + i);
        }

        //An array of objects can be created

        String[] days = new String[7];

        //TODO: write code to fill the array with the names of the days of the week.
        days[0] = "Monday";
        days[1] = "Tuesday";
        days[2] = "Wednesday";
        days[3] = "Thursday";
        days[4] = "Friday";
        days[5] = "Saturday";
        days[6] = "Sunday";

        //TODO: write code to display the days.
        for (String day : days) {
            System.out.println(day);
        }

    }
}

