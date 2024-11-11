package parametrized;

import exceptions.DivisionByZeroException;
import exceptions.IncorrectSignValue;
import models.Calculator;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Набор тестов с DataProvider для класса Calculator
 */
public class CalculatorTestsWithDataProvider {

    /**
     * Создание переменной класса Calculator
     */
    private Calculator calculator;

    /**
     * Создание объекта класса Calculator перед каждым тестом
     */
    @BeforeTest
    public void setUp(){
        calculator = new Calculator();
    }

    /**
     * DataProvider с тестовыми данными для позитивных тестов сложения
     *
     * @return двумерный массив объектов
     */
    @DataProvider
    public Object[][] getPositiveAdditionOperationDataProvider() {
        return new Integer [][] {
                {1, 2, 3},
                {-1, -2, -3},
                {1, -2, -1},
                {1, 0, 1}
        };
    }

    /**
     * DataProvider с тестовыми данными для позитивных тестов вычитания
     *
     * @return двумерный массив объектов (стандартный return для DataProvider)
     */
    @DataProvider
    public Object[][] getPositiveSubtractionOperationDataProvider() {
        return new Integer [][] {
                {5, 6, -1},
                {-5, -6, 1},
                {5, -6, 11},
                {0, 6, -6}
        };
    }

    /**
     * DataProvider с тестовыми данными для позитивных тестов умножения
     *
     * @return двумерный массив объектов (стандартный return для DataProvider)
     */
    @DataProvider
    public Object[][] getPositiveMultiplicationOperationDataProvider() {
        return new Integer [][] {
                {2, 3, 6},
                {-2, -3, 6},
                {2, -3, -6}
        };
    }

    /**
     * DataProvider с тестовыми данными для позитивных тестов деления
     *
     * @return двумерный массив объектов (стандартный return для DataProvider)
     */
    @DataProvider
    public Object[][] getPositiveDivisionOperationDataProvider() {
        return new Integer [][] {
                {6, 3, 2},
                {-6, -3, 2},
                {-6, 3, -2}
        };
    }

    /**
     * DataProvider с тестовыми данными для негативных тестов деления на ноль
     *
     * @return двумерный массив объектов (стандартный return для DataProvider)
     */
    @DataProvider
    public Object[][] getDivisionByZeroDataProvider() {
        return new Integer [][] {
                {1, 0},
                {0, 0}
        };
    }

    /**
     * DataProvider с тестовыми данными для негативных тестов в вычислениях с некорректными арифметическими знаками
     *
     * @return двумерный массив объектов (стандартный return для DataProvider)
     */
    @DataProvider
    public Object[][] getNegativeCalculationWithIncorrectSignDataProvider() {
        return new Object[][]{
                {6, "r", 2},
                {-6, "1", 2},
                {-6, "#", -2},
                {2, null, 0}
        };
    }

    /**
     * Позитивный параметризованный тест на проверку суммы чисел
     * @param firstNumber первое слагаемое из DataProvider 'getPositiveAdditionOperationDataProvider'
     * @param secondNumber второе из DataProvider 'getPositiveAdditionOperationDataProvider'
     * @param result ожидаемый результат вычисления из DataProvider 'getPositiveAdditionOperationDataProvider'
     */
    @Test(dataProvider = "getPositiveAdditionOperationDataProvider")
    public void testPutPositiveDataForAddition(int firstNumber, int secondNumber, int result) {
        calculator.setFirstNumber(firstNumber);
        calculator.setMathSign("+");
        calculator.setSecondNumber(secondNumber);
        calculator.calculate();
        assertEquals(calculator.getResult(), result);
    }

    /**
     * Позитивный параметризованный тест на проверку разности чисел
     * @param firstNumber первое слагаемое из DataProvider 'getPositiveSubtractionOperationDataProvider'
     * @param secondNumber второе из DataProvider 'getPositiveSubtractionOperationDataProvider'
     * @param result ожидаемый результат вычисления из DataProvider 'getPositiveSubtractionOperationDataProvider'
     */
    @Test(dataProvider = "getPositiveSubtractionOperationDataProvider")
    public void testPutPositiveDataForSubtraction(int firstNumber, int secondNumber, int result) {
        calculator.setFirstNumber(firstNumber);
        calculator.setMathSign("-");
        calculator.setSecondNumber(secondNumber);
        calculator.calculate();
        assertEquals(calculator.getResult(), result);
    }

    /**
     * Позитивный параметризованный тест на проверку умножения чисел
     * @param firstNumber первое слагаемое из DataProvider 'getPositiveMultiplicationOperationDataProvider'
     * @param secondNumber второе из DataProvider 'getPositiveMultiplicationOperationDataProvider'
     * @param result ожидаемый результат вычисления из DataProvider 'getPositiveMultiplicationOperationDataProvider'
     */
    @Test(dataProvider = "getPositiveMultiplicationOperationDataProvider")
    public void testPutPositiveDataForMultiplication(int firstNumber, int secondNumber, int result) {
        calculator.setFirstNumber(firstNumber);
        calculator.setMathSign("*");
        calculator.setSecondNumber(secondNumber);
        calculator.calculate();
        assertEquals(calculator.getResult(), result);
    }

    /**
     * Позитивный параметризованный тест на проверку деления чисел
     * @param firstNumber первое слагаемое из DataProvider 'getPositiveDivisionOperationDataProvider'
     * @param secondNumber второе из DataProvider 'getPositiveDivisionOperationDataProvider'
     * @param result ожидаемый результат вычисления из DataProvider 'getPositiveDivisionOperationDataProvider'
     */
    @Test(dataProvider = "getPositiveDivisionOperationDataProvider")
    public void testPutPositiveDataForDivision(int firstNumber, int secondNumber, int result) {
        calculator.setFirstNumber(firstNumber);
        calculator.setMathSign("/");
        calculator.setSecondNumber(secondNumber);
        calculator.calculate();
        assertEquals(calculator.getResult(), result);
    }

    /**
     * Негативный тест деления на ноль
     * @param firstNumber первое слагаемое из DataProvider 'getDivisionByZeroDataProvider'
     * @param secondNumber второе из DataProvider 'getDivisionByZeroDataProvider'
     */
    @Test(dataProvider = "getDivisionByZeroDataProvider",expectedExceptions = DivisionByZeroException.class)
    public void testDivisionByZero(int firstNumber, int secondNumber) {
        calculator.setFirstNumber(firstNumber);
        calculator.setMathSign("/");
        calculator.setSecondNumber(secondNumber);
        calculator.calculate();
    }

    /**
     * Негативный тест на проверку ввода некорректного арифметического символа
     * @param firstNumber первое слагаемое из DataProvider 'getNegativeCalculationWithIncorrectSignDataProvider'
     * @param sign арифметический знак  из DataProvider 'getNegativeCalculationWithIncorrectSignDataProvider'
     * @param secondNumber второе из DataProvider 'getNegativeCalculationWithIncorrectSignDataProvider'
     */
    @Test(dataProvider = "getNegativeCalculationWithIncorrectSignDataProvider",expectedExceptions = IncorrectSignValue.class)
    public void testCalculationWithIncorrectSign(int firstNumber, String sign, int secondNumber) {
        calculator.setFirstNumber(firstNumber);
        calculator.setMathSign(sign);
        calculator.setSecondNumber(secondNumber);
        calculator.calculate();
    }

}
