public class MyIterator<T> {
    private Node<T> currentNode;

    public MyIterator(MyLinkedList<T> list) {
        currentNode = list.getHead();
    }

    public boolean hasNext() {
        return currentNode != null;
    }

    public T next() {
        if (!hasNext()) {
            throw new IllegalStateException("No next element available");
        }
        T data = currentNode.getData();
        currentNode = (Node<T>) currentNode.getNext();
        return data;
    }
}



