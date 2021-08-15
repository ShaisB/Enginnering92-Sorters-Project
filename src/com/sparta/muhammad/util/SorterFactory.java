package com.sparta.muhammad.util;

import com.sparta.muhammad.sorters.*;

public class SorterFactory {


    public int[] sorterStarter(int sorterIndex ,int[] generatedArray){

        switch(sorterIndex){
            case 1:
                BubbleSort bubbleSort = new BubbleSort();
                return bubbleSort.sortArray(generatedArray);
            case 2:
                System.out.println("Binary Sorting");
                break;
            case 3:
                MergeSort mergeSort = new MergeSort();
                return mergeSort.sortArray(generatedArray);
            case 4:
                JavaSorter javaSorter = new JavaSorter();
                return javaSorter.sortArray(generatedArray);
            case 5:
                InsertionSort insertionSort = new InsertionSort();
                return insertionSort.sortArray(generatedArray);
            case 6:
                QuickSort quickSort = new QuickSort();
                return quickSort.sortArray(generatedArray);
            case 7:
                SelectionSort selectionSort = new SelectionSort();
                return selectionSort.sortArray(generatedArray);
        }
    return null;
    }
}
