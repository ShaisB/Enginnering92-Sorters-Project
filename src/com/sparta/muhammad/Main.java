package com.sparta.muhammad;

import com.sparta.muhammad.sorters.BubbleSort;
import com.sparta.muhammad.sorters.JavaSorter;
import com.sparta.muhammad.sorters.binarytree.BinaryTree;
import com.sparta.muhammad.util.*;
import java.util.Arrays;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //generate a random array
        int[] generatedArray = ArrayGenerator.arrayToSort();

        //JavaSorter.javaSorter();

        String sorterType = SelectSorter.SelectSorter();
        SorterStarter sorterStarter = new SorterStarter();
        int[] sortedArray = sorterStarter.sorterStarter(sorterType , generatedArray);
        System.out.println("\n\n");
        System.out.println("Generated Array:  " + Arrays.toString(generatedArray));
        System.out.println("Sorted Array:     "+Arrays.toString(sortedArray));
    }

}