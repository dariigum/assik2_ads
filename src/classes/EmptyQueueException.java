
package classes;

public class EmptyQueueException extends RuntimeException {
    /**
     * The EmptyQueueException class represents a custom exception to handle situations where operations
     * on a queue cannot be performed due to it being empty.
     */
    public EmptyQueueException(String message) {//create exceptions
        super(message);
    }
}
