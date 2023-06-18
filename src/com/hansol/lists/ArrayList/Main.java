package com.hansol.lists.ArrayList;

/*

ArrayList is a resizable implementation of the List interface.
When instantiating a new ArrayList object, you should almost always use List as the type for compatibility with
other List implementations without having to rewrite methods that operate on it. Makes it easier to refactor.

 */


import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee("Jane", "Jones", 123));
        employeeList.add(new Employee("John", "Doe", 4567));
        employeeList.add(new Employee("Mary", "Smith", 22));
        employeeList.add(new Employee("Mike", "Wilson", 3245));

        employeeList.forEach(employee -> System.out.println(employee));

        // .get(index) method returns object at index. Used to get items.
        System.out.println(employeeList.get(1));

        // .isEmpty returns boolean
        System.out.println(employeeList.isEmpty());

        // .set(index, object) replaces element at index with specified object. Used to replace items.
        employeeList.set(1, new Employee("John", "Deere", 666));

        // .size() returns the number of elements in list
        System.out.println(employeeList.size());

        // .add(index, item) is the overloaded call to .add. Used to add item within list without replacing.
        // O(n) worst case if adding at index 0. Need to shift all n elements.
        employeeList.add(3, new Employee("John", "Doe", 4567));

        // Get the backing array. Create array of object/object references.
        Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);
        for (Employee employee: employeeArray) {
            System.out.println(employee);
        }

        // You need to implement .equals() inside the Employee class to get the expected behavior with .contains()
        System.out.println(employeeList.contains(new Employee("Mary", "Smith", 22)));

        // .indexOf(obj) returns the index of an object if it exists. Uses .equals().
        System.out.println(employeeList.indexOf(new Employee("John", "Doe", 4567)));

        // .remove() removes from list
        employeeList.remove(2);
        employeeList.forEach(employee -> System.out.println(employee));

    }

}
