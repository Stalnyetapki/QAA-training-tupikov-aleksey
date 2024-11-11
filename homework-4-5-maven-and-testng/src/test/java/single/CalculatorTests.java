package single;

import exceptions.DivisionByZeroException;
import exceptions.IncorrectSignValue;
import io.qameta.allure.*;
import models.Calculator;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Тесты для проверки класса Calculator
 */
@Epic("Проверка калькулятора")
@Feature("Проверка выполнения простых арифметических операций с помощью одиночных тестов")
@Owner("Тупиков Алексей")
public class CalculatorTests {

    /**
     * Переменная класса Calculator для вызова его методов.
     */
    private Calculator calculator;

    /**
     * Метод, который выполняется перед каждым тестом, создает объект класса.
     */
    @BeforeMethod
    public void setUp() {
        calculator = new Calculator();
    }

    /**
     * Позитивный тест на проверку суммы двух положительных чисел
     */
    @Story("Позитивные проверки суммы чисел")
    @Severity(SeverityLevel.BLOCKER)
    @Test(description = "Проверка суммы двух положительных чисел")
    public void testPositiveNumbersSum() {
        int firstNumber = 1;
        int secondNumber = 2;
        int result = firstNumber + secondNumber;
        calculator.setFirstNumber(firstNumber);
        calculator.setMathSign("+");
        calculator.setSecondNumber(secondNumber);
        calculator.calculate();
        assertEquals(calculator.getResult(), result);
    }

    /**
     * Позитивный тест на проверку суммы двух отрицательных чисел
     */
    @Story("Позитивные проверки суммы чисел")
    @Severity(SeverityLevel.BLOCKER)
    @Test(description = "Проверка суммы двух отрицательных чисел")
    public void testNegativeNumbersSum() {
        int firstNumber = -1;
        int secondNumber = -2;
        int result = firstNumber + secondNumber;
        calculator.setFirstNumber(firstNumber);
        calculator.setMathSign("+");
        calculator.setSecondNumber(secondNumber);
        calculator.calculate();
        assertEquals(calculator.getResult(), result);
    }

    /**
     * Позитивный тест на проверку суммы положительного и отрицательного чисел
     */
    @Story("Позитивные проверки суммы чисел")
    @Severity(SeverityLevel.BLOCKER)
    @Test(description = "Проверка суммы положительного и отрицательного чисел")
    public void testPositiveAndNegativeNumbersSum() {
        int firstNumber = 1;
        int secondNumber = -2;
        int result = firstNumber + secondNumber;
        calculator.setFirstNumber(firstNumber);
        calculator.setMathSign("+");
        calculator.setSecondNumber(secondNumber);
        calculator.calculate();
        assertEquals(calculator.getResult(), result);
    }

    /**
     * Позитивный тест на проверку суммы положительного числа и нуля
     */
    @Story("Позитивные проверки суммы чисел")
    @Severity(SeverityLevel.BLOCKER)
    @Test(description = "Позитивный тест на проверку суммы положительного числа и нуля")
    public void testPositiveNumberAndZeroSum() {
        int firstNumber = 1;
        int secondNumber = 0;
        int result = firstNumber + secondNumber;
        calculator.setFirstNumber(firstNumber);
        calculator.setMathSign("+");
        calculator.setSecondNumber(secondNumber);
        calculator.calculate();
        assertEquals(calculator.getResult(), result);
    }

    /**
     * Позитивный тест на проверку разности положительных чисел
     */
    @Story("Позитивные проверки разности чисел")
    @Severity(SeverityLevel.BLOCKER)
    @Test(description = "Позитивный тест на проверку разности положительных чисел")
    public void testPositiveNumbersSubtraction() {
        int firstNumber = 5;
        int secondNumber = 6;
        int result = firstNumber - secondNumber;
        calculator.setFirstNumber(firstNumber);
        calculator.setMathSign("-");
        calculator.setSecondNumber(secondNumber);
        calculator.calculate();
        assertEquals(calculator.getResult(), result);
    }

