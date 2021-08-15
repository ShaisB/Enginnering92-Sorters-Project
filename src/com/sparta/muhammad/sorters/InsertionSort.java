package com.sparta.muhammad.sorters;

public class InsertionSort implements Sorter{
    @Override
    public int[] sortArray(int[] arrayToSort) {
        return insertionSort(arrayToSort);
    }

    private int[] insertionSort(int[] arrayToSort){
        int key;
        int swap;
        int j;
        for (int i = 1; i < arrayToSort.length; i++){
            key = arrayToSort[i];
            j = i-1;
            while (j >= 0 && key < arrayToSort[j]){
                swap = arrayToSort[j];
                arrayToSort[j] = arrayToSort[j+1];
                arrayToSort[j+1] = swap;
                j--;
            }

        }
        return arrayToSort;
    }


}
