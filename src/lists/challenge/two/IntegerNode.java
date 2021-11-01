package lists.challenge.two;

public class IntegerNode {

    private Integer value;
    private IntegerNode next;

    public IntegerNode getTail() {
        return tail;
    }

    public void setTail(IntegerNode tail) {
        this.tail = tail;
    }

    private IntegerNode tail;

    public IntegerNode(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public IntegerNode getNext() {
        return next;
    }

    public void setNext(IntegerNode next) {
        this.next = next;
    }

    public String toString() {
        return value.toString();
    }

}
