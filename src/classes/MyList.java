package classes;

import java.util.Iterator;


public interface MyList<T> {
    void addElement(T data);

    void setElement(int index, T element);

    void add(T element);
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
