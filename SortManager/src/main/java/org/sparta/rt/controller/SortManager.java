package org.sparta.rt.controller;

import org.sparta.rt.exceptions.IncorrectArraySizeException;
import org.sparta.rt.exceptions.IncorrectMaxValueException;
import org.sparta.rt.exceptions.OptionNotAvailableException;
import org.sparta.rt.model.ArrayGenerator;
import org.sparta.rt.view.ViewManager;

public class SortManager {

    public static void runSortManager() {

        boolean runAgain;
        do {

            //Algorithm Options
            ViewManager.displaySortingOptions();
            try {
                ViewManager.setAlgorithmOption();
            } catch (OptionNotAvailableException e) {
                System.out.println(e.getMessage());
            }

            // Size Options
            ViewManager.askSize();
            try {
                ViewManager.setSize();
            } catch (IncorrectArraySizeException e) {
                System.out.println(e.getMessage());
            }

            // MaxVal
            ViewManager.askMaxVal();
            try {
                ViewManager.setMaxVal();
            } catch (IncorrectMaxValueException e) {
                System.out.println(e.getMessage());
            }

            // Random Array
            int[] randIntArray = ArrayGenerator.createArray(ViewManager.size, ViewManager.maxVal);
            ViewManager.displayArray(randIntArray);

            // Sort the Array
            final long startTime2 = System.currentTimeMillis();
            ViewManager.callSorter(ViewManager.algorithmOption, randIntArray);
            final long elapsedTimeMillis2 = System.currentTimeMillis() - startTime2;
            System.out.println("Time taken to sort Array: " + elapsedTimeMillis2 + " MilliSeconds");

            // If user chooses the Binary tree
            if (ViewManager.algorithmOption != 3) {

                // Display the Sorted Array
                System.out.println("");
                System.out.println("Sorted Array:");
                ViewManager.displayArray(randIntArray);
            }
            runAgain = ViewManager.askRunAgain();

        } while (runAgain);
    }
}
