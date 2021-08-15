package com.sparta.muhammad;

import com.sparta.muhammad.util.ArrayGenerator;
import com.sparta.muhammad.util.Printer;
import com.sparta.muhammad.util.SelectSorter;
import com.sparta.muhammad.util.SorterFactory;

import java.util.Arrays;

public class Loader {

    public static void loader(){

        //generate a random array - currently the array generator calls GetArraySize, maybe separate these
        int[] generatedArray = ArrayGenerator.arrayToSort();

        //find out what sorter the user wants
        int sorterIndex = SelectSorter.SelectSorter();

        //executing the desired sorter with the randomly generated array
        SorterFactory sorterFactory = new SorterFactory();
        int[] sortedArray = sorterFactory.sorterStarter(sorterIndex , generatedArray);

        //displaying the arrays
        Printer.printer(generatedArray, sortedArray);

    }


}
