package com.pohlmann;

import java.util.Arrays;
import java.util.Random;

public class Bogosort {
    public static int[] sort(int[] toSort) {
        int n = 0;

        Random r = new Random();
        while (!isSorted(toSort)) {
            int a = r.nextInt(toSort.length);
            int b = r.nextInt(toSort.length);

            int temp = toSort[a];
            toSort[a] = toSort[b];
            toSort[b] = temp;

            n += toSort.length + 2;
        }

        System.out.println("Laufzeit: " + n);

        return toSort;
    }

    private static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) return false;
        }
        return true;
    }
}
