package PageObjects;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class WelcomeModal {

    private static SelenideElement gotItBtn = $x("//span[contains(text(), 'Got it!')]");

    public static WelcomeModal initWelcomeModal(){
        gotItBtn.waitUntil(Condition.visible, 10000);
        return new WelcomeModal();
    }

    public static MainPage closeModal(){
        gotItBtn.click();
        return MainPage.initMainPage();
    }
}
