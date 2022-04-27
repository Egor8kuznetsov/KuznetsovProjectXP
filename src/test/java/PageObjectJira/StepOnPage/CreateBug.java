package PageObjectJira.StepOnPage;

import java.time.Duration;

import static PageObjectJira.Elements1.BugData.*;
import static com.codeborne.selenide.Condition.visible;

public class CreateBug extends TestSelenium{
    public static void clicktoCreate() {

        create.click();
        clickBug.shouldBe(visible, Duration.ofSeconds(60)).click();
        clickBug.sendKeys("Ошибка");

        subject.shouldBe(visible, Duration.ofSeconds(60)).click();
        subject.sendKeys("Test_AT_2022_12");

        textClick.click();

        description.shouldBe(visible, Duration.ofSeconds(60)).click();
        description.sendKeys("Описание пробного теста");



        environment.click();
        tryut.shouldBe(visible,Duration.ofSeconds(60)).click();
        tryut.sendKeys("Окружение");

        clickCreate.click();

    }
}
