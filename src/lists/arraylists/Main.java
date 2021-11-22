package lists.arraylists;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import employee.Employee;

public class Main {

    public static void main(String[] args){
    //ArrayList:
        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee("Jane", "Jones", 123));
        employeeList.add(new Employee("John", "Doe", 4567));

        employeeList.forEach(System.out::println);

        System.out.println(employeeList.get(1));

        System.out.println(employeeList.isEmpty());

        employeeList.set(1, new Employee("John", "Adams", 4568));

        employeeList.add(3, new Employee("John", "Doe", 4567));

        System.out.println(employeeList.contains(new Employee("Mary", "Smith", 22)));
        System.out.println(employeeList.indexOf(new Employee("John", "Doe", 4567)));

        employeeList.remove(2);
        employeeList.forEach(System.out::println);

    // Vectors:
        List<Employee> vectorEmployeeList = new Vector<>();

        vectorEmployeeList.add(new Employee("Jane", "Jones", 123));
        vectorEmployeeList.add(new Employee("John", "Doe", 4567));


        vectorEmployeeList.forEach(System.out::println);

        /// for more information about the different between them open this link.
        /// https://www.geeksforgeeks.org/vector-vs-arraylist-java/
    }
}
