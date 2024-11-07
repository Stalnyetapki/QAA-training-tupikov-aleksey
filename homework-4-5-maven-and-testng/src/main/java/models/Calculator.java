package models;

import exceptions.DivisionByZeroException;
import exceptions.IncorrectSignValue;

/**
 * Класс хранит в себе значения введенных чисел и производит арифметические вычисления.
 */
public class Calculator {

    /**
     * Переменная для хранения первого слагаемого
     */
    private int firstNumber;
    /**
     * Переменная для хранения второго слагаемого
     */
    private int secondNumber;
    /**
     * Переменная для арифметического символа
     */
    private String mathSign;
    /**
     * Переменная для результата вычисления
     */
    private int result;

    /**
     * Метод в котором проводятся вычисления
     */
    public void calculate() {
        if (mathSign != null) {
            switch (mathSign) {
                case "+":
                    result = firstNumber + secondNumber;
                    System.out.println(result);
                    break;
                case "-":
                    result = firstNumber - secondNumber;
                    System.out.println(result);
                    break;
                case "/":
                    if (this.secondNumber == 0) {
                        throw new DivisionByZeroException("На ноль делить нельзя");
                    }
                    result = firstNumber / secondNumber;
                    System.out.println(result);
                    break;
                case "*":
                    result = firstNumber * secondNumber;
                    System.out.println(result);
                    break;
                default:
                    throw new IncorrectSignValue("Введенное значение " + mathSign + " не являются арифметическим символом из группы: +-*/");
            }
        } else {
            throw new IncorrectSignValue("Арифметический символ не введен");
        }
    }

    /**
     * Сеттер первого слагаемого
     * @param firstNumber первое слагаемое
     */
    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    /**
     * Сеттер второго слагаемого
     * @param secondNumber первое слагаемое
     */
    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }
    /**
     * Сеттер арифметического символа
     * @param mathSign символ для вычисления
     */
    public void setMathSign(String mathSign) {
        this.mathSign = mathSign;
    }
}
