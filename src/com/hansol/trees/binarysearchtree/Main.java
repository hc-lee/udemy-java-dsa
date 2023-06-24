package com.hansol.trees.binarysearchtree;

public class Main {

    public static void main(String[] args) {

        Tree intTree = new Tree();

        intTree.insert(25);
        intTree.insert(20);
        intTree.insert(15);
        intTree.insert(27);
        intTree.insert(30);
        intTree.insert(29);
        intTree.insert(26);
        intTree.insert(22);
        intTree.insert(32);
        intTree.insert(17);
        intTree.delete(17);

        System.out.print("In order traversal: ");
        intTree.traverseInOrder();
        System.out.println();

        System.out.print("Pre order traversal: ");
        intTree.traversePreOrder();
        System.out.println();

        System.out.println(intTree.get(26));

        // Should be 15
        System.out.println(intTree.min());
        //Should be 32
        System.out.println(intTree.max());
    }

}
