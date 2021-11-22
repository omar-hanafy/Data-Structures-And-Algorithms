package queues;
import employee.Employee;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill", "End", 78);

        ArrayQueue arrayQ = new ArrayQueue(4);
        arrayQ.enQueue(janeJones);
        arrayQ.enQueue(janeJones);
        arrayQ.enQueue(janeJones);
        arrayQ.deQueue();
        arrayQ.enQueue(johnDoe);
        arrayQ.deQueue();
        arrayQ.enQueue(johnDoe);
        arrayQ.deQueue();
        arrayQ.enQueue(johnDoe);
        arrayQ.deQueue();
        arrayQ.enQueue(janeJones);
        arrayQ.deQueue();
        arrayQ.enQueue(janeJones);
        arrayQ.deQueue();
        arrayQ.enQueue(janeJones);
        arrayQ.deQueue();
        arrayQ.enQueue(janeJones);
        arrayQ.deQueue();
        arrayQ.enQueue(janeJones);
        arrayQ.deQueue();
        arrayQ.enQueue(janeJones);
        arrayQ.deQueue();
        arrayQ.enQueue(janeJones);
        arrayQ.deQueue();
        arrayQ.enQueue(janeJones);
        arrayQ.deQueue();
        arrayQ.enQueue(janeJones);

//        System.out.println("peek: " + arrayQ.peek());
        System.out.println(arrayQ.getActualQueueLength());
        arrayQ.printQueue();
    }

}