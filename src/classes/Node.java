package classes;

public class Node<T> {//represent node in linked list
    T data;//stores data in node
    Node next;//reference to the next node

    public Node(T data) {
        this.data = data;
        next = null;
    }

    public T getData() {
        return data;//returns data stored in node
    }
    public T getNext() {
        return data;//reference to the next node
    }
}
