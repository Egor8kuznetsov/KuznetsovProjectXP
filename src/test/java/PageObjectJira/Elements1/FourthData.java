package PageObjectJira.Elements1;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class FourthData {

    public static SelenideElement switchFilter = $x("//button[text()='Переключить фильтр']");
    public static SelenideElement createByMe = $x ("//a[text()='Сообщенные мной']");
    public static SelenideElement testBug12 = $x("(//a[@class='splitview-issue-link'])[1]");
    public static SelenideElement buisnessProcess = $x("(//span[@class='dropdown-text'])[2]");
    public static SelenideElement done = $x("//span[text()='Выполнено']");
    public static SelenideElement statusPr = $x("//span[@class='value']");

}
