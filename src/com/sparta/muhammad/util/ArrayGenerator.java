package com.sparta.muhammad.util;

public class ArrayGenerator {



   public static int[] arrayToSort(){

      int numberOfValues = GetArraySize.getArraySize();

      if (numberOfValues != -1){

      int [] arrayToSort = new int[numberOfValues];

       for (int i = 0; i<numberOfValues; i++)
           arrayToSort[i] = (int) (100*Math.random());

       //System.out.println("\nGenerated Array:     " + Arrays.toString(arrayToSort));
       return arrayToSort;

   }

      else {
          int [] arrayToSort = {1,2,3,4,5,6,7,8,9};
          return arrayToSort;
      }

   }

}
