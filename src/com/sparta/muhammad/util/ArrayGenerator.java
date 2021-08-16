package com.sparta.muhammad.util;

public class ArrayGenerator {



   public static int[] arrayToSort(){

      //calls the getArraySize method to get the users desired array size.
      int numberOfValues = GetArraySize.getArraySize();
      //checks if the user used the test phrase. if they didn't it generates a random array.
      if (numberOfValues != -1){

      int [] arrayToSort = new int[numberOfValues];
       //creates a for loop that adds a random number to the array and loops for as long as the users desired array size.
       for (int i = 0; i<numberOfValues; i++)
           arrayToSort[i] = (int) (100*Math.random());

       //System.out.println("\nGenerated Array:     " + Arrays.toString(arrayToSort));
       return arrayToSort;

   }
      //if the user entered the test phrase it returns a premade array for testing.
      else {
          int [] arrayToSort = {1,2,3,4,5,6,7,8,9};
          return arrayToSort;
      }

   }

}
