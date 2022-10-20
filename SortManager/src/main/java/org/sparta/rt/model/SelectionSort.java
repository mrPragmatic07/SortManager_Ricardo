package org.sparta.rt.model;

public class SelectionSort {

    public static void executeSelectionSort(int[] array) {

        // variable to store the index of the minimum value in each iteration
        int minIndex;

        // Iterate until the N-1 elements
        for(int i=0; i< array.length -1; i++){

            // Set the first unsorted element as the minim value
            minIndex = i;

            // Iterate through the unsorted elements only
            for(int j = i + 1; j < array.length; j++) {

                //set the new minimum value
                // if the saved minimum value is higher than the current index value
                if(array[j] < array[minIndex])
                    minIndex = j;
            }
            //Swap the first unsorted element
            // with the minimum value
            Swapper.swap(array, i, minIndex);
        }
    }
}
