package com.sparta.muhammad.util;

import com.sparta.muhammad.sorters.BubbleSort;
import com.sparta.muhammad.sorters.JavaSorter;

public class SorterStarter {


    public int[] sorterStarter(String sorterType ,int[] generatedArray){

        switch(sorterType){
            case "Bubble":
                BubbleSort bubbleSort = new BubbleSort();
                return bubbleSort.sortArray(generatedArray);
            case "Binary":
                System.out.println("Binary Sorting");
                break;
            case "Merge":
                System.out.println("Merge Sorting");
                break;
            case "Collections":
                return JavaSorter.javaSorter(generatedArray);

            case "Something Broke":
                System.out.println("I don't know how you've managed to get here, try again");
                break;
        }




    return null;
    }

}
