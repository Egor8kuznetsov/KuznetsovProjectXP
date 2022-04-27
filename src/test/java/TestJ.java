import hooks.WebHooks;
import org.junit.jupiter.api.Test;

import static PageObjectJira.StepOnPage.Authorization.clicktoAuthorizations;
import static PageObjectJira.StepOnPage.CreateBug.clicktoCreate;
import static PageObjectJira.StepOnPage.ProjectSelection.clicktoProject;

import static PageObjectJira.StepOnPage.TaskProcessing.clicktobugTest;
import static PageObjectJira.StepOnPage.TestSelenium.clicktoSelenium;
import static com.codeborne.selenide.Selenide.open;

public class TestJ extends WebHooks {
    @Test
        public void testJira1(){
        open("https://edujira.ifellow.ru/secure/Dashboard.jspa");

        clicktoAuthorizations();
        clicktoProject();
        clicktoSelenium();
        clicktoCreate();
        clicktobugTest();

    }




}


