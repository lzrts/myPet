package PageObjects;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class SignInPage {

    private static SelenideElement emailFiled = $("#login-form-login"),
            passwordField = $("#login-form-password"),
            signInBtn = $("#login-form-login-button");

    public static SignInPage initSignInPage(){
        emailFiled.waitUntil(Condition.visible, 3000);
        return new SignInPage();
    }

    public static WelcomeModal signIn(String email, String pass){
        emailFiled.sendKeys(email);
        passwordField.sendKeys(pass);
        signInBtn.click();
        return WelcomeModal.initWelcomeModal();
    }

}
