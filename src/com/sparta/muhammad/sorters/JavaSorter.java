package com.sparta.muhammad.sorters;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class JavaSorter implements Sorter{

    @Override
    public int[] sortArray(int[] arrayToSort) {
        return collectionsSort(arrayToSort);
    }

    private int[] collectionsSort(int[] arrayToSort){
        //System.out.println("Generated Array:     "+ Arrays.toString(arrayToSort));

        long startTime = System.nanoTime();
        //Using javas Arrays.sort() method to sort the randomly generated array.
        Arrays.sort(arrayToSort);

        long timeTaken = System.nanoTime() - startTime;
        //System.out.println("Java Sorted:         "+Arrays.toString(arrayToSort)+"\nTime Taken = "+timeTaken+" nanoseconds");

        return arrayToSort;
    }

}
