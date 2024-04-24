package classes;

public class MyStack<T> {
    private MyLinkedList<T> stack;//data structure for the stack

    public MyStack() {
        stack = new MyLinkedList<>();
    }

    public void push(T item) {//add item to the top
        stack.addElement(item);
    }

    public T pop() {//remove and return at the top
        if (isEmpty()) {//first checks if it's empty
            throw new IllegalStateException("Stack is empty");
        }
        T item = stack.getElement(0); //retrieves the item
        stack.remove(0);//removes it from the stack
        return item;//returns the removed item.
    }

    public T peek() {//returns the item at the top of the stack without removing it.
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stack.getElement(0);//retrieves item at the top of the stack and returns it.
    }

    public boolean isEmpty() {
        return stack.getSize() == 0;
    }

    public MyIterator<T> iterator() {//iterating over the elements
        return new MyIterator<>(stack);
    }
}
