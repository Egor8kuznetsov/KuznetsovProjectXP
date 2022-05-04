package PageObjectJira.StepOnPage;

import java.time.Duration;

import static PageObjectJira.Elements1.FourthData.*;
import static PageObjectJira.Elements1.SecondData.task;
import static com.codeborne.selenide.Condition.visible;
import static junit.framework.TestCase.assertEquals;

public class TaskProcessing extends CreateBug{
    public static void clicktobugTest() {

        task.click();
        switchFilter.click();
        createByMe.click();
        testBug12.click();

        String statusProject = "СДЕЛАТЬ";
        assertEquals(statusPr.getText(), statusProject);

        buisnessProcess.click();
        done.click();

        String statusProjectNew = "ГОТОВО";
        statusPr.shouldBe(visible, Duration.ofSeconds(60)).click();
        assertEquals(statusPr.getText(), statusProjectNew);
     }
}
