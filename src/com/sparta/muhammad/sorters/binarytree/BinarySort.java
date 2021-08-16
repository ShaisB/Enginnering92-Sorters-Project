package com.sparta.muhammad.sorters.binarytree;

import com.sparta.muhammad.sorters.Sorter;

import java.util.Arrays;

public class BinarySort implements Sorter {

    Node root;

    @Override
    public int[] sortArray(int[] arrayToSort) {
        BinarySort tree = new BinarySort();
        for (int i : arrayToSort)
            tree.insert(i);
        tree.inOrder();
        return arrayToSort;
    }

    public boolean insert(int val) {
        if (root == null) {
            root = new Node(val);
            return true;
        }
        else
            return root.insert(val);
    }

    public boolean find(int val) {
        if (root == null)
            return false;
        else
            return root.find(val);
    }

    public int getHeight() {
        if (root != null)
            return root.getHeight();
        else
            return 0;
    }

    public void inOrder() {
        if (root != null) {
            root.inorder();
        }
    }

    private class Node {
        private Node leftChild;
        private Node rightChild;
        private int data;

        private Node(int val) {
            data = val;
            leftChild = null;
            rightChild = null;
        }

        private boolean insert(int val) {
            boolean added = false;
            if (this == null) {
                this.data = val;
                return true;
            }
            else {
                if (val < this.data) {
                    if (this.leftChild == null) {
                        this.leftChild = new Node(val);
                        return true;
                    }
                    else
                        added = this.leftChild.insert(val);
                }
                else if (val > this.data) {
                    if (this.rightChild == null) {
                        this.rightChild = new Node(val);
                        return true;
                    }
                    else
                        added = this.rightChild.insert(val);
                }
            }
            return added;
        }

        private boolean find(int val) {
            boolean found = false;
            if (this == null)
                return false;
            else {
                if (val == this.data)
                    return true;
                else if (val < this.data && this.leftChild != null)
                    found = this.leftChild.find(val);
                else if (val > this.data && this.rightChild != null)
                    found = this.rightChild.find(val);
            }
            return found;
        }

        private int getHeight() {
            int leftHeight = 0, rightHeight = 0;

            if (this.leftChild != null)
                leftHeight = this.leftChild.getHeight();

            if (this.rightChild != null)
                rightHeight = this.rightChild.getHeight();

            return 1 + Math.max(leftHeight, rightHeight);
        }

        private int getSize() {
            int leftSize = 0, rightSize = 0;

            if (this.leftChild != null)
                leftSize = this.leftChild.getSize();

            if (this.rightChild != null)
                rightSize = this.rightChild.getSize();

            return 1 + leftSize + rightSize;
        }

        private void preorder() {
            if (this != null) {
                System.out.println(this.data);
                if (this.leftChild != null)
                    this.leftChild.preorder();
                if (this.rightChild != null)
                    this.rightChild.preorder();
            }
        }

        private void postorder() {
            if (this != null) {
                if (this.leftChild != null)
                    this.leftChild.postorder();
                if (this.rightChild != null)
                    this.rightChild.postorder();
                System.out.println(this.data);
            }
        }

        private void inorder() {

            if (this != null) {
                if (this.leftChild != null)
                    this.leftChild.inorder();
                System.out.println(this.data);
                if (this.rightChild != null)
                    this.rightChild.inorder();
            }
        }
    }


}
