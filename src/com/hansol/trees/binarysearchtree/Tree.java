package com.hansol.trees.binarysearchtree;

/*
Binary Search Tree implementation.
No duplicate values allowed in this implementation.
 */

public class Tree {

    private TreeNode rootNode;

    public void insert(int value) {
        if (this.rootNode == null) {
            this.rootNode = new TreeNode(value);
        }
        else {
            rootNode.insert(value);
        }
    }

    public TreeNode get(int value) {
        if (rootNode != null) {
            return rootNode.get(value);
        }
        return null;
    }

    public int min() {
        if (rootNode != null) {
            return rootNode.min();
        }
        else {
            return Integer.MIN_VALUE;
        }
    }

    public int max() {
        if (rootNode != null) {
            return rootNode.max();
        }
        return Integer.MAX_VALUE;
    }

    public void traverseInOrder() {
        if (rootNode != null) {
            rootNode.traverseInOrder();
        }
    }

}
