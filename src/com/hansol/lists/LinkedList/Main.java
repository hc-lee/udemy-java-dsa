package com.hansol.lists.LinkedList;

import com.hansol.lists.ArrayList.Employee;

import java.util.LinkedList;

/*

A singly linked list has a head and tail. The head is the first node and points to the next node in the list. The tail
is the last node in the list and points to a Null. Nodes only contain references to the next node.

Nodes in a doubly linked list have pointers for both previous and next nodes. That also means that the head now points
to a Null previous.

Single:

head          tail
[1] -> [2] -> [3] -> Null


Double:

         head           tail
Null <- [1] <-> [2] <-> [3] -> Null


Java has provided a class for a generic doubly linked list (LinkedList<E>) that implements List<E> so all the methods
available to List are usable in LinkedList. LinkedList also has its own implementation for nodes. Not synchronized.
 */

public class Main {

    public static void main(String[] args) {
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill", "End", 78);


        LinkedList<Employee> list = new LinkedList<>();
        // .addFirst(e) adds an item at the HEAD in a LinkedList
        list.addFirst(janeJones);
        list.addFirst(johnDoe);
        list.addFirst(marySmith);
        list.addFirst(mikeWilson);

        // .add(e) adds the item at the TAIL in a LinkedList. Can also do .addLast(e)
        list.add(billEnd);

//        Iterator<Employee> iter = list.iterator();
        System.out.print("HEAD -> ");

        // Can use .hasNext() i.e. next != null
//        while (iter.hasNext()) {
//            System.out.println(iter.next());
//        }

        for (Employee employee: list) {
            System.out.print(employee);
            System.out.print("<->");
        }
        System.out.print("null");

        // Methods to remove items from the LinkedList
        list.removeFirst();
        list.removeLast();
        // Can do .remove(e) or .remove(index)
        // Note that .remove(e) requires a search for the object in list.

        // If you need a singly linked list you need to implement it.
        // Circular linked list is like a singly linked list where the tail.next is the head instead of null.
    }
}
