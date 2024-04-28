package classes;

import java.util.Iterator;


public interface MyList<T> {
    /**
     * The MyList interface serves as a blueprint for classes responsible for managing collections of elements.
     */
    void addElement(T data);

    void setElement(int index, T element);

    void addElement(int index, T element);
    void addElementAt(int index, T element);
    T getElement(int index);
    void add(int i, T element);
    void add(T element, int index);
    void addFirst(T element);
    void addLast(T element);
    void set(T element, int index);
    T get(int index);
    T getFirst();
    T getLast();
    void remove(int index);
    void removeFirst();
    void removeLast();
    void sort();
    int indexOf(T element);
    int lastIndexOf(T element);
    boolean exists(T element);
    T[] toArray();
    void clear();
    int size();

    Iterator<T> iterator();
}
