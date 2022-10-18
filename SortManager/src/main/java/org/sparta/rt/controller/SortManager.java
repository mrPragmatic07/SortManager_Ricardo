package org.sparta.rt.controller;

import org.sparta.rt.model.ArrayGenerator;
import org.sparta.rt.view.ViewManager;

public class SortManager {

    public static void runSortManager() {

        //Algorithm Options
        ViewManager.displaySortingOptions();
        ViewManager.setAlgorithmOption();

        // Size Options
        ViewManager.askSize();
        ViewManager.setSize();

        // MaxVal
        ViewManager.askMaxVal();
        ViewManager.setMaxVal();

        // Random Array
        int[] randIntArray = ArrayGenerator.createArray(ViewManager.size, ViewManager.maxVal);
        ViewManager.displayArray(randIntArray);

        // Sort the Array
        ViewManager.callSorter(ViewManager.algorithmOption, randIntArray);

        // Display the Sorted Array
        System.out.println("");
        System.out.println("Sorted Array:");
        ViewManager.displayArray(randIntArray);
    }
}
