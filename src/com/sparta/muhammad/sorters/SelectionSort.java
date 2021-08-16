package com.sparta.muhammad.sorters;

public class SelectionSort implements Sorter{
    @Override
    public int[] sortArray(int[] arrayToSort) {
        return selectionSort(arrayToSort);
    }

    private int[] selectionSort(int[] arrayToSort){
        /*
        Initialising the variables needed for this algorithm.
        smallestValue to know what value needs to moved to the far left of the unsorted section.
        smallestValue index to know where the smallest value is stored in the array.
        swap to temporarily store a value while swapping values.
        */
        int smallestValue = 0;
        int smallestValueIndex = 0;
        int swap = 0;
        /*
        Outer loop selects the first unsorted value and loops until it has run through every index of the array.
        Inner loop checks if the value to the right of the current smallest number is smaller.
        If it is smaller, it becomes the new smallestValue
         */
        for (int i = 0; i < arrayToSort.length; i++){
            smallestValue = arrayToSort[i];
            smallestValueIndex = i;
            for (int j = i + 1; j < arrayToSort.length; j++){
                if (arrayToSort[j] < smallestValue){
                    smallestValue = arrayToSort[j];
                    smallestValueIndex = j;
                }
            }
            //if the smallestNumber on this iteration is smaller than the left most unsorted value, the values are swapped.
            if (smallestValue < arrayToSort[i]){
                swap = arrayToSort[i];
                arrayToSort[i] = arrayToSort[smallestValueIndex];
                arrayToSort[smallestValueIndex] = swap;
            }
        }

        return arrayToSort;
    }
}
