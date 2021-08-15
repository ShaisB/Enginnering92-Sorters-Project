package com.sparta.muhammad.util;

import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class SelectSorter {

    public static int SelectSorter(){

        System.out.println("\nWhich sorting algorithm would you like to use?: \n1: Bubble Sort\n2: BinaryTree\n3: Merge Sort\n4. Java Collections\n5. Insertion Sort\n6. Quick Sort");

        Select:
        System.out.println("\nEnter your desired algorithms number: ");

        Scanner chooseSorter = new Scanner(System.in);

        int sorterIndex;

        try {
            sorterIndex = chooseSorter.nextInt();
        }catch (Exception e){
            System.out.println("Please select a valid sorter by it's index (i.e. '1' for Bubble Sort");
            return SelectSorter();
        }

        if(0 < sorterIndex && sorterIndex <= 7){
        return sorterIndex;
        }
        else {
            System.out.println("Please select a valid sorter!");
            return SelectSorter();
        }

    }

}
