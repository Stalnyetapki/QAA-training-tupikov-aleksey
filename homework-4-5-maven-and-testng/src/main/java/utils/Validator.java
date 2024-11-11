package utils;

import exceptions.BadIntegerValue;
import exceptions.IncorrectSignValue;

/**
 * Класс, проверяющий валидацию оператора и операнда для использования в калькуляторе
 */
public class Validator {

    /**
     * Проверяет вводимое число, что оно является integer
     * @param input проверяемое число
     * @return число, если оно является целым и существует
     * @throws BadIntegerValue если введенное значение не является целым числом
     */
    public static int validateInputNumber(Integer input) throws BadIntegerValue {
        if (input != null && input.toString().matches("-?\\d+")) {
            return input;
        } else {
            throw new BadIntegerValue("Введенное значение " + input + " не является целым числом");
        }
    }
    /**
     * Проверяет вводимое значение на то, что оно является арифметическим символом
     * @param input проверяемое значение
     * @return арифметический символ, если он проходит проверку
     * @throws IncorrectSignValue если введенное значение не является целым символом для вычислений
     */
    public static String validateInputSign(String input) throws IncorrectSignValue {
        if (input != null && input.matches("^[+-/*]$")) {
            return input;
        } else {
            throw new IncorrectSignValue("Введенное значение " + input + " не являются арифметическим символом из группы: +-*/");
        }
    }
}
