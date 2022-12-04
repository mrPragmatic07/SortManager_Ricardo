package org.sparta.rt.model;

public class InsertionSort {

    public static void executeInsertionSort(int[] array) {

        for (int i = 0; i < array.length; i++) {

            int refValue = array[i];
            int j;

            for(j=i-1; j>=0; j--) {

                if(array[j] > refValue)
                    array[j+1] = array[j];
                else
                    break;
            }
            array[j+1] = refValue;
        }
    }
}
