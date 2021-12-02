package com.pohlmann.Sort;

public class Mergesort {
    public static int[] sort(int[] toSort) {
        return sort(toSort, 0, toSort.length - 1);
    }

    public static int[] sort(int[] toSort, int begin, int end) {
        if (begin < end) {
            int q = (begin + end) / 2;

            sort(toSort, begin, q);
            sort(toSort, q + 1, end);
            merge(toSort, begin, q, end);
        }
        return toSort;
    }

    private static void merge(int[] toSort, int l, int q, int r) {
        int[] arr = new int[toSort.length];
        int i, j;
        for (i = l; i <= q; i++) {
            arr[i] = toSort[i];
        }
        for (j = q + 1; j <= r; j++) {
            arr[r + q + 1 - j] = toSort[j];
        }
        i = l;
        j = r;
        for (int k = l; k <= r; k++) {
            if (arr[i] <= arr[j]) {
                toSort[k] = arr[i];
                i++;
            } else {
                toSort[k] = arr[j];
                j--;
            }
        }
    }
}
