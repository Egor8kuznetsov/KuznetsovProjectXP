package PageObjectJira.StepOnPage;

import static PageObjectJira.Elements1.SecondData.*;
import static junit.framework.TestCase.assertEquals;

public class ProjectSelection extends Authorization {
    public static void clicktoProject()  {

        buttonProject.click();
        buttonTest.click();
        task.click();
        System.out.println("Количество задач: " + taskNumber.getText().substring(5));

        assertEquals("Ошибка при переходе к списку задач", examinationTwo.getText(),examinationTwo.getText());

    }


}
