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

    public void delete(int value) {
        rootNode = delete(rootNode, value);
    }

    private TreeNode delete(TreeNode subtreeRoot, int value) {
        if (subtreeRoot == null) {
            return null;
        }

        if (value < subtreeRoot.getData()) {
            subtreeRoot.setLeftChild(delete(subtreeRoot.getLeftChild(), value));
        }
        else if (value > subtreeRoot.getData()) {
            subtreeRoot.setRightChild(delete(subtreeRoot.getRightChild(), value));
        }
        else {
            // Node has 0 or 1 child.
            if (subtreeRoot.getLeftChild() == null) {
                return subtreeRoot.getRightChild();
            }
            else if (subtreeRoot.getRightChild() == null) {
                return subtreeRoot.getLeftChild();
            }
            // Case 3: Has two children
            // Replace value in subtreeRoot node with the smallest value from right subtree
            subtreeRoot.setData(subtreeRoot.getRightChild().min());

            // Delete the node with the smallest value in right subtree
            subtreeRoot.setRightChild(delete(subtreeRoot.getRightChild(), subtreeRoot.getData()));
        }

        // This works because subsequent calls on the call stack will just return subtreeRoot all the way up to the
        // root of the tree.
        return subtreeRoot;

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

    // BST challenge #1
    public void traversePreOrder() {
        if (rootNode != null) {
            rootNode.traversePreOrder();
        }
    }

}
