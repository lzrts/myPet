package PageObjects;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class RozetkaMainPage {

    private SelenideElement
            searchField = $(By.xpath("//input[@name='search']")),
            confirmSearchButton = $(By.xpath("//button[contains(@class,'search-form__submit')]"));

    public static RozetkaMainPage initRozetkaMainSelenide() {
        $(By.xpath("//input[@name='search']")).waitUntil(Condition.visible, 3000);
        return new RozetkaMainPage();
    }

    public SearchResultPage searchItem(String itemName) {
        $(By.xpath("//input[@name='search']")).waitUntil(Condition.visible, 3000);
        searchField.clear();
        searchField.sendKeys(itemName);
        confirmSearchButton.click();
        return SearchResultPage.initSearchResultSelenide();
    }


}
