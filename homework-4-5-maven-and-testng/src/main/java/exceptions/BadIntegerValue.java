package exceptions;

/**
 * Исключение в случае некорректного слагаемого
 */
public class BadIntegerValue extends RuntimeException {

    public BadIntegerValue(String message) {
        super(message);
    }
}
