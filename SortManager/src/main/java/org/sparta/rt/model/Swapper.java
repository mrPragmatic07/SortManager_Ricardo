package org.sparta.rt.model;

public class Swapper {

    public static void swap(int[] array, int x, int y) {

        int placeHolder;
        placeHolder = array[x];
        array[x]    = array[y];
        array[y]    = placeHolder;
    }
}
