package com.pohlmann;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws Exception {
        int[] array = {4, 5, 2, 3, 6, 324, 23423423, 423, 4, 234, 34324, 34324};

        System.out.println("Mergesort");
        Tools.measureTime(() -> {
            System.out.println(Arrays.toString(Mergesort.sort(array.clone())));
            return null;
        });

        System.out.println("==================================================================");

        System.out.println("Quicksort");
        Tools.measureTime(() -> {
            System.out.println(Arrays.toString(Quicksort.sort(array.clone())));
            return null;
        });

        System.out.println("==================================================================");

        System.out.println("Insertionsort");
        Tools.measureTime(() -> {
            System.out.println(Arrays.toString(Insertionsort.sort(array.clone())));
            return null;
        });

        System.out.println("==================================================================");

        System.out.println("Bogosort");
        Tools.measureTime(() -> {
            System.out.println(Arrays.toString(Bogosort.sort(array.clone())));
            return null;
        });

    }
}
