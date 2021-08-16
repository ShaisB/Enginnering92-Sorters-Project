package com.sparta.muhammad.util;

public class ArrayDuplicator {

    public static int[] duplicateArray(int[] randomArray){

        int[] duplicatedArray = new int[randomArray.length];

        for (int i = 0; i < duplicatedArray.length; i++){
            duplicatedArray[i] = randomArray[i];
        }
        return duplicatedArray;
    }

}
