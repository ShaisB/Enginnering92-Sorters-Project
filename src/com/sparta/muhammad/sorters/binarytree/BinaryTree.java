package com.sparta.muhammad.sorters.binarytree;

public class BinaryTree {

    private final Node rootNode;

    public BinaryTree(final int element){
        rootNode = new Node(element);
    }

    public void addElement(final int element) {
        addNodeToTree(rootNode, element);
    }

    public boolean findElement (final int value){
        Node node = findNode(value);
        if (node != null) return true;
        else return false;
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

