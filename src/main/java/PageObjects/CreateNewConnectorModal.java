package PageObjects;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class CreateNewConnectorModal {

    private static SelenideElement nextBtn = $x("//button[contains(@class,'md-confirm-button')]");

    public static CreateNewConnectorModal initCreateNewConnectorModal(){
        nextBtn.waitUntil(Condition.visible, 3000);
        return new CreateNewConnectorModal();
    }

    public static void pressNextBtn(){
        nextBtn.click();
        $("#content").waitUntil(Condition.disappears, 5000);
    }
}
