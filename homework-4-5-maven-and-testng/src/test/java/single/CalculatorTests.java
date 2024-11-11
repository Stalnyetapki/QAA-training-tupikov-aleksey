package single;

import exceptions.DivisionByZeroException;
import exceptions.IncorrectSignValue;
import models.Calculator;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Тесты для проверки класса Calculator
 */
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
    @Test
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
    @Test
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
    @Test
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
    @Test
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
    @Test
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
    @Test
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
    @Test
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
    @Test
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
    @Test
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
    @Test
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
    @Test
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
    @Test
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
    @Test
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
    @Test
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
    @Test(expectedExceptions = DivisionByZeroException.class)
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
    @Test(expectedExceptions = IncorrectSignValue.class)
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
    @Test(expectedExceptions = IncorrectSignValue.class)
    public void testCalculationWithNullSign() {
        int firstNumber = 2;
        int secondNumber = 0;
        calculator.setFirstNumber(firstNumber);
        calculator.setSecondNumber(secondNumber);
        calculator.calculate();
    }
}
