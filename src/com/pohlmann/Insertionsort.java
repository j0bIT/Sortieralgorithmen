package com.pohlmann;

public class Insertionsort {
    public static int[] sort(int[] toSort){
        for (int i = 1; i < toSort.length; i++){
            int j = i;
            while (j > 0 && toSort[j-1] > toSort[i]){
                toSort[j] = toSort[j-1];
                j--;
            }
        }
        return toSort;
    }
}
