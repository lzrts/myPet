package smokeTest;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$x;

public class instaMessage {

    private void login() {
        $x("//input[@name='username']").sendKeys("ketapex165");
        $x("//input[@name='password']").sendKeys("testonly1");
        $x("//div[contains(text(),'Увійти')]").click();
    }

    @Test
    void instaFuck() throws InterruptedException {
        Selenide.open("https://www.instagram.com/");

        login();

        $x("//span[contains(text(),'Пошук')]").waitUntil(Condition.visible, 10000);

        Selenide.open("https://www.instagram.com/tosha.bandit/");


        $x("//article/div/div/div[1]/div[1]").waitUntil(Condition.visible, 10000).click();


        for (int i = 0; i <= 20; i++) {
            $x("//textarea").waitUntil(Condition.visible, 5000).sendKeys("КИДАЕТ НА БАБКИ! ПРОДАВЕЦ ЧОРТ. КИДАЕТ НА БАБКИ! ПРОДАВЕЦ ЧОРТ.");
            $x("//button[@type='submit']").click();
            Thread.sleep(5000);
            $x("//div/a[contains(text(),'Далі')]").click();
            Thread.sleep(5000);
        }
    }

    @Test
    void fuck2() {

        Selenide.open("https://www.instagram.com/");

        login();

        $x("//span[contains(text(),'Пошук')]").waitUntil(Condition.visible, 10000);

        Selenide.open("https://www.instagram.com/kimkardashian/");

        $x("//button/div/*[local-name()='svg']/*[local-name()='circle']").click();
        $x("//button[contains(text(),'Поскаржитися на користувача')]").click();
        $x("//div[contains(text(),'Це неприйнятно')]").click();
        $x("//div[contains(text(),'запис')]").click();
        $x("//div[contains(text(),'публікує')]").click();
        $x("//div[contains(text(),'Шахрайство')]").click();

        System.out.println("Finish");
    }
}
