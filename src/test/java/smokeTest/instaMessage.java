package smokeTest;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$x;

public class instaMessage {

    String victimName = "top_lviv_boys";
    @Test
    void instaFuck() throws InterruptedException {
        Selenide.open("https://www.instagram.com/");

        $x("//input[@name='username']").sendKeys("csdvdfv343");
        $x("//input[@name='password']").sendKeys("testonly1");
        $x("//div[contains(text(),'Увійти')]").click();

        $x("//span[contains(text(),'Пошук')]").waitUntil(Condition.visible, 10000);

        Selenide.open("https://www.instagram.com/tosha.bandit/");

      //  Thread.sleep(3000);

        $x("//article/div/div/div[1]/div[1]").waitUntil(Condition.visible, 10000).click();


        for (int i=0; 1 <= 10; i++){
            $x("//textarea").waitUntil(Condition.visible, 10000).sendKeys("ПРОДАВЕЦ ЧОРТ. КИДАЕТ НА БАБКИ!");
            $x("//button[@type='submit']").click();
            Thread.sleep(10000);
            $x("//div/a[contains(text(),'Далі')]").click();
            Thread.sleep(10000);
        }
    }
}
