package com.sparta.muhammad.sorters;

import com.sparta.muhammad.util.ArrayGenerator;
import com.sparta.muhammad.util.GetTime;

import java.util.Arrays;

public class BubbleSort implements Sorter {
    @Override
    public int[] sortArray(int[] arrayToSort) {
        return bubbleSort(arrayToSort);
    }

    private int[] bubbleSort(int[] arrayToSort){

        //initialising a variable to be used as temporary storage if a swap is needed. 101 chosen as a value that can never be in the array.
        int sort = 101;

        //Outer loop, iterating once for every element of the array
        for (int i = 0; i < arrayToSort.length - 1; i++){
            //inner loop comparing values to the value on their right and swapping if needed.
            for (int j = 0; j < arrayToSort.length - 1 - i; j++){

                if (arrayToSort[j] > arrayToSort[j+1]){
                    sort = arrayToSort[j];
                    arrayToSort[j] = arrayToSort[j+1];
                    arrayToSort[j+1] = sort;
                }

            }
            //if the sort variable is still at 101 after one iteration of the outer loop, the array must already be sorted.
            if (sort == 101){
                System.out.println("The array is already sorted!");
                return arrayToSort;
            }

        }
        return arrayToSort;
    }
}

