
package classes;

import java.util.Iterator;

public class MyLinkedList<T extends Comparable<T>> implements MyList<T> {
    /**
     * This class implements a linked list data structure.
     * @param <T> provides a basic implementation of a singly linked list,
     * supporting various operations commonly associated with lists.
     * It provides methods to add, get, set, remove elements, getting index, sort.
     */
    private Node<T> head;
    private int size;

    public MyLinkedList() {
        head = null;
        size = 0;
    }

    @Override
    public void addElement(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
        size++;
    }

    @Override
    public void addElementAt(int index, T element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        if (index == 0) {
            head = new Node<>(element, head);
        } else {
            Node<T> prev = getNodeAt(index - 1);
            prev.next = new Node<>(element, prev.next);
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
    public T getElement(int index) {
        checkIndex(index);
        Node<T> currentNode = head;
        if (index == 0)
            return currentNode.element;
        else {
            for (int i = 0; i < index; i++) {
                currentNode = currentNode.next;
            }
        }
        return currentNode.element;
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
        return getNodeAt(index + 1).element;
    }

    @Override
    public T getFirst() {
        return head.element;
    }

    @Override
    public T getLast() {
        return (T) getLastNode();
    }

    private Object getLastNode() {

        return null;
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
                if (node.element != null && node.next.element != null) {
                    if (node.element instanceof Comparable && node.next.element instanceof Comparable) {
                        Comparable<T> current = (Comparable<T>) node.element;
                        Comparable<T> next = (Comparable<T>) node.next.element;
                        if (current.compareTo((T) node.next.element) > 0) {
                            T temp = node.element;
                            node.element = (T)node.next.element;
                            node.next.element = temp;
                            swapped = true;
                        }
                    } else {
                        throw new IllegalArgumentException("Elements are not comparable");
                    }
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

    public Node<T> getHead() {
        return head;
    }
    @Override
    public Iterator<T> iterator() {
        return new Itr();
    }


    private class Itr implements Iterator<T> {
        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public T next() {
            return null;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void addLast(T element) {
        addElement(element);
    }
    @Override
    public void addFirst(T element) {
        add(0, element);
    }


    @Override
    public void add(int index, T element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
        if (index == 0) {
            addFirst(element);
        } else {
            Node<T> prevNode = getNodeAt(index - 1);
            Node<T> newNode = new Node<>(element, prevNode.next);
            prevNode.next = newNode;
            size++;
        }
    }

    private Node<T> getNodeAt(int i) {
        Node<T> node = head;
        return node;
    }

    @Override
    public void addElement(int index, T element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }

        if (index == 0) {
            head = new Node<>(element, head);
        } else {
            Node<T> prev = getNodeAt(index - 1);
            prev.next = new Node<>(element, prev.next);
        }
        size++;
    }

    @Override
    public void setElement(int index, T element) {
        checkIndex(index);

        Node<T> node = getNodeAt(index);
        node.element = element;
    }


}