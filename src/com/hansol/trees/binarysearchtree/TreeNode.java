package com.hansol.trees.binarysearchtree;

// Represents a node in a binary tree.

public class TreeNode {

    private int data;
    private TreeNode leftChild;
    private TreeNode rightChild;

    public TreeNode(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void insert(int value) {
        if (value == this.data) {
            return;
        }

        if (value < this.data) {
            if (this.leftChild == null) {
                this.leftChild = new TreeNode(value);
            }
            else {
                this.leftChild.insert(value);
            }
        }
        else {
            if (this.rightChild == null) {
                this.rightChild = new TreeNode(value);
            }
            else {
                this.rightChild.insert(value);
            }
        }
    }

    public TreeNode get(int value) {
        // Base case.
        if (value == data) {
            return this;
        }
        // Recurse in left branch
        if (value < data) {
            if (leftChild != null) {
                return leftChild.get(value);
            }
        }
        // Recurse in right branch
        else {
            if (rightChild != null) {
                return rightChild.get(value);
            }
        }
        return null;
    }



    public int min() {
        // Base case. Leaf node encountered
        if (leftChild == null) {
            return data;
        }
        return leftChild.min();
    }

    public int max() {
        // Base case. Leaf node encountered.
        if (rightChild == null) {
            return data;
        }
        return rightChild.max();
    }


    // Recursive traversal
    public void traverseInOrder() {
        if (leftChild != null) {
            leftChild.traverseInOrder();
        }
        System.out.print("Data = " + data + ", ");
        if(rightChild != null) {
            rightChild.traverseInOrder();
        }
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "data=" + data +
                '}';
    }
}
