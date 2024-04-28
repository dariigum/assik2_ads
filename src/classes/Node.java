package classes;

public class Node<T> {
    /**
     * The Node class represents a single node in a linked list.
     * Each node contains a data element and a reference to the next node in the list.
     */
    public T element;
    T data;
    Node next;

    public Node(T data) {
        this.data = data;
        next = null;
    }

    public <T> Node(T element, Node<T> head) {

    }

    public T getData() {
        return data;
    }
    public T getNext() {
        return data;
    }
}
