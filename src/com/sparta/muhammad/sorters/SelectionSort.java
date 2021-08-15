package com.sparta.muhammad.sorters;

public class SelectionSort implements Sorter{
    @Override
    public int[] sortArray(int[] arrayToSort) {
        return selectionSort(arrayToSort);
    }

    private int[] selectionSort(int[] arrayToSort){

        int smallestValue = 0;
        int smallestValueIndex = 0;
        int swap = 0;

        for (int i = 0; i < arrayToSort.length; i++){
            smallestValue = arrayToSort[i];
            smallestValueIndex = i;
            for (int j = i; j < arrayToSort.length; j++){
                if (arrayToSort[j] < smallestValue){
                    smallestValue = arrayToSort[j];
                    smallestValueIndex = j;
                }
            }
            if (smallestValue < arrayToSort[i]){
                swap = arrayToSort[i];
                arrayToSort[i] = arrayToSort[smallestValueIndex];
                arrayToSort[smallestValueIndex] = swap;
            }
        }

        return arrayToSort;
    }
}
