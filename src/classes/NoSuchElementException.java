package classes;

public class NoSuchElementException extends RuntimeException {//java util is not allowed, so create class
    public NoSuchElementException(String message) {//create exceptions
        super(message);
    }
}
