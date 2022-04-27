package PageObjectJira.Elements1;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class FourthData {
    public static SelenideElement testBug = $x("(//div[@class='ghx-key'])[3]");
    public static SelenideElement testBugTwo = $x("//dd[@id='issuekey-val']");
    public static SelenideElement buisnessProcess = $x("(//span[@class='dropdown-text'])[2]");
    public static SelenideElement done = $x("//span[text()='Выполнено']");
    public static SelenideElement statusPr = $x("//span[@class='value']");
    //public static SelenideElement statusPrTwo = $x("");
}
