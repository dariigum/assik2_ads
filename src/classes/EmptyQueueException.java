
package classes;

public class EmptyQueueException extends RuntimeException {//java util is not allowed, so create class
    public EmptyQueueException(String message) {//create exceptions
        super(message);
    }
}
