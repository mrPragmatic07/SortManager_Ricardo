package org.sparta.rt.model;

public class SelectionSort {

    public static void executeSelectionSort(int[] array) {

        int minIndex;

        for(int i=0; i< array.length -1; i++){

            minIndex = i;
            for(int j = i + 1; j < array.length; j++) {

                if(array[j] < array[minIndex])
                    minIndex = j;
            }
            Swapper.swap(array, i, minIndex);
        }
    }
}
