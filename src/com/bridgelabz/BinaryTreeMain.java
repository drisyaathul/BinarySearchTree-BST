package com.bridgelabz;

public class BinaryTreeMain {
    public static void main(String[] args) {
        BinaryTree<Integer> binaryTree = new BinaryTree<>();
        binaryTree.add(56);
        binaryTree.add(30);
        binaryTree.add(70);

        binaryTree.add(25);
        binaryTree.add(80);
        binaryTree.add(15);
        binaryTree.add(60);

        binaryTree.add(75);
        binaryTree.add(20);
        binaryTree.display(binaryTree.root);
    }
}
