package com.sparta.muhammad.util;

import java.util.Scanner;

public class SelectSorter {

    public static int SelectSorter(){
        //ask the user which sorting algorithm they want to use.
        System.out.println("\nWhich sorting algorithm would you like to use?: \n1: Bubble Sort\n2: BinaryTree\n3: Merge Sort\n4. Selection Sort\n5. Insertion Sort\n6. Quick Sort\n7. Java Collections");

        //specify how to select an algorithm
        System.out.println("\nEnter your desired algorithms number: ");
        //creating a new scanner to take the users keyboard input
        Scanner chooseSorter = new Scanner(System.in);

        int sorterIndex;
        //tries to store the user input as an int, if they didn't enter an int they will be asked to do so and presented with the options again.
        try {
            sorterIndex = chooseSorter.nextInt();
        }catch (Exception e){
            System.out.println("Please select a valid sorter by it's index (i.e. '1' for Bubble Sort");
            return SelectSorter();
        }
        //check if they entered a valid sorter. sorter index must be above 0 and below or equal to the number of sorters.
        //if they enter an invalid number they will be given an error message and sent back to the selection step
        if(0 < sorterIndex && sorterIndex <= 7){
        return sorterIndex;
        }
        else {
            System.out.println("Please select a valid sorter!");
            return SelectSorter();
        }

    }

}
