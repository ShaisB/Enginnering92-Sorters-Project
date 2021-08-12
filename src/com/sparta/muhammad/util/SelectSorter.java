package com.sparta.muhammad.util;

import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class SelectSorter {

    public static String SelectSorter(){

        System.out.println("\nWhich sorting algorithm would you like to use?: \n1: Bubble Sort\n2: BinaryTree\n3: Merge Sort\n4. Java Collections");

        Select:
        System.out.println("\nEnter your desired algorithms number: ");

        Scanner chooseSorter = new Scanner(System.in);

        int chosenSorter;

        try {
            chosenSorter = chooseSorter.nextInt();
        }catch (Exception e){
            System.out.println("Please select a valid sorter (i.e. '1' for Bubble Sort");
            return SelectSorter();
        }


        switch (chosenSorter){
            case 1:
                System.out.println("Bubble Sorting");
                SortMethods sorters = SortMethods.BubbleSort;
                return "Bubble";
            case 2:
                System.out.println("BinaryTree Sorting");
                return "Binary";
            case 3:
                System.out.println("Merge Sorting");
                return "Merge";
            case 4:
                System.out.println("Using Javas in-built sort");
                return "Collections";
            default:
                System.out.println("Please select a valid sorter");
                SelectSorter();
        }
        return "Something Broke";
    }

}
