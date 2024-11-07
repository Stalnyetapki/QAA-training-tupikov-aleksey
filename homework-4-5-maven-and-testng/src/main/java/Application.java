import models.Calculator;

import java.util.Scanner;

import static utils.Validator.validateInputNumber;
import static utils.Validator.validateInputSign;

public class Application {

    public static void main(String[] args) {

        //Создание объекта Calculator
        Calculator calculator = new Calculator();

        //Считывание первого числа с консоли, его проверка и  запись в экземпляр класса Calculator
        System.out.println("Введите первое целое число");
        Scanner scanner = new Scanner(System.in);
        int firstNumber = validateInputNumber(scanner.nextInt());
        calculator.setFirstNumber(firstNumber);

        //Считывание символа арифметической операции с консоли, его проверка и запись в экземпляр класса Calculator
        System.out.println("Введите знак арифметической операции");
        String mathSign = validateInputSign(scanner.next());
        calculator.setMathSign(mathSign);

        //Считывание второго числа с консоли, его проверка и запись в экземпляр класса Calculator
        System.out.println("Введите второе целое число");
        int secondNumber = validateInputNumber(scanner.nextInt());
        calculator.setSecondNumber(secondNumber);

        //Проведение вычисления и возвращение результата операции через вызов метода calculate()
        calculator.calculate();

    }
}
