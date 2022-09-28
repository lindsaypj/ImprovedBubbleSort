package algorithms;

import java.util.Arrays;

/**
 * Abstract sorted array using bubble sort. Compares each neighboring value, swapping if out of order.
 * Repeats sort until all values are in order.
 *
 * Sort In-Place
 * Runtime of O(n^2) (inefficient)
 *
 * @author Patrick Lindsay
 * @version 1.1
 */
public class BubbleSort {
    private int[] elements;

    /**
     * Constructor to store elements to be sorted and begin sorting.
     * @param elements array of integers to be sorted.
     */
    public BubbleSort(int[] elements) {
        this.elements = elements;
        sort();
    }

    // Method to sort the stored array of elements
    private void sort() {
        boolean unsorted;
        int passCount = 0;
        do {
            unsorted = false;
            for (int i = 0; i < elements.length - 1 - passCount; i++) {
                if (elements[i] > elements[i + 1]) {
                    swap(i, i + 1);
                    unsorted = true;
                }
            }
            passCount++;
        }
        while(unsorted);
    }

    private void swap(int larger, int smaller) {
        int largeValue = elements[larger];
        elements[larger] = elements[smaller];
        elements[smaller] = largeValue;
    }

    @Override
    public String toString() {
        return Arrays.toString(elements);
    }
}
