package com.sparta.muhammad.sorters;

import com.sparta.muhammad.util.ArrayGenerator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class JavaSorter{

        public static int[] javaSorter(int[] generatedArray){

            System.out.println("Generated Array:     "+ Arrays.toString(generatedArray));

            ArrayList<Integer> inputArrayList = new ArrayList<Integer>();

            for(int i = 0; i < generatedArray.length; i++){
                inputArrayList.add(generatedArray[i]);
            }

            long startTime = System.nanoTime();

            Collections.sort(inputArrayList);

            long timeTaken = System.nanoTime() - startTime;

            System.out.println("Java Sorted:         "+inputArrayList+"\nTime Taken = "+timeTaken+" nanoseconds");

            int[] sortedArray = new int[generatedArray.length];

            for(int i = 0; i < sortedArray.length; i++){
                sortedArray[i] = inputArrayList.get(i);
            }


            return sortedArray;
        }


}
