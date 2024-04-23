public class MyStack<T> {
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

    public MyIterator<T> iterator() {
        return new MyIterator<>(stack);
    }
}
