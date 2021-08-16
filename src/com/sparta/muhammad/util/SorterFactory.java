package com.sparta.muhammad.util;

import com.sparta.muhammad.sorters.*;
import com.sparta.muhammad.sorters.binarytree.BinarySort;

public class SorterFactory {


    public int[] sorterStarter(int sorterIndex ,int[] generatedArray){

        switch(sorterIndex){
            case 1:
                BubbleSort bubbleSort = new BubbleSort();
                return bubbleSort.sortArray(generatedArray);
            case 2:
                BinarySort binarySort = new BinarySort();
                return binarySort.sortArray(generatedArray);
            case 3:
                MergeSort mergeSort = new MergeSort();
                return mergeSort.sortArray(generatedArray);
            case 4:
                SelectionSort selectionSort = new SelectionSort();
                return selectionSort.sortArray(generatedArray);
            case 5:
                InsertionSort insertionSort = new InsertionSort();
                return insertionSort.sortArray(generatedArray);
            case 6:
                QuickSort quickSort = new QuickSort();
                return quickSort.sortArray(generatedArray);
            case 7:
                JavaSorter javaSorter = new JavaSorter();
                return javaSorter.sortArray(generatedArray);
        }
    return null;
    }
}
