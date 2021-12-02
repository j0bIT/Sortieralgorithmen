package com.pohlmann.Sort;

public class Insertionsort {
    public static int[] sort(int[] toSort){
        int n = 0;
        for (int i = 1; i < toSort.length; i++) {
            int key = toSort[i];
            int j = i-1;
            while ( (j > -1) && ( toSort [j] > key ) ) {
                toSort [j+1] = toSort [j];
                j--;
                n+=2;
            }
            toSort[j+1] = key;
        }
        System.out.println("Laufzeit: " + n);
        return toSort;
    }
}
