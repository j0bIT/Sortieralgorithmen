package com.pohlmann.Sort;

public class Quicksort {

    public static int[] sort(int[] toSort) {
        return sort(toSort, 0, toSort.length - 1);
    }

    public static int[] sort(int[] toSort, int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(toSort, begin, end);

            sort(toSort, begin, partitionIndex - 1);
            sort(toSort, partitionIndex + 1, end);
        }
        return toSort;
    }

    private static int partition(int[] toSort, int begin, int end) {
        int pivot = toSort[end];
        int i = (begin - 1);

        for (int j = begin; j < end; j++) {
            if (toSort[j] <= pivot) {
                i++;

                int temp = toSort[i];
                toSort[i] = toSort[j];
                toSort[j] = temp;
            }
        }

        int temp = toSort[i + 1];
        toSort[i + 1] = toSort[end];
        toSort[end] = temp;
        return i + 1;
    }

}
