public class MyMinHeap<T extends Comparable<T>> {
    private MyArrayList<T> heap;

    public MyMinHeap() {
        heap = new MyArrayList<>();
    }

    public void insert(T item) {
        heap.addElement(item);
        bubbleUp(heap.getSize() - 1);
    }

    private void bubbleUp(int index) {
        while (index > 0 && heap.getElement(parent(index)).compareTo(heap.getElement(index)) > 0) {
            heap.swap(index, parent(index));
            index = parent(index);
        }
    }

    public T deleteMin() {
        if (isEmpty()) {
            throw new EmptyQueueException("Queue is empty");
        }

        T min = heap.getElement(0);
        heap.swap(0, heap.getSize() - 1);
        heap.remove(heap.getSize() - 1);
        bubbleDown(0);

        return min;
    }

    private void bubbleDown(int index) {
        int smallest = index;
        int left = leftChild(index);
        int right = rightChild(index);

        if (left < heap.getSize() && heap.getElement(left).compareTo(heap.getElement(smallest)) < 0) {
            smallest = left;
        }
        if (right < heap.getSize() && heap.getElement(right).compareTo(heap.getElement(smallest)) < 0) {
            smallest = right;
        }

        if (smallest != index) {
            heap.swap(index, smallest);
            bubbleDown(smallest);
        }
    }

    public T getMin() {
        if (isEmpty()) {
            throw new EmptyQueueException("Queue is empty");
        }
        return heap.getElement(0);
    }

    public boolean isEmpty() {
        return heap.getSize() == 0;
    }

    private int parent(int index) {
        return (index - 1) / 2;
    }

    private int leftChild(int index) {
        return 2 * index + 1;
    }

    private int rightChild(int index) {
        return 2 * index + 2;
    }
}
