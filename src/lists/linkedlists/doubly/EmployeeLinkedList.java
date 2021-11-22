package lists.linkedlists.doubly;
import employee.Employee;

public class EmployeeLinkedList {

    private EmployeeNode head;
    private EmployeeNode tail;
    private int size;

    public void addToFront(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);

        if (head == null) {
            tail = node;
        } else {
            head.setReferenceToPrevNode(node);
            node.setReferenceToNextNode(head);
        }
        head = node;
        size++;
    }

    public void addToBack(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);

        if (tail == null) {
            head = node;
        } else {
            tail.setReferenceToNextNode(node);
            node.setReferenceToPrevNode(tail);
        }

        tail = node;
        size++;
    }

    public void removeFromFront() {
        if (isEmpty()) {
            return;
        }
        EmployeeNode removedNode = head;
        if (head.getReferenceToNextNode() == null) {
            tail = null;
        } else {
            head.setReferenceToPrevNode(null);
        }
        head = head.getReferenceToNextNode();
        size--;
    }

    public void removeFromBack() {
        if (isEmpty()) {
            return;
        }
        EmployeeNode removedNode = tail;
        if (tail.getReferenceToPrevNode() == null) {
            head = null;
        } else {
            tail.setReferenceToNextNode(null);
        }

        tail = tail.getReferenceToPrevNode();
        removedNode.setReferenceToPrevNode(null);
        size--;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null && tail == null;
    }

    public void printListFromFront() {
        EmployeeNode current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current);
            System.out.print(" -> ");
            current = current.getReferenceToNextNode();
        }
        System.out.println("null");
    }

    public void printListFromBack() {
        if (!isEmpty()) {
            EmployeeNode current = tail;
            System.out.print("TAIL -> ");
            do {
                System.out.print(current);
                System.out.print(" -> ");
                current = current.getReferenceToPrevNode();
            }
            while (current != null);
            System.out.println("null");
        } else System.out.println("List is empty");
    }

}
