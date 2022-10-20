package org.sparta.rt.model;

public class InsertionSort {

    public static void executeInsertionSort(int[] array) {

        // Iterate to all array's elements
        for (int i = 0; i < array.length; i++) {

            // Iterate to all current elements as a reference value
            int refValue = array[i];

            // Variable to shift the element to the right position
            int j;

            // Iterate through the sorted element to insert the reference value
            for(j=i-1; j>=0; j--) {

                // If the value of the current index
                // is greater than the reference value then
                // move the current value to te right side
                // otherwise, put the reference value in the current index
                if(array[j] > refValue)
                    array[j+1] = array[j];
                else
                    break;
            }
            // Here's the line to put the reference value
            // in the current index (the right position)
            array[j+1] = refValue;
        }
    }
}
