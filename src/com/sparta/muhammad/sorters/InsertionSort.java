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
        //iterate once per element in the array, setting the key to the next (starting from the left) value.
        //start at i = 1 because the first value is assumed to be sorted, so we start with the second value.
        for (int i = 1; i < arrayToSort.length; i++){
            key = arrayToSort[i];
            j = i-1;
            //comparing the key to all elements to its left and swapping where needed.
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
