package com.sparta.muhammad.sorters.binarytree;

public interface BinaryTreeInterface {

        int getRootElement();

        int getNumberOfElements();

        void addElement(int element);

        void addElements(int[] elements);

        boolean findElement(int value);

//        int getLeftChild(int element) throws ChildNotFoundException;

//        int getRightChild(int element) throws ChildNotFoundException;

        int[] getSortedTreeAsc();

        int[] getSortedTreeDesc();
    }


