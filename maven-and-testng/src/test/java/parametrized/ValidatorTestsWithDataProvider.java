package parametrized;

import exceptions.IncorrectSignValue;
import io.qameta.allure.*;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static utils.Validator.validateInputNumber;
import static utils.Validator.validateInputSign;

/**
 * Набор тестов с DataProvider для класса Validator
 */
@Epic("Проверка калькулятора")
@Feature("Проверка валидации чисел и знаков, используемых в калькуляторе c помощью параметризованных тестов")
@Owner("Тупиков Алексей")
public class ValidatorTestsWithDataProvider {

    /**
     * DataProvider с тестовыми данными для позитивных тестов метода validateInputNumber()
     *
     * @return двумерный массив объектов
     */
    @DataProvider
    public Object[][] getValidateInputNumberPositiveTestData() {
        return new Integer[][]{{1}, {-1}, {0}};
    }

    /**
     * DataProvider с тестовыми данными для позитивных тестов метода validateInputNumber()
     *
     * @return двумерный массив объектов
     */
    @DataProvider
    public Object[][] getValidateInputSignPositiveTestData() {
        return new String[][]{{"+"}, {"-"}, {"*"}, {"/"}};
    }

    /**
     * DataProvider с тестовыми данными для негативных тестов метода validateInputNumber()
     *
     * @return двумерный массив объектов
     */
    @DataProvider
    public Object[][] getValidateInputSignNegativeTestData() {
        return new String[][]{{"1"}, {"z"}, {""}, {null}};
    }

    /**
     * Параметризованный позитивный тест на проверку метода validateInputNumber()
     *
     * @param num данные из DataProvider
     */
    @Story("Параметризованные позитивные тесты на валидацию чисел в выражении")
    @Severity(SeverityLevel.CRITICAL)
    @Test(description = "Позитивные проверка валидатора на ввод integer чисел",
            dataProvider = "getValidateInputNumberPositiveTestData")
    public void testValidateInputNumberPositive(int num) {
        assertEquals(validateInputNumber(num), num);
    }

    /**
     * Параметризованный позитивный тест на проверку метода validateInputSign()
     *
     * @param sign знак символа из DataProvider
     */
    @Story("Параметризованные позитивные тесты на прохождение валидации допустимых арифметических знаков")
    @Severity(SeverityLevel.CRITICAL)
    @Test(description = "Позитивные проверка валидатора на ввод арифметических знаков",
            dataProvider = "getValidateInputSignPositiveTestData")
    public void testValidateInputSignPositive(String sign) {
        assertEquals(validateInputSign(sign), sign);
    }

    /**
     * Параметризованный негативный тест на проверку метода validateInputSign()
     *
     * @param sign знак символа из DataProvider
     */
    @Story("Параметризованные негативные тесты на не прохождение валидации знаков, не являющимися арифметическими")
    @Severity(SeverityLevel.CRITICAL)
    @Test(description = "Негативная проверка на ввод невалидных символов",
            dataProvider = "getValidateInputSignNegativeTestData", expectedExceptions = IncorrectSignValue.class)
    public void testValidateInputSignNumber(String sign) {
        validateInputSign(sign);
    }
}
