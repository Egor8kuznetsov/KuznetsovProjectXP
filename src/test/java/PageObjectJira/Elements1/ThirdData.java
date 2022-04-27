package PageObjectJira.Elements1;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class ThirdData {
    public static SelenideElement taskList = $x("//span[@class='aui-icon aui-icon-large agile-icon-plan aui-iconfont-backlog']");
    public static SelenideElement testSelenium = $x("//a[@title='TEST-374']");
    public static SelenideElement statusIn = $x("//span[@id='status-val']");
    public static SelenideElement version = $x("//span[text()='Version 2.0']");

}
