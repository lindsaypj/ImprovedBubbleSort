package driver;

import algorithms.BubbleSort;
import algorithms.ImprovedBubbleSort;

import java.util.Arrays;

/**
 * This driver class is used to test and compare the standard bubble sort with my
 * "improved" version of bubble sort (Pending tests).
 *
 * @author Patrick Lindsay
 * @version 1.0
 */
public class SortTesting {

    private static final int ARRAY_SIZE = 2000000;

    /**
     * Main method which contains program.
     * @param args Command Line arguments
     */
    public static void main(String[] args) {

        int[] numbers1 = new int[ARRAY_SIZE];

        // Create an array of random numbers
        for (int i = 0; i < ARRAY_SIZE; i++) {
            numbers1[i] = (int)(Math.random()*ARRAY_SIZE);
        }

        // Create copy
        int[] numbers2 = Arrays.copyOf(numbers1, ARRAY_SIZE);


        // Use bubble sort
//        long startTime = System.currentTimeMillis();
//        BubbleSort bubbleSortedArray = new BubbleSort(numbers1);
//        long endTime = System.currentTimeMillis();
//
//        // Display results
//        System.out.println("BubbleSort: " + ARRAY_SIZE + " Elements - " + (endTime - startTime) + "ms");

        // Use Improved Bubble Sort
        long startTime = System.currentTimeMillis();
        ImprovedBubbleSort improvedSortedArray = new ImprovedBubbleSort(numbers2);
        long endTime = System.currentTimeMillis();

        // Display results
        System.out.println("ImprovedBubbleSort: " + ARRAY_SIZE + " Elements - " + (endTime - startTime) + "ms");
    }
}
