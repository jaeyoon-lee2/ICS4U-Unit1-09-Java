/*
* This program generates 2D array of 4 x 6 random numbers between 0 to 100,
* calculates average of numbers and shows it.
*
* @author  Jay Lee
* @version 1.0
* @since   2021-05-03
*/
// package ca.mths.unit1.unit09.java.main;

import java.util.Random;

public final class AverageStudentMark {
    // Constant
    /** Number of students. */
    static final int STUDENTS = 4;
    /** Number of assignments. */
    static final int ASSIGNMENTS = 6;
    /** Maximum range of random number (marks). */
    static final int MAX_RANGE = 100;

    /**
    * This method calculate average of numbers in the 2D array.
    * @param twoDArray - the 2D array of numbers
    * @return average
    */
    public static double calculateAverage(final int[][] twoDArray) {
        // Set initial average and total count
        double average = 0f;
        int totalCount = 0;

        // Find average
        for (int[] oneDArray : twoDArray) {
            for (int number : oneDArray) {
                average += number;
                totalCount += 1;
            }
        }
        average /= totalCount;

        // Return average
        return average;
    }

    private AverageStudentMark() {
        // Prevent instantiation
        // Optional: throw an exception e.g. AssertionError
        // if this ever *is* called
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * This method generates 2D array of 4 x 6 random numbers between 0 to 100,
    * passes 2D array to functions called calculateAverage,
    * gets and shows average of numbers in the 2D array.
    * @param args
    */
    public static void main(final String[] args) {
        Random random = new Random();

        int[][] studentsMarks = new int[STUDENTS][ASSIGNMENTS];
        System.out.println("Marks: ");

        for (int student = 0; student < studentsMarks.length; student++) {
            for (int assignment = 0; assignment < studentsMarks[student].length;
                                                            assignment++) {
                int randomNumber = random.nextInt(MAX_RANGE + 1);
                studentsMarks[student][assignment] = randomNumber;
                System.out.print(randomNumber + " ");
            }
            System.out.println();
        }
        // Process
        double classAverage = calculateAverage(studentsMarks);

        // Output
        System.out.printf("Average mark of students is %.2f\n", classAverage);
        System.out.println("\nDone.");
    }
}
