package org.sparta.rt.view;

import org.sparta.rt.exceptions.IncorrectArraySizeException;
import org.sparta.rt.exceptions.IncorrectMaxValueException;
import org.sparta.rt.exceptions.OptionNotAvailableException;
import org.sparta.rt.model.BubbleSort;
import org.sparta.rt.model.InsertionSort;
import org.sparta.rt.model.MergeSort;
import org.sparta.rt.model.SelectionSort;
import org.sparta.rt.model.binaryTree.BinaryTree;

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

        System.out.print("Please Choose the Size of the Array (1-1000):");
    }

    public static void askMaxVal() {

        System.out.print("Please Choose the Max Value for each Element of the Array(1-10000):");
    }

    //Variable to control User Input
    static Scanner scanner = new Scanner(System.in);
    static public int algorithmOption;
    static public int size;
    static public int maxVal;

    public static void setAlgorithmOption() throws OptionNotAvailableException {

        algorithmOption = scanner.nextInt();
        if(algorithmOption > 5 || algorithmOption <= 0) {

            algorithmOption = 1;
            throw new OptionNotAvailableException();
        }
    }

    public static void setSize() throws IncorrectArraySizeException {

        size = scanner.nextInt();
        if(size > 1000 || size <= 0) {

            size = 100;
            throw new IncorrectArraySizeException();
        }
    }

    public static void setMaxVal() throws IncorrectMaxValueException {

        maxVal = scanner.nextInt();
        if(maxVal > 10000 || maxVal <= 0) {

            maxVal = 100;
            throw new IncorrectMaxValueException();
        }
    }

    public static void displayArray(int[] array) {

        for (int i=0; i<array.length; i++) {
            System.out.println("Array[" + i + "] = " + array[i]);
        }
        System.out.println("");
    }

    public static void callSorter(int algoOption, int[] array) {

        switch (algoOption) {
            case 1 -> BubbleSort.executeBubbleSort(array);
            case 2 -> MergeSort.executeMergeSort(array, 0, array.length - 1);
            case 3 -> BinaryTree.executeBinaryTree(array);
            case 4 -> SelectionSort.executeSelectionSort(array);
            case 5 -> InsertionSort.executeInsertionSort(array);
        }
    }

    public static boolean askRunAgain() {

        boolean result = false;

        System.out.print("Would you like to run again? (1 - yes, 0 - no)");
        int answer = scanner.nextInt();

        while(!(answer == 1 || answer == 0)) {

            System.out.println("Invalid input! Please reenter y or n");
            answer = (char)scanner.nextInt();
        }

        if(answer == 1) result = true;

        System.out.println("");
        return result;
    }
}
