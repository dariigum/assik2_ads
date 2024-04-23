public class MyLinkedList<T> implements List<T>{
    private Node<T> head;
    private int size;

    public MyLinkedList(){
        head = null;
        size = 0;
    }

    @Override
    public void addElement(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        }
        else {
            Node<T> currentNode = head;
            while (currentNode.next != null){
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
        size++;
    }

    public T getElement(int index) {
        checkIndex(index);
        Node<T> currentNode = head;
        if (index == 0)
            return currentNode.data;
        else {
            for (int i = 0; i < index; i++) {
                currentNode = currentNode.next;
            }
        }
        return currentNode.data;
    }

    public int getSize() {
        return size;
    }

    public void remove(int index) {
        checkIndex(index);
        if(index == 0)
            head = head.next;
        else {
            Node<T> currentNode = head;
            for (int i = 0; i < index - 1; i++) {
                currentNode = currentNode.next;
            }
            currentNode.next = currentNode.next.next;
        }
        size--;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("index not correct");
    }

    public void clear() {
        head = null;
        size = 0;
    }


}