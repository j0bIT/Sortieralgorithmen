package com.pohlmann;

import java.util.Arrays;
import java.util.concurrent.Callable;

public class Main {

    public static void main(String[] args) throws Exception {
        int[] array = {4, 5, 2, 3, 6, 324, 23423423, 423, 4, 234, 34324, 34324, 3434, 43545, 3354};


        measureTime(() -> {
            System.out.println("Insertionsort");
            System.out.println(Arrays.toString(Insertionsort.sort(array)));
            return null;
        });

        System.out.println("==================================================================");

        measureTime(() -> {
            System.out.println("Bogosort");
            System.out.println(Arrays.toString(Bogosort.sort(array)));
            return null;
        });

    }

    public static void measureTime(Callable function) throws Exception {
        long startTime = System.nanoTime();
        function.call();
        long endTime = System.nanoTime();
        float totalTime = (float) (endTime - startTime) / 1000000000;
        System.out.println("Time: " + totalTime + " Seconds");
    }
}
