package com.sparta.muhammad.util;

import com.sparta.muhammad.sorters.*;
import com.sparta.muhammad.sorters.binarytree.BinarySort;

import java.util.Arrays;

public class Printer {

    //gets the generated and sorted arrays from the Loader class and presents them to the user.
    public static void printer(int[] generatedArray, int[] sortedArray, long timeTaken, String sorterType) {


                System.out.println("Generated Array:          " + Arrays.toString(generatedArray));
                System.out.println(sorterType + Arrays.toString(sortedArray));
                System.out.println("Time Taken = " + timeTaken + " nanoseconds");


    }
}