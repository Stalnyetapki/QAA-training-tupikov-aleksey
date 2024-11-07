package exceptions;

/**
 * Исключение в случае деления на ноль
 */
public class DivisionByZeroException extends RuntimeException{

    public DivisionByZeroException(String message){
        super(message);
    }
}
