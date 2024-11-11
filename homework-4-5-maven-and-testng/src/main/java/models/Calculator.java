package models;

import exceptions.DivisionByZeroException;
import exceptions.IncorrectSignValue;

import java.util.Scanner;

import static utils.Validator.validateInputNumber;
import static utils.Validator.validateInputSign;

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
     * Метод для считывания данных для дальнейших расчётов.
     */
    public void inputData(){
        //Считывание первого числа с консоли, его проверка и запись в экземпляр класса Calculator
        System.out.println("Введите первое целое число");
        Scanner scanner = new Scanner(System.in);
        firstNumber = validateInputNumber(scanner.nextInt());

        //Считывание символа арифметической операции с консоли, его проверка и запись в экземпляр класса Calculator
        System.out.println("Введите знак арифметической операции");
        mathSign = validateInputSign(scanner.next());

        //Считывание второго числа с консоли, его проверка и запись в экземпляр класса Calculator
        System.out.println("Введите второе целое число");
        secondNumber = validateInputNumber(scanner.nextInt());
    }

    /**
     * Метод в котором проводятся вычисления
     */
    public int calculate() {
        if (mathSign != null) {
            switch (mathSign) {
                case "+":
                    result = firstNumber + secondNumber;
                    return result;
                case "-":
                    result = firstNumber - secondNumber;
                    return result;
                case "/":
                    if (secondNumber == 0) {
                        throw new DivisionByZeroException("На ноль делить нельзя");
                    }
                    result = firstNumber / secondNumber;
                    return result;
                case "*":
                    result = firstNumber * secondNumber;
                    return result;
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

    /**
     * Геттер результата вычисления
     * @return результат вычисления
     */
    public int getResult() {
        return result;
    }
}
