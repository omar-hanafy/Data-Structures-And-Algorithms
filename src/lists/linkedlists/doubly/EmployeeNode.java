package lists.linkedlists.doubly;

public class EmployeeNode {

    private Employee employee;
    private EmployeeNode referenceToNextNode;
    private EmployeeNode referenceToPrevNode;

    public EmployeeNode getReferenceToNextNode() {
        return referenceToNextNode;
    }

    public void setReferenceToNextNode(EmployeeNode referenceToNextNode) {
        this.referenceToNextNode = referenceToNextNode;
    }

    public EmployeeNode getReferenceToPrevNode() {
        return referenceToPrevNode;
    }

    public void setReferenceToPrevNode(EmployeeNode referenceToPrevNode) {
        this.referenceToPrevNode = referenceToPrevNode;
    }


    public EmployeeNode(Employee employee) {
        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }


    public String toString() {
        return employee.toString();
    }
}
