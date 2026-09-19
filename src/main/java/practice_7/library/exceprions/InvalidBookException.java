package practice_7.library.exceprions;

// непроверяемое исключение -> Error, RuntimeException
public class InvalidBookException extends RuntimeException {
    public InvalidBookException(String message) {
        super(message);
    }
}
