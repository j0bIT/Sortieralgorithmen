package com.pohlmann;

import java.util.Arrays;
import java.util.concurrent.Callable;

public class Main {

    public static void main(String[] args) throws Exception {
        int[] array1 = {4, 5, 2, 3, 6, 324, 23423423, 423, 4, 234, 34324, 34324, 3434, 43545, 3354, 32, 323, 3223, 3233, 3232, 4545, 54645, 435435, 43543543, 545345, 34543, 435435, 345345, 345435, 435345, 43543555, 2132, 2, 3, 0, 1, 231, 3213, 7, 8, 4, 5, 2, 3, 6, 324, 23423423, 423, 4, 234, 34324, 34324, 3434, 43545, 3354, 32, 323, 3223, 3233, 3232, 4545, 54645, 435435, 43543543, 545345, 34543, 435435, 345345, 345435, 435345, 43543555, 2132, 2, 3, 0, 1, 231, 3213, 7, 8, 4, 5, 2, 3, 6, 324, 23423423, 423, 4, 234, 34324, 34324, 3434, 43545, 3354, 32, 323, 3223, 3233, 3232, 4545, 54645, 435435, 43543543, 545345, 34543, 435435, 345345, 345435, 435345, 43543555, 2132, 2, 3, 0, 1, 231, 3213, 7, 8, 4, 5, 2, 3, 6, 324, 23423423, 423, 4, 234, 34324, 34324, 3434, 43545, 3354, 32, 323, 3223, 3233, 3232, 4545, 54645, 435435, 43543543, 545345, 34543, 435435, 345345, 345435, 435345, 43543555, 2132, 2, 3, 0, 1, 231, 3213, 7, 8, 4, 5, 2, 3, 6, 324, 23423423, 423, 4, 234, 34324, 34324, 3434, 43545, 3354, 32, 323, 3223, 3233, 3232, 4545, 54645, 435435, 43543543, 545345, 34543, 435435, 345345, 345435, 435345, 43543555, 2132, 2, 3, 0, 1, 231, 3213, 7, 8};
        int arraySize = 10;

        int index = 0;
        int[] array = new int[arraySize];
        for(int i = arraySize; i > 0; i--){
            array[index] = i;
            index++;
        }


        System.out.println("Insertionsort");
        measureTime(() -> {
            System.out.println(Arrays.toString(Insertionsort.sort(array.clone())));
            return null;
        });

        System.out.println("==================================================================");

        System.out.println("Bogosort");
        measureTime(() -> {
            System.out.println(Arrays.toString(Bogosort.sort(array.clone())));
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
