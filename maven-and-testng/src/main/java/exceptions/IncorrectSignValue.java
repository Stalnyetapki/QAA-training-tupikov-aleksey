package exceptions;

/**
 * Исключение в случае введения неверного арифметического знака
 */
public class IncorrectSignValue extends RuntimeException{

    public IncorrectSignValue(String message){
        super(message);
    }
}
