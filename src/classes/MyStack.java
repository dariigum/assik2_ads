package classes;

public class MyStack<T extends Comparable<T>> {
    /**
     * The MyStack class represents a stack data structure implemented using a linked list.
     * It has methods: peek, pop, push.
     */
    private MyLinkedList<T> stack;

    public MyStack() {
        stack = new MyLinkedList<>();
    }

    public void push(T item) {
        stack.addElement(item);
    }

    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        T item = stack.getElement(0);
        stack.remove(0);
        return item;
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stack.getElement(0);
    }

    public boolean isEmpty() {
        return stack.getSize() == 0;
    }

    public MyIterator<T> iterator() {//iterating over the elements
        return new MyIterator<>(stack);
    }
}
