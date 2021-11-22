package stacks.linkedstack;
import employee.Employee;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedStack {

    private final LinkedList<Employee> stack;

    public LinkedStack() {
        stack = new LinkedList<Employee>();
    }

    public void push(Employee employee) {
        stack.push(employee);
    }

    public Employee pop() {
        return stack.pop();
    }

    public Employee peek() {
        return stack.peek();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void printStack() {
        ListIterator<Employee> iterator = stack.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        /// for loop recommended by jdk.

//        for (Employee employee : stack) {
//            System.out.println(employee);
//        }

    }
}
