package classes;
import classes.MyList;

public interface DataType<T> {
    void push(T e);
    T pop();
    T get();
    int size();
}

