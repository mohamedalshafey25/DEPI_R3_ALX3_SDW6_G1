package automation;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class CustomExplicitWaitTest {

    WebDriver driver;
    Wait<WebDriver> wait;   // declare explicit wait variable here
    By revealInputButtonLocator = By.id("reveal");
    By revealedInputLocator = By.id("revealed");
    By adderButtonLocator = By.id("adder");
    By addedBoxLocator = By.id("box0");

    @Test
    public void testTypeInRevealedInput(){
        driver.navigate().to("https://www.selenium.dev/selenium/web/dynamic.html");
        driver.findElement(revealInputButtonLocator).click();
        // [2] Custom explicit wait using FluentWait
        wait.until(d -> {
            d.findElement(revealedInputLocator).sendKeys("Hello after Fluent Wait!");
            return true;
        });
        // Using helper methods
        //typingWithWait(revealedInputLocator, "Hello after Fluent Wait!");
    }

    @Test
    public void testAdder(){
        driver.navigate().to("https://www.selenium.dev/selenium/web/dynamic.html");
        driver.findElement(adderButtonLocator).click();
        // [2] Custom explicit wait using FluentWait
        wait.until(d -> {
            d.findElement(addedBoxLocator).click();
            return true;
        });

        // Using helper methods
        //clickingWithWait(revealedInputLocator);
    }

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        // [2] initialize Custom explicit wait using FluentWait
        wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofMillis(300))
                .ignoring(ElementNotInteractableException.class)
                .ignoring(StaleElementReferenceException.class)
                .ignoring(NotFoundException.class);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    private void typingWithWait (By locator, CharSequence... text) {
        wait.until(d -> {
            d.findElement(locator).sendKeys(text);
            return true;
        });
    }
    private void clickingWithWait (By locator) {
        wait.until(d -> {
            d.findElement(locator).click();
            return true;
        });
    }
}
