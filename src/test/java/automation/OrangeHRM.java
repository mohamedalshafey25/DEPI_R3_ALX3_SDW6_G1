package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OrangeHRM {
    WebDriver driver;

//    @Test
//    public void validLoginTest() {
//        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//
//        By userNameLocator = By.xpath("//input[@name='username']");
//        By passwordLocator = By.xpath("//input[@type='password']");
//        By loginButtonLocator = By.xpath("//button[@type='submit']");
//    }

    @Test
    public void navigateToDuckDuckGOAndVerifyLogo() {
        driver.navigate().to("https://duckduckgo.com/");
        By duckDuckGOLocator = By.xpath("//div[contains(@class,'headerWrapDesktop')]//img");
        driver.findElement(duckDuckGOLocator).click();
        String actualtPageTitle = driver.getTitle();
        String expectedPageTitle = "DuckDuckGo - Protection. Privacy. Peace of mind.";
//        Assert.assertEquals(actualtPageTitle, expectedPageTitle);
        Assert.assertTrue(actualtPageTitle.contains("DuckDuckGo"));
    }

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }


}
