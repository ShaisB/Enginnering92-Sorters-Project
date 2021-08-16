package com.sparta.muhammad.sorters;

import java.util.Arrays;

public class MergeSort implements Sorter{

    @Override
    public int[] sortArray(int[] arrayToSort) {
        return mergeSort(arrayToSort);
    }

    private int[] mergeSort(int[] arrayToSort) {
        int[] sortedArray;
        int arraySize = arrayToSort.length;
        //if the array is only 1 long, it is already sorted and can be returned.
        if (arraySize == 1){
        return arrayToSort;
        }
        //if the array needs sorting, a midpoint is chosen, two arrays are initialised and the array is split in half into the two smaller arrays.
        else{
            int midpoint = arraySize/2;
            int[] leftArray = new int[midpoint];
            int[] rightArray;
            //check if the arrays size is odd or even as this affects the size of the right array.
            if(arraySize % 2 == 0){
            rightArray = new int[midpoint];
            }
            else{
                rightArray = new int[midpoint + 1];
            }
            //populating the left array.
            for(int i =0; i < midpoint; i++){
                leftArray[i] = arrayToSort[i];
            }
            //populating the right array.
            for(int j = 0; j < rightArray.length; j++){
                rightArray[j] = arrayToSort[midpoint + j];
            }
            //recursively calling this method to atomise the arrays.
            leftArray = mergeSort(leftArray);
            rightArray = mergeSort(rightArray);
            //creating a new array by merging the split arrays after comparing values and swapping
            sortedArray = mergeArrays(leftArray , rightArray);

        }
        return sortedArray;
    }

    private int[] mergeArrays(int[] leftArray , int[] rightArray){

        int[] sortedArray = new int[leftArray.length + rightArray.length];
        int left = 0;
        int right = 0;
        int sort = 0;

        while(left < leftArray.length || right < rightArray.length){
            //loop until all values are checked.
            if (left < leftArray.length && right < rightArray.length){
                //if the left side is smaller than the right side, we want the value from the left array in the sorted array.
                if(leftArray[left] < rightArray[right]){
                    sortedArray[sort++] = leftArray[left++];
                }
                else{
                    //if the right side is smaller than the left side, we want the value from the right array in the sorted array.
                    sortedArray[sort++] = rightArray[right++];
                }
            }
            else if (left < leftArray.length){
                sortedArray[sort++] = leftArray[left++];
            }
            else if (right < rightArray.length){
                sortedArray[sort++] = rightArray[right++];
            }
        }
        return sortedArray;
    }

}
