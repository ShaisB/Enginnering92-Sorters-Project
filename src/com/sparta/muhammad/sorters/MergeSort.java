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
        if (arraySize == 1){
        return arrayToSort;
        }
        else{
            int midpoint = arraySize/2;
            int[] leftArray = new int[midpoint];
            int[] rightArray;
            if(arraySize % 2 == 0){
            rightArray = new int[midpoint];
            }
            else{
                rightArray = new int[midpoint + 1];
            }

            for(int i =0; i < midpoint; i++){
                leftArray[i] = arrayToSort[i];
            }

            for(int j = 0; j < rightArray.length; j++){
                rightArray[j] = arrayToSort[midpoint + j];
            }
            leftArray = mergeSort(leftArray);
            rightArray = mergeSort(rightArray);
            //System.out.println(Arrays.toString(leftArray));
            //System.out.println(Arrays.toString(rightArray));
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

            if (left < leftArray.length && right < rightArray.length){
                if(leftArray[left] < rightArray[right]){
                    sortedArray[sort++] = leftArray[left++];
                }
                else{
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
