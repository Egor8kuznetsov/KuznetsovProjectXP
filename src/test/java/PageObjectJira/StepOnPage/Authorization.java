package PageObjectJira.StepOnPage;

import PageObjectJira.Elements1.FirstData;
import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;

import static junit.framework.TestCase.assertEquals;

public class Authorization extends FirstData {
    public static void clicktoAuthorizations() {
        login.shouldBe(visible, Duration.ofSeconds(60)).click();
        login.sendKeys("ekuznecov");

        password.shouldBe(visible, Duration.ofSeconds(60)).click();
        password.sendKeys("123Qwerty");
        loginbutton.click();

        assertEquals("Ошибка при авторизации", examinationOne.getText(),examinationOne.getText());

    }


}
