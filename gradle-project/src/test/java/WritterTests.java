import io.qameta.allure.*;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class WritterTests {

    @Epic("Проверка вывода")
    @Feature("Проверка вывода класса Writter")
    @Story("Проверка вывода метода getText")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Проверка что текст вывода соответствует Hello world!")
    @Owner("Алексей")
    @Test(description = "Проверка вывода метода getText() на вывод текста Hello world!")
    public void getTextTest() {
        String text = "Hello world!";
        assertEquals(Writter.getText(), text);
    }

}
