package com.sparta.muhammad.util;

public class TypeOfSort {

    public String sorterType(int sorterIndex){

        String sortMethod = "";

        switch (sorterIndex) {
            case 1:
                sortMethod = "Bubble Sorted Array:      ";
                break;
            case 2:
                sortMethod = "Binary Tree Sorted Array: ";
                break;
            case 3:
                sortMethod = "Merge Sorted Array:       ";
                break;
            case 4:
                sortMethod = "Selection Sorted Array:   ";
                break;
            case 5:
                sortMethod = "Insertion Sorted Array:   ";
                break;
            case 6:
                sortMethod = "Quick Sorted Array:       ";
                break;
            case 7:
                sortMethod = "Java Sorted Array:        ";
                break;
        }
        return sortMethod;
    }

}
