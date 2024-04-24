package classes;

public class MyLinkedList<T> implements List<T>{//generic type T, can hold any type of elements
    private Node<T> head;//reference to the first node
    private int size;//keeps size

    public MyLinkedList(){//constructor
        head = null;
        size = 0;
        //ready to add elements as needed.
    }

    @Override
    public void addElement(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;//set head to new node
        }
        else {
            Node<T> currentNode = head;
            while (currentNode.next != null){
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;//create new node
        }
        size++;
    }

    public T getElement(int index) {//return element in a specific index
        checkIndex(index);//check if index valid
        Node<T> currentNode = head;
        if (index == 0)
            return currentNode.data;
        else {
            for (int i = 0; i < index; i++) {
                currentNode = currentNode.next;
            }
        }
        return currentNode.data;
    }

    public int getSize() {
        return size;
    }

    public void remove(int index) {//remove at the given index
        checkIndex(index);
        if(index == 0)
            head = head.next;
        else {
            Node<T> currentNode = head;
            for (int i = 0; i < index - 1; i++) {
                currentNode = currentNode.next;
            }
            currentNode.next = currentNode.next.next;
        }
        size--;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("index not correct");
    }

    public void clear() {
        head = null;
        size = 0;
    }


    public Node<T> getHead() {
        return null;
    }
}