package com.sparta.muhammad.sorters;

public class QuickSort implements Sorter{
    @Override
    public int[] sortArray(int[] arrayToSort) {
        return quickSort(arrayToSort, 0, arrayToSort.length-1);
    }

    private int[] quickSort (int[] arrayToSort, int low, int high){
        if (low < high + 1){
            int p = partition(arrayToSort, low, high);
            quickSort(arrayToSort, low, p-1);
            quickSort(arrayToSort, p + 1, high);
        }
        return arrayToSort;
    }

    private void swap(int[] arrayToSort, int index1, int index2){
        int temp = arrayToSort[index1];
        arrayToSort[index1] = arrayToSort[index2];
        arrayToSort[index2] = temp;
    }

    private int partition(int[] arrayToSort, int low, int high){
        swap(arrayToSort, low, high);
        int border = low + 1;
        for (int i = border; i <= high; i++){
            if (arrayToSort[i] < arrayToSort[low]){
                swap(arrayToSort, i, border++);
            }
        }
        swap(arrayToSort, low, border-1);
        return border - 1;
    }
}