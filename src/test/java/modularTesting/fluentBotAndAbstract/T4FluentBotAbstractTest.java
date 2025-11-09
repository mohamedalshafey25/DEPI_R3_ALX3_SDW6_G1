package modularTesting.fluentBotAndAbstract;
import modularTesting.botAndAbstract.TestCase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T4FluentBotAbstractTest extends TestCaseFluentBot {

    @Test
    public void testMethod1(){
        By revealInputButtonLocator = By.id("reveal");
        By revealedInputLocator = By.id("revealed");
        String expectedValue = "Mohamed";

        String actualValue =
                bot.navigateTo("https://www.selenium.dev/selenium/web/dynamic.html")
                .click(revealInputButtonLocator)
                .type(revealedInputLocator,"Mohamed")
                .getDomProperty(revealedInputLocator,"value");

        Assert.assertEquals(actualValue,expectedValue);
    }
}
