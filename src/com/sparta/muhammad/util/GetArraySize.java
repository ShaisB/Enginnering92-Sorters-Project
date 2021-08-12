package com.sparta.muhammad.util;

import java.util.Scanner;

public class GetArraySize {

    public static int getArraySize() {

        Scanner keyboard = new Scanner(System.in);
        System.out.print("How many numbers would you like to generate? : ");
        try {
            int arraySize = keyboard.nextInt();
            if(arraySize > 0){
            System.out.println("Creating an array with "+arraySize+" elements");
            return arraySize;
            }
            else{
                System.out.println("Positive integers only please!");
                return getArraySize();
            }
        }
        catch (Exception e){

            String alreadyOrderedTest = keyboard.next();

            if(alreadyOrderedTest.equals("ordered"))
            {
                System.out.println("Creating an already ordered array");
                int arraySize = -1;
                return arraySize;
            }
            else {
                System.out.println("Positive integers only please!");
            }
        }
        return getArraySize();
    }
}
