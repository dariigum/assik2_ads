public class MyQueue<T> {
    private MyLinkedList<T> queue;

    public MyQueue() {
        queue = new MyLinkedList<>();
    }

    public void enqueue(T item) {
        queue.addElement(item);
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new EmptyQueueException("Queue is empty");
        }
        T item = queue.getElement(0); // Get the element at the front of the queue
        queue.remove(0); // Remove the element from the front of the queue
        return item; // Return the removed element
    }

    public boolean isEmpty() {
        return queue.getSize() == 0;
    }
}

