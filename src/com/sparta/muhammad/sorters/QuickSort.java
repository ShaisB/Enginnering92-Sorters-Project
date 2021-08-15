package com.sparta.muhammad.sorters;

import java.util.Arrays;

public class QuickSort implements Sorter{
    @Override
    public int[] sortArray(int[] arrayToSort) {
        return quickSort(arrayToSort, 0, arrayToSort.length);
    }

    private int[] quickSort(int[] arrayToSort,int left,int right){
        System.out.println("Sorry not implemented yet!");
        return arrayToSort;
    }
}