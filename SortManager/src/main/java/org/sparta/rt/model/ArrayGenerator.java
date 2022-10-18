package org.sparta.rt.model;
import java.util.Random;

public class ArrayGenerator {

    public static int[] createArray(int size, int maxValue) {

        Random random = new Random();
        int[] array = new int[size];
        for(int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(maxValue);
        }
        return array;
    }
}
