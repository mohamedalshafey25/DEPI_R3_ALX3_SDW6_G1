package modularTesting;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T3BotAbstractTest extends TestCase{

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

}
