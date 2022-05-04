package PageObjectJira.Elements1;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class ThirdData {
    public static SelenideElement taskList = $x("//span[@class='aui-icon aui-icon-large agile-icon-plan aui-iconfont-backlog']");
    public static SelenideElement taskSearch = $x("//input[@aria-label='Поиск задач']");
    public static SelenideElement taskSearch1 = $x("//span[@class='js-search-trigger ghx-iconfont aui-icon aui-icon-small aui-iconfont-search-small']");
    public static SelenideElement testSelenium = $x("//a[@title='TEST-374']");
    public static SelenideElement statusIn = $x("//span[@id='status-val']");
    public static SelenideElement version = $x("//span[text()='Version 2.0']");

}
