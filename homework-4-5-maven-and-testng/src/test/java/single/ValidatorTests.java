package single;

import exceptions.IncorrectSignValue;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static utils.Validator.validateInputNumber;
import static utils.Validator.validateInputSign;


/**
 * Класс для проверки класса Validator.
 */
public class ValidatorTests {

    /**
     * Проверка валидации положительного integer числа
     */
    @Test
    public void testValidateInputNumberPositiveInteger() {
        int num = 1;
        int result = validateInputNumber(num);
        assertEquals(result, num);
    }

    /**
     * Проверка валидации отрицательного integer числа
     */
    @Test
    public void testValidateInputNumberNegativeInteger() {
        int num = -1;
        int result = validateInputNumber(num);
        assertEquals(result, num);
    }

    /**
     * Проверка валидации нуля
     */
    @Test
    public void testValidateInputNumberZero() {
        int num = 0;
        int result = validateInputNumber(num);
        assertEquals(result, num);
    }

    /**
     * Проверка валидации арифметического знака сложения
     */
    @Test
    public void testValidateInputSignPlus() {
        String sign = "+";
        String result = validateInputSign(sign);
        assertEquals(result, sign);
    }

    /**
     * Проверка валидации арифметического знака вычитания
     */
    @Test
    public void testValidateInputSignMinus() {
        String sign = "-";
        String result = validateInputSign(sign);
        assertEquals(result, sign);
    }

    /**
     * Проверка валидации арифметического знака деления
     */
    @Test
    public void testValidateInputSignDivision() {
        String sign = "/";
        String result = validateInputSign(sign);
        assertEquals(result, sign);
    }

    /**
     * Проверка валидации арифметического знака умножения
     */
    @Test
    public void testValidateInputSignMultiplication() {
        String sign = "*";
        String result = validateInputSign(sign);
        assertEquals(result, sign);
    }


    /**
     * Проверка валидации на арифметический знак вводом строки в виде числа
     */
    @Test(expectedExceptions = IncorrectSignValue.class)
    public void testValidateInputSignNumber() {
        String sign = "1";
        validateInputSign(sign);
    }

    /**
     * Проверка валидации на арифметический знак вводом строки в виде буквы
     */
    @Test(expectedExceptions = IncorrectSignValue.class)
    public void testValidateInputSignLetter() {
        String sign = "z";
        validateInputSign(sign);
    }

    /**
     * Проверка валидации на арифметический знак вводом пустой строки.
     */
    @Test(expectedExceptions = IncorrectSignValue.class)
    public void testValidateInputSignEmptyString() {
        String sign = "";
        validateInputSign(sign);
    }
}
