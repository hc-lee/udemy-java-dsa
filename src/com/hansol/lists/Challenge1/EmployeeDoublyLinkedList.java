package com.hansol.lists.challenge1;

public class EmployeeDoublyLinkedList {

    private com.hansol.lists.challenge1.EmployeeNode head;
    private com.hansol.lists.challenge1.EmployeeNode tail;
    private int size;

    public void addToFront(Employee employee) {
        com.hansol.lists.challenge1.EmployeeNode node = new com.hansol.lists.challenge1.EmployeeNode(employee);

        if (head == null) {
            tail = node;
        }
        else {
            head.setPrevious(node);
            node.setNext(head);
        }

        head = node;
        size++;
    }

    public void addToEnd(Employee employee) {
        com.hansol.lists.challenge1.EmployeeNode node = new com.hansol.lists.challenge1.EmployeeNode(employee);
        if (tail == null) {
            head = node;
        }
        else {
            tail.setNext(node);
            node.setPrevious(tail);
        }

        tail = node;
        size++;
    }

    public boolean addBefore(Employee newEmployee, Employee existingEmployee) {

        // return true if you were able to successfully add the employee
        // into the list before the existing employee. Return false
        // if the existing employee doesn't exist in the list

        // add your code here

        return false;
    }

    public com.hansol.lists.challenge1.EmployeeNode removeFromFront() {
        if (isEmpty()) {
            return null;
        }

        com.hansol.lists.challenge1.EmployeeNode removedNode = head;

        if (head.getNext() == null) {
            tail = null;
        }
        else {
            head.getNext().setPrevious(null);
        }

        head = head.getNext();
        size--;
        removedNode.setNext(null);
        return removedNode;
    }

    public com.hansol.lists.challenge1.EmployeeNode removeFromEnd() {
        if (isEmpty()) {
            return null;
        }

        com.hansol.lists.challenge1.EmployeeNode removedNode = tail;

        if (tail.getPrevious() == null) {
            head = null;
        }
        else {
            tail.getPrevious().setNext(null);
        }

        tail = tail.getPrevious();
        size--;
        removedNode.setPrevious(null);
        return removedNode;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void printList() {
        com.hansol.lists.challenge1.EmployeeNode current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current);
            System.out.print(" <=> ");
            current = current.getNext();
        }
        System.out.println("null");
    }

}
