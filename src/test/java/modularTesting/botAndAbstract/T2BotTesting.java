package modularTesting.botAndAbstract;
import engine.Bot;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class T2BotTesting {

    Bot bot;

    By revealInputButtonLocator = By.id("reveal");
    By revealedInputLocator = By.id("revealed");

    @Test
    public void testMethod1(){

        bot.navigateTo("https://www.selenium.dev/selenium/web/dynamic.html");
        bot.click(revealInputButtonLocator);
        bot.type(revealedInputLocator,"Mohamed");
        String actualValue = bot.getDomProperty(revealedInputLocator,"value");

        String expectedValue = "Mohamed";
        Assert.assertEquals(actualValue,expectedValue);
    }

    @BeforeMethod
    public void beforeMethod() {
        bot = new Bot();
    }

    @AfterMethod
    public void afterMethod() {
        bot.quit();
    }


}
