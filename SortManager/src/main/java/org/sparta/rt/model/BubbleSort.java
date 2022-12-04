package org.sparta.rt.model;

public class BubbleSort {

    public static void executeBubbleSort(int[] array) {

        boolean isSwapped;

        int unsortedElements = array.length;

        do {
            isSwapped = false;

            for (int i = 0; i < unsortedElements - 1; i++) {

                if(array[i] > array[i+1]) {
                    Swapper.swap(array, i, i+1);
                    isSwapped = true;
                }
            }
            unsortedElements--;
        }
        while (isSwapped);
    }
}
