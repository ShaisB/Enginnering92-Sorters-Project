package com.sparta.muhammad.sorters.binarytree;

import com.sparta.muhammad.sorters.BinaryTreeSort;
import com.sparta.muhammad.sorters.Sorter;

public class BinaryTree implements BinaryTreeInterface, Sorter {

    private final Node rootNode;

    @Override
    public int[] sortArray(int[] arrayToSort) {
        return new int[0];
    }

    public BinaryTree(final int element){
        rootNode = new Node(element);
    }

    @Override
    public int getRootElement() {
        return 0;
    }

    @Override
    public int getNumberOfElements() {
        return 0;
    }

    public void addElement(final int element) {
        addNodeToTree(rootNode, element);
    }

    @Override
    public void addElements(int[] elements) {

    }

    public boolean findElement (final int value){
        Node node = findNode(value);
        if (node != null) return true;
        else return false;
    }

    @Override
    public int[] getSortedTreeAsc() {
        return new int[0];
    }

    @Override
    public int[] getSortedTreeDesc() {
        return new int[0];
    }

    private Node findNode(int element){
        Node node = rootNode;
        while (node != null){
            if (element == node.getValue()){
                return node;
            }
            if (element < node.getValue()){
                node = node.getLeftChild();
            }
            else {
                node = node.getRightChild();
            }
        }
        return null;
    }

    private void addNodeToTree(Node node, int element){
        if (element == node.getValue()) return;

        if (element < node.getValue()){
            if (node.isLeftChildEmpty()){
                node.setLeftChild(new Node(element));
            }
            else{
                addNodeToTree(node.getLeftChild(), element);
            }
            if (node.isRightChildEmpty()){
                node.setRightChild(new Node(element));
            }
            else{
                addNodeToTree(node.getRightChild(), element);
            }
            }
        }


}

