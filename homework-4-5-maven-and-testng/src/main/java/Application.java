import models.Calculator;

public class Application {

    public static void main(String[] args) {

        //Создание объекта Calculator
        Calculator calculator = new Calculator();
        //Ввод выражения для вычисления.
        calculator.inputData();
        //Проведение вычисления и вывод в консоль результата операции.
        System.out.println(calculator.calculate());

    }
}
