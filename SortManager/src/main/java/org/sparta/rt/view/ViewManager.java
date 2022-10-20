package org.sparta.rt.view;

import org.sparta.rt.model.BubbleSort;
import org.sparta.rt.model.InsertionSort;
import org.sparta.rt.model.MergeSort;
import org.sparta.rt.model.SelectionSort;

import java.util.Scanner;

public class ViewManager {

    // Display Algorithm Options
    public static void displaySortingOptions () {

        System.out.println("Welcome, Please Choose an Algorithm:");
        System.out.println("1. Bubble Sort");
        System.out.println("2. Merge Sort");
        System.out.println("3. Tree Sort");
        System.out.println("4. Selection Sort");
        System.out.println("5. Insertion Sort");
        System.out.print("Enter here: ");
    }

    public static void askSize() {

        System.out.print("Please Choose the Size of the Array:");
    }

    public static void askMaxVal() {

        System.out.print("Please Choose the Max Value for each Element of the Array:");
    }

    //Variable to control User Input
    static Scanner scanner = new Scanner(System.in);
    static public int algorithmOption;
    static public int size;
    static public int maxVal;

    public static void setAlgorithmOption() {

        algorithmOption = scanner.nextInt();
    }

    public static void setSize() {

        size = scanner.nextInt();
    }

    public static void setMaxVal() {

        maxVal = scanner.nextInt();
    }

    public static void displayArray(int[] array) {

        for (int i=0; i<array.length; i++) {
            System.out.println("Array[" + i + "] = " + array[i]);
        }
        System.out.println("");
    }

    // Call Sorter
    public static void callSorter(int algoOption, int[] array) {

        switch (algoOption) {
            case 1 -> BubbleSort.executeBubbleSort(array);
            case 2 -> MergeSort.executeMergeSort(array, 0, array.length - 1);
            case 4 -> SelectionSort.executeSelectionSort(array);
            case 5 -> InsertionSort.executeInsertionSort(array);
        }
    }
}