    /**
     * Позитивный тест на проверку разности отрицательных чисел.
     */
    @Story("Позитивные проверки разности чисел")
    @Severity(SeverityLevel.BLOCKER)
    @Test(description = "Позитивный тест на проверку разности отрицательных чисел")
    public void testNegativeNumbersSubtraction() {
        int firstNumber = -5;
        int secondNumber = -6;
        int result = firstNumber - secondNumber;
        calculator.setFirstNumber(firstNumber);
        calculator.setMathSign("-");
        calculator.setSecondNumber(secondNumber);
        calculator.calculate();
        assertEquals(calculator.getResult(), result);
    }

    /**
     * Позитивный тест на проверку разности отрицательного числа из положительного.
     */
    @Story("Позитивные проверки разности чисел")
    @Severity(SeverityLevel.BLOCKER)
    @Test(description = "Позитивный тест на проверку разности отрицательного числа из положительного")
    public void testPositiveAndNegativeNumbersSubtraction() {
        int firstNumber = 5;
        int secondNumber = -6;
        int result = firstNumber - secondNumber;
        calculator.setFirstNumber(firstNumber);
        calculator.setMathSign("-");
        calculator.setSecondNumber(secondNumber);
        calculator.calculate();
        assertEquals(calculator.getResult(), result);
    }

    /**
     * Позитивный тест на проверку разности отрицательного числа из нуля.
     */
    @Story("Позитивные проверки разности чисел")
    @Severity(SeverityLevel.BLOCKER)
    @Test(description = "Позитивный тест на проверку разности отрицательного числа из нуля")
    public void testPositiveNumberFromZeroSubtraction() {
        int firstNumber = 0;
        int secondNumber = 6;
        int result = firstNumber - secondNumber;
        calculator.setFirstNumber(firstNumber);
        calculator.setMathSign("-");
        calculator.setSecondNumber(secondNumber);
        calculator.calculate();
        assertEquals(calculator.getResult(), result);
    }

    /**
     * Позитивный тест на проверку умножения положительных чисел
     */
    @Story("Позитивные проверки умножения чисел")
    @Severity(SeverityLevel.BLOCKER)
    @Test(description = "Позитивный тест на проверку умножения положительных чисел")
    public void testPositiveNumbersMultiplication() {
        int firstNumber = 2;
        int secondNumber = 3;
        int result = firstNumber * secondNumber;
        calculator.setFirstNumber(firstNumber);
        calculator.setMathSign("*");
        calculator.setSecondNumber(secondNumber);
        calculator.calculate();
        assertEquals(calculator.getResult(), result);
    }

    /**
     * Позитивный тест на проверку умножения отрицательных чисел.
     */
    @Story("Позитивные проверки умножения чисел")
    @Severity(SeverityLevel.BLOCKER)
    @Test(description = "Позитивный тест на проверку умножения отрицательных чисел")
    public void testNegativeNumbersMultiplication() {
        int firstNumber = -2;
        int secondNumber = -3;
        int result = firstNumber * secondNumber;
        calculator.setFirstNumber(firstNumber);
        calculator.setMathSign("*");
        calculator.setSecondNumber(secondNumber);
        calculator.calculate();
        assertEquals(calculator.getResult(), result);
    }

    /**
     * Позитивный тест на проверку умножения положительного и отрицательного чисел.
     */
    @Story("Позитивные проверки умножения чисел")
    @Severity(SeverityLevel.BLOCKER)
    @Test(description = "Позитивный тест на проверку умножения положительного и отрицательного чисел")
    public void testPositiveAndNegativeNumbersMultiplication() {
        int firstNumber = 2;
        int secondNumber = -3;
        int result = firstNumber * secondNumber;
        calculator.setFirstNumber(firstNumber);
        calculator.setMathSign("*");
        calculator.setSecondNumber(secondNumber);
        calculator.calculate();
        assertEquals(calculator.getResult(), result);
    }

