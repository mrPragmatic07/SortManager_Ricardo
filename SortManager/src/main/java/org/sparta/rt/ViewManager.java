package org.sparta.rt;

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
            System.out.print("Index[" + i + "] = " + array[i] + " | ");
        }
    }
}
