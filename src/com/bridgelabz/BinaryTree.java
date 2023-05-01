package com.bridgelabz;

public class BinaryTree <T extends Comparable<T>> {

    INode<T> root;

    public void add(T data) {
        /*
         * Adding the new node.
         * when the root is null, then create a new node.
         */
        INode<T> newNode = new INode<>(data);
        if (root == null) {
            root = newNode;
            return;
        }
        /*
         * When the current pointer is in the root;
         * when the value is less than zero, the current pointer is next to left
         * otherwise the pointer is next to right.
         */
        INode<T> currentPointer= root;
        while(currentPointer.nextL != null && currentPointer.nextR != null) {

            if (data.compareTo(currentPointer.data) < 0) {
                currentPointer = currentPointer.nextL;
            } else {
                currentPointer = currentPointer.nextR;
            }
        }
        /*
         * when the value is less , the current pointer creates the new node next to left
         * * when the value is greater , the current pointer creates the new node next to right
         */
        if(data.compareTo(currentPointer.data) < 0) {
            currentPointer.nextL = newNode;
        } else {
            currentPointer.nextR = newNode;
        }
    }
    public void traverse(INode<T> currentPointer){

        if (currentPointer == null)
            return;
        traverse(currentPointer.nextL);
        System.out.print(currentPointer.data+" ");
        traverse(currentPointer.nextR);
    }

    public void display(){
        traverse(root);
    }
}
