package smokeTest;

import PageObjects.RozetkaMainPage;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RozetkaTest {

    @DataProvider
    public Object[][] testData() {
        return new Object[][]{
                {"Пилосос", "https://bt.rozetka.com.ua/ua/vacuum_cleaners/c80158/#search_text=%D0%BF%D0%B8%D0%BB%D0%BE%D1%81%D0%BE%D1%81"},
                {"SATAIII 3D V-NAND (SA400S37/480G)", "https://hard.rozetka.com.ua/ua/kingston_sa400s37_480g/p14606558/"},
                {"KGN39VI306", "https://bt.rozetka.com.ua/ua/bosch_kgn39vi306/p135486112/"}
        };
    }

    @Test(dataProvider = "testData")
    public void firstTest(String item, String itemUrl) {
        Selenide.open("https://rozetka.com.ua/ua/");

        RozetkaMainPage.initRozetkaMainSelenide()
                .searchItem(item);

        Assert.assertEquals(WebDriverRunner.url(), itemUrl);

    }
}
