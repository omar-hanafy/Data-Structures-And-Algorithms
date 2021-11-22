package lists.linkedlists.doubly;
import employee.Employee;

public class Main {

    public static void main(String[] args) {

        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);

        EmployeeLinkedList list = new EmployeeLinkedList();


        list.addToBack(marySmith);


        System.out.println(list.getSize());
//
//        list.printListFromFront();
//        list.printListFromBack();
//
//        list.removeFromFront();
//        list.removeFromBack();
//
//        list.printListFromFront();

        list.printListFromBack();

        list.removeFromBack();
        System.out.println(list.getSize());
        list.printListFromBack();


        list.addToBack(janeJones);
        System.out.println(list.getSize());
        list.printListFromBack();
//        System.out.println(list.getSize());

    }
}
