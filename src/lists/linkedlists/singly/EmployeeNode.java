package lists.linkedlists.singly;

public class EmployeeNode {

    private Employee employee;
    private EmployeeNode referenceToNextNode;

    public EmployeeNode(Employee employee) {
        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public EmployeeNode getNext() {
        return referenceToNextNode;
    }

    public void setNext(EmployeeNode next) {
        this.referenceToNextNode = next;
    }

    public String toString() {
        return employee.toString();
    }
}
