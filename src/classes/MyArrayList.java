package classes;

import java.util.Iterator;



public class MyArrayList<T> implements MyList<T> {
    private int capacity = 10;
    private T[] arr;
    private int size;
    public MyArrayList() {
        arr = (T[]) new Object[capacity];
        size = 0;
    }


    @Override
    public void addElement(T data) {
        if (size >= arr.length) {
            increaseBuffer();
        }
        arr[size++] = data;
    }

    @Override
    public void setElement(int index, T element) {
        checkIndex(index);
        arr[index] = element;
    }

    @Override
    public void addElement(int index, T element) {
        if (size >= arr.length) {
            increaseBuffer();
        }
        for (int i = size; i > index; i--) {
            arr[i] = arr[i-1];
        }
        checkIndex(index);
        arr[index] = element;
    }

    @Override
    public void add(T element) {

    }

    @Override
    public void add(T element, int index) {

    }

    @Override
    public void addFirst(T element) {
        addElement(0,element);
    }

    @Override
    public void addLast(T element) {
        addElement(element);
    }

    @Override
    public void set(T element, int index) {

    }

    @Override
    public T get(int index) {
        return null;
    }

    private void increaseBuffer() {
        capacity = capacity * 2;
        T[] newArr = (T[]) new Object[capacity];
        for(int i = 0; i < size; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
    }

    private void decreaseBuffer() {
        T[] newArr = (T[]) new Object[(capacity) (size / 2)];
        for (int i = 0; i < size; i++)
            newArr[i] = arr[i];
        arr = newArr;
    }

    @Override
    public T getElement(int index) {
        checkIndex(index);
        return arr[index];
    }

    @Override
    public T getFirst() {
        if (size == 0)
            System.out.println("List is empty");
        return arr[0];
    }

    @Override
    public T getLast() {
        if (size == 0)
            System.out.println("List is empty");
        return arr[size-1];
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("Invalid index");
    }

    public int getSize() {
        return size;
    }

    public void printArr() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    @Override
    public void remove(int index) {
        checkIndex(index);
        for (int i = index+1; i < size; i++) {
            arr[i-1] = arr[i];
        }
        size--;
    }

    @Override
    public void removeFirst() {
        if (size == 0)
            System.out.println("List is empty");
        remove(0);
    }

    @Override
    public void removeLast() {
        if (size == 0)
            System.out.println("List is empty");
        remove(size-1);
    }

    @Override
    public void sort() {
    }


    @Override
    public T[] toArray() {
        T[] array = (T[]) new Object[size];
        for (int i = 0; i < size; i++) {
            array[i] = arr[i];
        }
        return array;
    }

    @Override
    public boolean exists(Object object) {
        return indexOf(object) >= 0;
    }

    @Override
    public int indexOf(Object object) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == object) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(T element) {
        for (int i = size - 1; i >= 0; i--) {
            if (arr[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }


    public void clear() {
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < size; i++)
            builder.append(arr[i]).append(" ");
        return builder.toString();
    }

    public void swap(int index, int parent) {

    }
}
