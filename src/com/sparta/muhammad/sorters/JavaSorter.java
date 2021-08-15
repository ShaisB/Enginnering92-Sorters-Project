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
        System.out.println("Generated Array:     "+ Arrays.toString(arrayToSort));
/*
        ArrayList<Integer> inputArrayList = new ArrayList<Integer>();

        for (int i : arrayToSort) {
            inputArrayList.add(i);
        }
*/
        long startTime = System.nanoTime();

        Arrays.sort(arrayToSort);

        long timeTaken = System.nanoTime() - startTime;
        System.out.println("Java Sorted:         "+Arrays.toString(arrayToSort)+"\nTime Taken = "+timeTaken+" nanoseconds");
        /*
        Collections.sort(inputArrayList);

        long timeTaken = System.nanoTime() - startTime;

        System.out.println("Java Sorted:         "+inputArrayList+"\nTime Taken = "+timeTaken+" nanoseconds");

        int[] sortedArray = new int[arrayToSort.length];

        for(int i = 0; i < sortedArray.length; i++){
            sortedArray[i] = inputArrayList.get(i);
        }
    */
        return arrayToSort;
    }

}
