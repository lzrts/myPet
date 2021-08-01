package smokeTest;

import PageObjects.SignInPage;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.testng.Assert;
import org.testng.annotations.Test;

public class KeepItTest {

    private final String LOGIN = "automation@keepitqa.com";
    private final String PASS = "E#*b2wGIbFHz";

    @Test
    void ms365Test() {
        Selenide.open("https://ws-test.keepit.com/");

        SignInPage.initSignInPage()
                .signIn(LOGIN, PASS)
                .closeModal()
                .setAddMS365Connector()
                .pressNextBtn();

        Assert.assertTrue(WebDriverRunner.url().contains("https://login.microsoftonline.com/"));
        System.out.println("HI");
        System.out.println("HI");
        System.out.println("HI");
        System.out.println("HI");
    }
}
