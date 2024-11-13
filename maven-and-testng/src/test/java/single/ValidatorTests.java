package single;

import exceptions.IncorrectSignValue;
import io.qameta.allure.*;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static utils.Validator.validateInputNumber;
import static utils.Validator.validateInputSign;


/**
 * Класс для проверки класса Validator.
 */
@Epic("Проверка калькулятора")
@Feature("Проверка валидации чисел и арифметических знаков с помощью одиночных тестов")
@Owner("Тупиков Алексей")
public class ValidatorTests {

    /**
     * Проверка валидации положительного integer числа
     */
    @Story("Позитивные проверки на ввод чисел")
    @Severity(SeverityLevel.BLOCKER)
    @Test(description = "Проверка валидации положительного integer числа")
    public void testValidateInputNumberPositiveInteger() {
        int num = 1;
        int result = validateInputNumber(num);
        assertEquals(result, num);
    }

    /**
     * Проверка валидации отрицательного integer числа
     */
    @Story("Позитивные проверки на ввод чисел")
    @Severity(SeverityLevel.BLOCKER)
    @Test(description = "Проверка валидации отрицательного integer числа", enabled = false)
    public void testValidateInputNumberNegativeInteger() {
        int num = -1;
        int result = validateInputNumber(num);
        assertEquals(result, num);
    }

    /**
     * Проверка валидации нуля
     */
    @Story("Позитивные проверки на ввод чисел")
    @Severity(SeverityLevel.BLOCKER)
    @Test(description = "Проверка на валидацию нуля")
    public void testValidateInputNumberZero() {
        int num = 0;
        int result = validateInputNumber(num);
        assertEquals(result, num);
    }

    /**
     * Проверка валидации арифметического знака сложения
     */
    @Story("Позитивные проверки на ввод арифметических знаков")
    @Severity(SeverityLevel.BLOCKER)
    @Test(description = "Проверка валидации арифметического знака сложения")
    @Description("Проверка на ввод знака +")
    public void testValidateInputSignPlus() {
        String sign = "+";
        String result = validateInputSign(sign);
        assertEquals(result, sign);
    }

    /**
     * Проверка валидации арифметического знака вычитания
     */
    @Story("Позитивные проверки на ввод арифметических знаков")
    @Severity(SeverityLevel.BLOCKER)
    @Test(description = "Проверка валидации арифметического знака вычитания")
    @Description("Проверка на ввод знака -")
    public void testValidateInputSignMinus() {
        String sign = "-";
        String result = validateInputSign(sign);
        assertEquals(result, sign);
    }

    /**
     * Проверка валидации арифметического знака деления
     */
    @Story("Позитивные проверки на ввод арифметических знаков")
    @Severity(SeverityLevel.BLOCKER)
    @Test(description = "Проверка валидации арифметического знака деления")
    @Description("Проверка на ввод знака /")
    public void testValidateInputSignDivision() {
        String sign = "/";
        String result = validateInputSign(sign);
        assertEquals(result, sign);
    }

    /**
     * Проверка валидации арифметического знака умножения
     */
    @Story("Позитивные проверки на ввод арифметических знаков")
    @Severity(SeverityLevel.BLOCKER)
    @Test(description = "Проверка валидации арифметического знака умножения")
    @Description("Проверка на ввод знака *")
    public void testValidateInputSignMultiplication() {
        String sign = "*";
        String result = validateInputSign(sign);
        assertEquals(result, sign);
    }


    /**
     * Негативная проверка валидации на арифметический знак вводом строки в виде числа
     */
    @Story("Негативные проверки на ввод арифметических знаков")
    @Severity(SeverityLevel.CRITICAL)
    @Test(description = "Проверка работы валидации при вводе числа вместо арифметического знака",
            expectedExceptions = IncorrectSignValue.class)
    @Description("Проверка на ввод числа в строке вместо знака")
    public void testValidateInputSignNumber() {
        String sign = "1";
        validateInputSign(sign);
    }

    /**
     * Проверка валидации на арифметический знак вводом строки в виде буквы
     */
    @Story("Негативные проверки на ввод арифметических знаков")
    @Severity(SeverityLevel.CRITICAL)
    @Test(description = "Проверка работы валидации при вводе буквы вместо арифметического знака",
            expectedExceptions = IncorrectSignValue.class)
    @Description("Проверка на ввод буквы вместо знака")
    public void testValidateInputSignLetter() {
        String sign = "z";
        validateInputSign(sign);
    }

    /**
     * Проверка валидации на арифметический знак вводом пустой строки.
     */
    @Story("Негативные проверки на ввод арифметических знаков")
    @Severity(SeverityLevel.CRITICAL)
    @Test(description = "Проверка работы валидации при вводе пустой строки вместо арифметического знака",
            expectedExceptions = IncorrectSignValue.class)
    @Description("Проверка на ввод пустой строки вместо знака")
    public void testValidateInputSignEmptyString() {
        String sign = "";
        validateInputSign(sign);
    }
}
