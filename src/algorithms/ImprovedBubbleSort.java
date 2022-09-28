package algorithms;

import java.util.Arrays;

/**
 * Abstract sorted array using an improved version of bubble sort. Compares each neighboring value,
 * swapping if out of order. When a value is found to be out of order, it continues to search backwards
 * for its location in the array. The elements are then shifted to make room for the new element.
 *
 * Sort In-Place
 * Runtime of ??????
 *
 * @author Patrick Lindsay
 * @version 1.0
 */
public class ImprovedBubbleSort {
    private int[] elements;

    /**
     * Constructor for the ImprovedBubbleSort object.
     * @param elements input array of integers to be sorted
     */
    public ImprovedBubbleSort(int[] elements) {
        this.elements = elements;
        sort();
    }

    // Method to sort using my improved method
    private void sort() {
        int position = 0;

        // Traverse all elements in the array
        while (position < elements.length - 1) {
            // Check if the next element needs to shift backwards
            if (elements[position] > elements[position + 1]) {
                shift(findNewPosition(position + 1), position + 1);
            }

            // Update position
            position++;
        }
    }

    // Method to travers backwards through the elements to find the ordered position of our given element.
    private int findNewPosition(int currentIndex) {
        for (int i = currentIndex-1; i >= 0; i--) {
            if (elements[i] < elements[currentIndex]) {
                return i + 1;
            }
        }
        return 0;
    }

    // Method to shift a subarray of indexes. Effectively moves last element to the beginning.
    private void shift(int newIndex, int shiftElementIndex) {
        // Store shifting element
        int shiftElement = elements[shiftElementIndex];

        // Shift Elements
        if (shiftElementIndex - newIndex >= 0) {
            System.arraycopy(elements, newIndex, elements, newIndex + 1, shiftElementIndex - newIndex);
        }

        // move element (store it in its now open spot)
        elements[newIndex] = shiftElement;
    }

    @Override
    public String toString() {
        return Arrays.toString(elements);
    }
}
