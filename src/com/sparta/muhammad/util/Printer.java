package com.sparta.muhammad.util;

import java.util.Arrays;

public class Printer {

    //gets the generated and sorted arrays from the Loader class and presents them to the user.
    public static void printer(int[] generatedArray, int[] sortedArray, long timeTaken){
        System.out.println("Generated Array:  " + Arrays.toString(generatedArray));
        System.out.println("Sorted Array:     "+Arrays.toString(sortedArray));
        System.out.println("Time Taken = "+timeTaken+" nanoseconds");
    }

}
