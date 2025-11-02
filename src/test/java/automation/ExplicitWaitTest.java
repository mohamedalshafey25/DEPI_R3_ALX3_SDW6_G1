package automation;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.time.Duration;

public class ExplicitWaitTest {
    WebDriver driver;
    Wait<WebDriver> wait;

    By revealButtonLocator = By.id("reveal");
    By revealedInputLocator = By.id("revealed");

    By adderButtonLocator = By.id("adder");
    By addedBoxLocator = By.id("box0");

    @Test
    public void typingInRevealedInputTest() {
        driver.navigate().to("https://www.selenium.dev/selenium/web/dynamic.html");

        // [1] Typing before revealing the input
        driver.findElement(revealedInputLocator).sendKeys("Before Revealing");

        // [2] Typing After revealing the input
//        driver.findElement(revealButtonLocator).click();
//        driver.findElement(revealedInputLocator).sendKeys("After Revealing");

        // [3] Clicking reveal button and verifying the input is displayed
//        driver.findElement(revealButtonLocator).click();
//        boolean isRevealed = driver.findElement(revealedInputLocator).isDisplayed();
//        Assert.assertTrue(isRevealed,"The revealed input is not displayed.");
//        driver.findElement(revealedInputLocator).sendKeys("After Revealing");
//        //String textInput = driver.findElement(revealedInputLocator).getDomProperty("value");

    }

    // explicit wait with lambda
    @Test
    public void typingWaitingAfterRevealingInputTest() {
        driver.navigate().to("https://www.selenium.dev/selenium/web/dynamic.html");
        driver.findElement(revealButtonLocator).click();

        // Add explicit wait logic here as needed using lambda expression
        wait.until(d -> d.findElement(revealedInputLocator).isDisplayed());

        driver.findElement(revealedInputLocator).sendKeys("After Waiting for Revealing");
    }

    // explicit wait with lambda for multiple conditions
    @Test
    public void interactingWaitingMultipleConditionsLambdaTest() {
        driver.navigate().to("https://www.selenium.dev/selenium/web/dynamic.html");
        driver.findElement(revealButtonLocator).click();
        // Add explicit wait logic here as needed
        wait.until(d -> {
            boolean isDisplayed= d.findElement(revealedInputLocator).isDisplayed();
            boolean isEnabled = d.findElement(revealedInputLocator).isEnabled();
            return isDisplayed && isEnabled;

//            return d.findElement(revealedInputLocator).isDisplayed();

        });

        driver.findElement(revealedInputLocator).sendKeys("After Waiting for Revealing");

    }

    // custom explicit wait using FluentWait class
    @Test
    public void ExplicitWaitForClicking() {
        driver.navigate().to("https://www.selenium.dev/selenium/web/dynamic.html");
        driver.findElement(revealButtonLocator).click();

        // Explicit wait
        wait.until(d -> {
            d.findElement(revealedInputLocator).sendKeys("Waiting until sendKeys is done!");
            return true;
        });
    }

    public void AddingBoxAndWaitingForClicking() {
        driver.navigate().to("https://www.selenium.dev/selenium/web/dynamic.html");
        driver.findElement(adderButtonLocator).click();
        wait.until(d -> {
            d.findElement(addedBoxLocator).click();
            return true;
        });
    }

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        // [1] initialize explicit wait here using WebDriverWait
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}
