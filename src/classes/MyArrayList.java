package classes;

public class MyArrayList<T> implements List<T>{
    private T[] arr;
    private int size;

    public MyArrayList() {
        arr = (T[]) new Object[5];
        size = 0;
    }

    @Override
    public void addElement(T data) {
        if (size >= arr.length) {
            increaseBuffer();//increase size before adding
        }
        arr[size++] = data;
    }

    public void addElement(T element, int index) {//add element at a specific index
        if (size >= arr.length) {
            increaseBuffer();
        }
        checkIndex(index);
        arr[index] = element;
    }

    private void increaseBuffer() {
        T[] newArr = (T[]) new Object[arr.length * 2];//increase size
        for (int i = 0; i < size; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
    }

    public T getElement(int index) {
        checkIndex(index);
        return arr[index];
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("index not correct");//if index less that 0 or >=size
    }

    public int getSize() {
        return size;//current size
    }

    public void printArr() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void remove(int index) {
        checkIndex(index);
        for (int i = index + 1; i < size; i++) {
            arr[i-1] = arr[i];
        }
        size--;
    }

    public void clear() {
        arr = (T[]) new Object[5];//default size of array
        size = 0;
    }


    public void swap(int index, int parent) {
    }

    @Override

}
