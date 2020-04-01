package PageObjects;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SearchResultPage {

    public static SearchResultPage initSearchResultSelenide() {
        $(By.xpath("//ul[contains(@class,'breadcrumbs')]")).waitUntil(Condition.visible, 10000);
        return new SearchResultPage();
    }

}
