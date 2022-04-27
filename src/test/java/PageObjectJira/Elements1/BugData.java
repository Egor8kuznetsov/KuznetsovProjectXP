package PageObjectJira.Elements1;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class BugData {

    public static SelenideElement create = $x("//li[@id='create-menu']");
   public static SelenideElement clickBug = $x("(//input[@role='combobox'])[2]");
   public static SelenideElement subject = $x("//input[@class='text long-field']");
   public static SelenideElement textClick = $x("(//button[text()='Текст'])[1]");
   public static SelenideElement environment = $x("(//button[text()='Текст'])[2]");
   public static SelenideElement description = $x("//textarea[@name='description']");
   public static SelenideElement tryut = $x("//textarea[@name='environment']");
   public static SelenideElement clickCreate = $x("//input[@value='Создать']");

}
