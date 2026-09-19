package practice_7.library.exceprions;

// проверяемое -> Exception (или наследников)
public class BookNotFoundException extends Exception {
    public BookNotFoundException(String message) {
        super(message);
    }
}
