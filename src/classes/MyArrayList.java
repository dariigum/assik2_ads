package classes;
//without sort()


public class MyArrayList<T> implements List<T> {
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
        checkIndex(index);
        arr[index] = element;
    }

    @Override
    public void addFirst(T element) {
        addElement(0,element);
    }

    @Override
    public void addLast(T element) {
        addElement(element);
    }

    private void increaseBuffer() {
        capacity = capacity * 2;
        T[] newArr = (T[]) new Object[capacity];
        for(int i = 0; i < size; i++) {
            newArr[i] = arr[i];
        }
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
        boolean swapped;
        for (int i = 0; i < size - 1; i++) {
            swapped = false;
            for (int j = 0; j < size - i - 1; j++) {
                if (arr[j] != null && arr[j + 1] != null && )
            }
        }
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

    public void clear() {
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

}
