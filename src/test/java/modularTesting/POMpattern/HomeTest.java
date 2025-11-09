package modularTesting.POMpattern;

import POMpatternPages.HomePage;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class HomeTest {
    WebDriver driver;
    Wait<WebDriver> wait;

    @Test
    public void testInsertingText() {
        HomePage homePage = new HomePage(driver,wait);
        homePage.navigate();
        homePage.revealHiddenInput();
        homePage.insertTextIntoRevealedInput("Testing POM");
        String actualValue = homePage.getRevealedInputValue();

        String expectedValue = "Testing POM";
        Assert.assertEquals(actualValue,expectedValue);
    }

    @BeforeMethod
    public void beforeMethod() {
        driver = new ChromeDriver();
        wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(2))
                .pollingEvery(Duration.ofMillis(300))
                .ignoring(ElementNotInteractableException.class);
    }

    @AfterMethod
    public void afterMethod() {
        driver.quit();
    }


    }
