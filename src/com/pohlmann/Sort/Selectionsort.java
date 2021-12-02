package com.pohlmann.Sort;

public class Selectionsort {

    public static int[] sort(int[] toSort) {
        for (int i = 0; i < toSort.length - 1; i++) {
            for (int j = i + 1; j < toSort.length; j++) {
                if (toSort[i] > toSort[j]) {
                    int temp = toSort[i];
                    toSort[i] = toSort[j];
                    toSort[j] = temp;
                }
            }
        }
        return toSort;
    }

}
