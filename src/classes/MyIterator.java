package classes;

public class MyIterator<T> {
    private Node<T> currentNode;//reference to the current node being iterated over

    public MyIterator(MyLinkedList<T> list) {
        currentNode = list.getHead();//iterator starts from the beginning
    }

    public boolean hasNext() {
        return currentNode != null;//checks if there is a next element available
    }

    public T next() {
        if (!hasNext()) {
            throw new IllegalStateException("No next element available");//checks if there is a next element available
        }
        T data = currentNode.getData();
        currentNode = (Node<T>) currentNode.getNext();
        return data;
    }
}



