package com.sparta.muhammad.util;

import java.util.Scanner;

public class GetArraySize {

    public static int getArraySize() {

        //creates a new scanner to get user input for how large an array they want to generate.
        Scanner keyboard = new Scanner(System.in);
        //prompts the user to enter their desired array size.
        System.out.print("How many numbers would you like to generate? : ");

        //tries to store the array size as an int.
        try {
            int arraySize = keyboard.nextInt();
            //ensures they do not choose a negative size. if they have they are prompted to choose a positive integer and returned to the size selection.
            if(arraySize > 0){
            System.out.println("Creating an array with "+arraySize+" elements");
            return arraySize;
            }
            else{
                System.out.println("Positive integers only please!");
                return getArraySize();
            }
        }
        //if they did not enter an integer the exception is caught here
        catch (Exception e){

            String alreadyOrderedTest = keyboard.next();
            //if the user typed 'ordered' array size will be set to -1 which tells the generator to create a preset ordered array.
            if(alreadyOrderedTest.equals("ordered"))
            {
                System.out.println("Creating an already ordered array");
                int arraySize = -1;
                return arraySize;
            }
            //any other entries will tell the user they can only use positive integers and ask them again how big an array they want to generate.
            else {
                System.out.println("Positive integers only please!");
            }
        }
        return getArraySize();
    }
}
