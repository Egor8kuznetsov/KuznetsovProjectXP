package PageObjectJira.StepOnPage;

import java.time.Duration;

import static PageObjectJira.Elements1.ThirdData.*;
import static com.codeborne.selenide.Condition.visible;
import static junit.framework.TestCase.assertEquals;

public class TestSelenium extends ProjectSelection {
    public static void clicktoSelenium() {

        taskList.click();
        taskSearch1.shouldBe(visible, Duration.ofSeconds(60)).click();
        taskSearch.sendKeys("TestSelenium");

        testSelenium.click();
        System.out.println(statusIn.getText());
        String fail = "В РАБОТЕ";
        assertEquals(statusIn.getText(), statusIn.getText(), fail);

        System.out.println(version.getText());
        String failTwo = "Version 2.0";
        assertEquals(version.getText(), version.getText(), failTwo);
    }
}