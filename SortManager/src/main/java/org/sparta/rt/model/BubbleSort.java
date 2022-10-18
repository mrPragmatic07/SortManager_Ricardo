package org.sparta.rt.model;

public class BubbleSort {

    public static void executeBubbleSort(int[] array) {

        //Flag for Swapping Element
        boolean isSwapped;

        // The value will decrease every time one element as been sorted
        int unsortedElements = array.length;

        do {
            //If at least two elements are Swapped, isSwapped will be true
            isSwapped = false;

            // Iterate through the array's elements
            for (int i = 0; i < unsortedElements - 1; i++) {

                if(array[i] > array[i+1]) {
                    Swapper.swap(array, i, i+1);
                    isSwapped = true;
                }
            }
            // After iteration, the last element has been sorted
            // So it will be ignored for the next iteration
            unsortedElements--;
        }
        // Do comparison again if there's swapped element
        // otherwise, all array's elements have been sorted
        while (isSwapped);
    }
}
