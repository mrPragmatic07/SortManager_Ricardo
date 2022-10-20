package org.sparta.rt.model;

public class MergeSort {

    public static void executeMergeSort(int[] array, int startIndex, int endIndex) {

        // Only perform sort process
        // if the end index is higher than start index
        if(startIndex < endIndex) {

            // Find middle index
            int middleIndex = (startIndex + endIndex) / 2;

            // Sort left subarray
            // array[startIndex ... middleIndex]
            executeMergeSort(array, startIndex, middleIndex);

            // Sort right subarray
            // array[middleIndex + 1 ... endIndex]
            executeMergeSort(array, middleIndex + 1, endIndex);

            // Merge the left and the right subarray
            merge(array, startIndex, middleIndex, endIndex);
        }
    }

    public static void merge(int[] array, int startIndex, int middleIndex, int endIndex) {

        // Numbers of elements that will be sorted
        // from startIndex until endIndex
        int totalElements = endIndex - startIndex + 1;

        // Temporary array to store merged array
        int[] tempArray = new int[totalElements];

        // Index of left subarray
        // array[startIndex .. middleIndex]
        int leftIndex = startIndex;

        // Index of right subarray
        // array[middleIndex + 1 ... endIndex]
        int rightIndex = middleIndex + 1;

        // Index of merger array
        int mergedIndex = 0;

        // Merge the two subarrays
        while(leftIndex <= middleIndex && rightIndex <= endIndex) {

            if(array[leftIndex] <= array[rightIndex]) {

                // Store the left subarray's element
                // if it's lower than the right one
                tempArray[mergedIndex] = array[leftIndex];

                // Go to next left subarray index
                leftIndex++;
            }
            else {

                // Store the right subarray's element
                // if it's lower than the left one
                tempArray[mergedIndex] = array[rightIndex];

                // Go to next right subarray index
                rightIndex++;
            }

            // Go to the next merged array index
            mergedIndex++;
        }

        // If there's any remaining element in left subarray
        // that is not sorted to merge array yet
        while (leftIndex <= middleIndex) {

            tempArray[mergedIndex] = array[leftIndex];

            // Go to next left subarray index
            leftIndex++;

            // Go to next merged array index
            mergedIndex++;
        }

        // If there's any remaining element in right subarray
        // that is not sorted to merge array yet
        while (rightIndex <= endIndex) {

            tempArray[mergedIndex] = array[rightIndex];

            // Go to next left subarray index
            rightIndex++;

            // Go to next merged array index
            mergedIndex++;
        }

        // Now, the merged array has been sorted
        // Copy the elements to the original array
        for(int i = 0; i<totalElements; i++) {

            array[startIndex+i] = tempArray[i];
        }
    }
}
























