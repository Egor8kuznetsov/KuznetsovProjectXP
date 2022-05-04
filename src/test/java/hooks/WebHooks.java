package hooks;

import com.codeborne.selenide.Configuration;

import com.codeborne.selenide.WebDriverRunner;
import org.junit.After;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

public class WebHooks {
    @BeforeAll
    public static void setWebDriverFormat() {
        Configuration.startMaximized = true;
    }

    @AfterAll
    public static void driverClose() { WebDriverRunner.closeWebDriver(); }



}
