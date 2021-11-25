package com.pohlmann;

import java.util.Arrays;
import java.util.concurrent.Callable;

public class Main {

    public static void main(String[] args) throws Exception {
        int[] array = {4, 5, 2, 3, 6, 324, 23423423, 423, 4, 234, 34324, 34324};
        int[] array1 = {3, 1, 4, 2};



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
