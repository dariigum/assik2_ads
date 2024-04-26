package classes;

import java.util.Iterator;

public class MyLinkedList<T>  implements MyList<T> {//generic type T, can hold any type of elements
    private Node<T> head;//reference to the first node
    private int size=0;//keeps size

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

    @Override
    public void add(T element, int index) {
        checkIndex(index);
        Node<T> node = getNodeAt(index);
        size++;
        if (index == 0) {
            head = new Node<>(element, head);
            return;
        }
        node.next = new Node<>(element, node.next);
    }

    @Override
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

    @Override
    public void set(T item, int index) {
        Node<T> node = head;
        while (index-- != 0 && node.next != null)
            node = node.next;
        node.element = item;
    }

    @Override
    public T get(int index) {
        return getNodeAt(index + 1).item;
    }

    @Override
    public T getFirst() {
        return head.element;
    }

    @Override
    public T getLast() {
        return getLastNode().item;
    }

    @Override
    public void remove(int index) {
        if (index == 0) {
            removeFirst();
            return;
        }
        Node<T> node = getNodeAt(index);
        node.next = node.next.next;
        size--;
    }

    @Override
    public void removeFirst() {
        head = head.next;
        size--;
    }

    @Override
    public void removeLast() {
        Node<T> node = getNodeAt(size - 1);
        node.next = null;
        size--;
    }

    @Override
    public void sort() {
        boolean swapped;
        Node<T> node;

        if (head == null)
            return;

        do {
            swapped = false;
            node = head;

            while (node.next != null) {
                if (node.element.compareTo(node.next.element) > 0) {
                    T t = node.next.element;
                    node.next.element = node.element;
                    node.element = t;
                    swapped = true;
                }
                node = node.next;
            }
        } while (swapped);
    }

    @Override
    public int indexOf(T item) {
        Node<T> node = head;
        for (int i = 0; i < size; i++) {
            if (node.element.equals(item))
                return i;
            node = node.next;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(T item) {
        Node<T> node = head;
        int t = -1;
        for (int i = 0; i < size; i++) {
            if (node.element.equals(item))
                t = i;
            node = node.next;
        }
        return t;
    }

    @Override
    public boolean exists(T item) {
        return indexOf(item) != -1;
    }

    @Override
    public T[] toArray() {
        T[] array = (T[]) new Object[size];
        Node<T> node = head;
        for (int i = 0; i < size; i++) {
            array[i] = node.element;
            node = node.next;
        }
        return array;
    }

    public int getSize() {
        return size;
    }



    private void checkIndex(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("index not correct");
    }

    public void clear() {
        head = null;
        size = 0;
    }


    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        Node<T> h = head;
        while (h != null) {
            str.append(h.item).append(" ");
            h = h.next;
        }
        return str.toString();
    }

    @Override
    public Iterator<T> iterator() {
        return new Itr();
    }


    private class Itr implements Iterator<T> {
        Node<T> front;

        public Itr() {
            front = head;
        }

        @Override
        public boolean hasNext() {
            return front != null;
        }

        @Override
        public T next() {
            Node<T> node = front;
            front = front.next;
            return node.element;
        }
    }

    private static class Node<T> {
        public T element;
        T data;
        Node<T> next;

        public Node(T item) {
            this.element = element;
            next = null;
        }

        public Node(T item, Node<T> next) {
            this.element = element;
            this.next = next;
        }
    }

    private Node<T> getNodeAt(int index) {
        checkIndex(index);
        Node<T> node = head;
        if (node == null)
            return null;
        while (--index != 0 && node.next != null)
            node = node.next;
        return node;
    }

    private Node<T> getLastNode() {
        Node<T> node = head;
        while (node.next != null)
            node = node.next;
        return node;
    }
}