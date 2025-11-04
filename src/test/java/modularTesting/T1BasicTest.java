package modularTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.time.Duration;

public class T1BasicTest {

//    WebDriver driver;
//    Wait<WebDriver> wait;

    By revealInputButtonLocator = By.id("reveal");
    By revealedInputLocator = By.id("revealed");

    public void testMethod1() {
//        driver.navigate().to("https://www.selenium.dev/selenium/web/dynamic.html");
//        driver.findElement(revealInputButtonLocator).click();

//        wait.until(d -> {
//            d.findElement(revealedInputLocator).sendKeys("Mohamed");
//            return true;
//        });

//        String actualValue = driver.findElement(revealedInputLocator).getDomProperty("value");
        String expectedValue = "Mohamed";

//        Assert.assertEquals(actualValue, expectedValue, "The value in the input field is not as expected.");


    }


    @BeforeMethod
    public void beforeMethod() {
//        driver = new ChromeDriver();
//        wait = new FluentWait<>(driver)
//                .withTimeout(Duration.ofSeconds(2))
//                .pollingEvery(Duration.ofMillis(300))
//                .ignoring(ElementNotInteractableException.class);
    }

    @AfterMethod
    public void afterMethod() {
//        driver.quit();
    }
}

