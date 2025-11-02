package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class StartAutomation {

    WebDriver driver;
    ChromeDriver driver2;

    @Test
    public void openSauceDemo() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.saucedemo.com/v1/index.html");

        // Locate element
        By usernameLocator = By.id("user-name");
        By passwordLocator = By.name("password");
        By loginButtonLocator = By.className("btn_action");

        // id #id
        By x = By.cssSelector("#user-name");
        // class .className
        // tagname tagName
        // [attribute='value']


        // Interact with element
        driver.findElement(usernameLocator).clear();
        driver.findElement(usernameLocator).sendKeys("standard_user");

        driver.findElement(passwordLocator).clear();
        driver.findElement(passwordLocator).sendKeys("secret_sauce");

        driver.findElement(loginButtonLocator).click();

        driver.quit();
    }




    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver2 = new ChromeDriver();

        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }


}
