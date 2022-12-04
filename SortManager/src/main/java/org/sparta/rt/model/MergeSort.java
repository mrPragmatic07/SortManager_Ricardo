package org.sparta.rt.model;

public class MergeSort {

    public static void executeMergeSort(int[] array, int startIndex, int endIndex) {

        if(startIndex < endIndex) {

            int middleIndex = (startIndex + endIndex) / 2;

            executeMergeSort(array, startIndex, middleIndex);
            executeMergeSort(array, middleIndex + 1, endIndex);
            merge(array, startIndex, middleIndex, endIndex);
        }
    }

    public static void merge(int[] array, int startIndex, int middleIndex, int endIndex) {

        int totalElements = endIndex - startIndex + 1;
        int[] tempArray = new int[totalElements];
        int leftIndex = startIndex;
        int rightIndex = middleIndex + 1;
        int mergedIndex = 0;

        while(leftIndex <= middleIndex && rightIndex <= endIndex) {

            if(array[leftIndex] <= array[rightIndex]) {

                tempArray[mergedIndex] = array[leftIndex];
                leftIndex++;
            }
            else {

                tempArray[mergedIndex] = array[rightIndex];
                rightIndex++;
            }
            mergedIndex++;
        }

        while (leftIndex <= middleIndex) {

            tempArray[mergedIndex] = array[leftIndex];
            leftIndex++;
            mergedIndex++;
        }

        while (rightIndex <= endIndex) {

            tempArray[mergedIndex] = array[rightIndex];
            rightIndex++;
            mergedIndex++;
        }
        for(int i = 0; i<totalElements; i++) {

            array[startIndex+i] = tempArray[i];
        }
    }
}
























