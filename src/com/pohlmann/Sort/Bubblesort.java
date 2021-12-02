package com.pohlmann.Sort;

public class Bubblesort {

    public static int[] sort(int[] toSort) {

        for (int i = 0; i < toSort.length -1; i++) {
            for (int j = 0; j < toSort.length - 1; j++) {
                if (toSort[i] < toSort[i + 1]) {
                    continue;
                }
                int temp = toSort[i];
                toSort[i] = toSort[i + 1];
                toSort[i + 1] = temp;
            }
        }

        return toSort;
    }

}
