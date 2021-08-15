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


        System.out.println("Generated Array:     "+Arrays.toString(arrayToSort));

        int sort = 101;
        //int[] sortedArray = arrayToSort;

        long timeTaken = 0;
        long startTime = System.nanoTime();


        for (int i = 0; i < arrayToSort.length - 1; i++){

            for (int j = 0; j < arrayToSort.length - 1 - i; j++){

                if (arrayToSort[j] > arrayToSort[j+1]){
                    sort = arrayToSort[j];
                    arrayToSort[j] = arrayToSort[j+1];
                    arrayToSort[j+1] = sort;
                }

            }
/*
            if (sort == 101){
                System.out.println("The array is already sorted! " + Arrays.toString(arrayToSort));
                return arrayToSort;
            }
*/
        }
        timeTaken = System.nanoTime() - startTime;
        System.out.println("Bubble Sorted Array: " + Arrays.toString(arrayToSort)+"\nTime Taken = "+timeTaken+" nanoseconds");
        return arrayToSort;
    }
}

