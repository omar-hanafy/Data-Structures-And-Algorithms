package queues;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class ArrayQueue {

    private Employee[] queue;
    private int front;
    private int back;
    Employee[] tempArray;

    public ArrayQueue(int capacity) {
        queue = new Employee[capacity];
    }

    public ArrayQueue() {
        queue = new Employee[2];
    }

    public void enQueue(Employee employee) {
        if (back == queue.length) {
            System.out.println("resizing");
            tempArray = new Employee[2 * queue.length];
            System.arraycopy(queue, 0, tempArray, 0, queue.length);
            queue = tempArray;
        }

        queue[back] = employee;
        back++;
    }

    public Employee deQueue() {
        if (size() == 0) {
            throw new NoSuchElementException();
        }
        Employee employee = queue[front];
        queue[front] = null;
        front++;
        if (size() == 0) {
            front = 0;
            back = 0;
        }

        if (queue.length > size() * 2 && front > size()) {
            System.out.println("fixing");
            tempArray = new Employee[queue.length];
            System.arraycopy(queue, front, tempArray, 0, size());
            back = size();
            front = 0;
            queue = tempArray;
        }

        return employee;
    }

    public Employee peek() {
        if (size() == 0) {
            throw new NoSuchElementException();
        }

        return queue[front];
    }

    public int size() {
        return back - front;
    }

    public int getActualQueueLength() {
        return queue.length;
    }

    public void printQueue() {
        for (int i = front; i < back; i++) {
            System.out.println(queue[i]);
        }
    }

}