    /**
     * Позитивный тест на проверку деления положительных чисел.
     */
    @Story("Позитивные проверки деления чисел")
    @Severity(SeverityLevel.BLOCKER)
    @Test(description = "Позитивный тест на проверку деления положительных чисел")
    public void testPositiveNumbersDivision() {
        int firstNumber = 6;
        int secondNumber = 3;
        int result = firstNumber / secondNumber;
        calculator.setFirstNumber(firstNumber);
        calculator.setMathSign("/");
        calculator.setSecondNumber(secondNumber);
        calculator.calculate();
        assertEquals(calculator.getResult(), result);
    }

    /**
     * Позитивный тест на проверку деления отрицательных чисел.
     */
    @Story("Позитивные проверки деления чисел")
    @Severity(SeverityLevel.BLOCKER)
    @Test(description = "Позитивный тест на проверку деления отрицательных чисел")
    public void testNegativeNumbersDivision() {
        int firstNumber = -6;
        int secondNumber = -3;
        int result = firstNumber / secondNumber;
        calculator.setFirstNumber(firstNumber);
        calculator.setMathSign("/");;
        calculator.setSecondNumber(secondNumber);
        calculator.calculate();
        assertEquals(calculator.getResult(), result);
    }

    /**
     * Позитивный тест на проверку деления отрицательного числа на положительное.
     */
    @Story("Позитивные проверки деления чисел")
    @Severity(SeverityLevel.BLOCKER)
    @Test(description = "Позитивный тест на проверку деления отрицательного числа на положительное")
    public void testPositiveAndNegativeNumbersDivision() {
        int firstNumber = -6;
        int secondNumber = 3;
        int result = firstNumber / secondNumber;
        calculator.setFirstNumber(firstNumber);
        calculator.setMathSign("/");;
        calculator.setSecondNumber(secondNumber);
        calculator.calculate();
        assertEquals(calculator.getResult(), result);
    }

    /**
     * Негативный тест на проверку деления на ноль.
     */
    @Story("Негативные проверки деления чисел")
    @Severity(SeverityLevel.CRITICAL)
    @Test(description = "Негативный тест на проверку деления на ноль",
            expectedExceptions = DivisionByZeroException.class)
    public void testDivisionByZero() {
        int firstNumber = 2;
        int secondNumber = 0;
        calculator.setFirstNumber(firstNumber);
        calculator.setMathSign("/");
        calculator.setSecondNumber(secondNumber);
        calculator.calculate();
    }

    /**
     * Негативный тест при установке знака, не являющимся арифметическим
     */
    @Story("Негативные проверки на вводимый арифметический символ")
    @Severity(SeverityLevel.CRITICAL)
    @Test(description = "Негативный тест при установке знака, не являющимся арифметическим",
            expectedExceptions = IncorrectSignValue.class)
    public void testCalculationWithIncorrectSign() {
        int firstNumber = 2;
        int secondNumber = 0;
        calculator.setFirstNumber(firstNumber);
        calculator.setMathSign("1");
        calculator.setSecondNumber(secondNumber);
        calculator.calculate();
    }

    /**
     * Негативный тест при попытке вычисления, когда переменной арифметического знака не присвоено значение.
     */
    @Story("Негативные проверки на вводимый арифметический символ")
    @Severity(SeverityLevel.CRITICAL)
    @Test(description = "Негативный тест, когда переменной арифметического знака не присвоено значение",
            expectedExceptions = IncorrectSignValue.class)
    public void testCalculationWithNullSign() {
        int firstNumber = 2;
        int secondNumber = 0;
        calculator.setFirstNumber(firstNumber);
        calculator.setSecondNumber(secondNumber);
        calculator.calculate();
    }
}
