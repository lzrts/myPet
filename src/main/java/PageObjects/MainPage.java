package PageObjects;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class MainPage {

    private static SelenideElement addConnectorMenuOpen = $x("//button[@ng-click='$mdOpenMenu($event)']"),
            addMS365Connector = $x("//button[@ng-click='$ctrl.addO365NGDevice()']");

    public static MainPage initMainPage(){
        addConnectorMenuOpen.waitUntil(Condition.visible, 3000);
        return new MainPage();
    }

    public CreateNewConnectorModal setAddMS365Connector(){
        addConnectorMenuOpen.click();
        addMS365Connector.click();
        return CreateNewConnectorModal.initCreateNewConnectorModal();
    }
}
