package classes;
import classes.MyList;

public interface DataType<T> {
    /**
     * Interface DataType<T> defines the contract for classes that represent various data types.
     * Implementing classes should provide functionality for manipulating and managing data
     * of type T, pushing, pop
     * retrieve, and the size of the data structure.
     *
     * @param <T> the type of elements stored in the data structure
     */
    void push(T e);
    T pop();
    T get();
    int size();
}

