package org.sparta.rt;

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

        // Display the Sorted Array
    }
}
