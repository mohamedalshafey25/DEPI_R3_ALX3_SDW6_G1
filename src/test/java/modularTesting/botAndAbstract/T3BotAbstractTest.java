package modularTesting.botAndAbstract;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T3BotAbstractTest extends TestCase{

    @Test
    public void testMethod1(){
        By revealInputButtonLocator = By.id("reveal");
        By revealedInputLocator = By.id("revealed");

        bot.navigateTo("https://www.selenium.dev/selenium/web/dynamic.html");
        bot.click(revealInputButtonLocator);
        bot.type(revealedInputLocator,"Mohamed");
        String actualValue = bot.getDomProperty(revealedInputLocator,"value");

        String expectedValue = "Mohamed";
        Assert.assertEquals(actualValue,expectedValue);
    }
}
