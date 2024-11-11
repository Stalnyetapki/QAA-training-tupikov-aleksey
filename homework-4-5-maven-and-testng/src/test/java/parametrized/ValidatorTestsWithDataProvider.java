package parametrized;

import exceptions.IncorrectSignValue;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static utils.Validator.validateInputNumber;
import static utils.Validator.validateInputSign;

/**
 * Набор тестов с DataProvider для класса Validator
 */
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
    @Test(dataProvider = "getValidateInputNumberPositiveTestData")
    public void testValidateInputNumberPositive(int num) {
        assertEquals(validateInputNumber(num), num);
    }

    /**
     * Параметризованный позитивный тест на проверку метода validateInputSign()
     *
     * @param sign знак символа из DataProvider
     */
    @Test(dataProvider = "getValidateInputSignPositiveTestData")
    public void testValidateInputSignPositive(String sign) {
        assertEquals(validateInputSign(sign), sign);
    }

    /**
     * Параметризованный негативный тест на проверку метода validateInputSign()
     *
     * @param sign знак символа из DataProvider
     */
    @Test(dataProvider = "getValidateInputSignNegativeTestData", expectedExceptions = IncorrectSignValue.class)
    public void testValidateInputSignNumber(String sign) {
        validateInputSign(sign);
    }
}
