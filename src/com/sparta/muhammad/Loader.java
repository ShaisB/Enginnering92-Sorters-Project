package com.sparta.muhammad;

import com.sparta.muhammad.sorters.Sorter;
import com.sparta.muhammad.util.*;

import java.lang.reflect.Type;
import java.util.Arrays;

public class Loader {

    public static void loader(){

        //generate a random array - currently the array generator calls GetArraySize, maybe separate these
        int[] generatedArray = ArrayGenerator.arrayToSort();

        int[] duplicatedArray = ArrayDuplicator.duplicateArray(generatedArray);

        //find out what sorter the user wants
        int sorterIndex = SelectSorter.SelectSorter();

        //executing the desired sorter with the randomly generated array
        SorterFactory sorterFactory = new SorterFactory();
        long startTime = System.nanoTime();
        int[] sortedArray = sorterFactory.sorterStarter(sorterIndex , duplicatedArray);
        long timeTaken = System.nanoTime() - startTime;

        TypeOfSort typeOfSort = new TypeOfSort();
        String sorterType = typeOfSort.sorterType(sorterIndex);

        //displaying the arrays
        Printer.printer(generatedArray, sortedArray, timeTaken, sorterType);


    }


}
