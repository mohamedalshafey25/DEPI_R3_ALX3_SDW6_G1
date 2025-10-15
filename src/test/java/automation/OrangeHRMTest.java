package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OrangeHRMTest {

    WebDriver driver;

    By userNameLocator = By.xpath("//input[@name='username']");
    By passwordLocator = By.xpath("//input[@type='password']");
    By loginButtonLocator = By.xpath("//button[@type='submit']");
    By dashboardHeaderLocator = By.xpath("//header//h6");

    String expectedHeaderText = "Dashboard";


    @Test
    public void a1_validLoginTest() {
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        driver.findElement(userNameLocator).sendKeys("Admin");
        driver.findElement(passwordLocator).sendKeys("admin123");
        driver.findElement(loginButtonLocator).click();
        String actualHeaderText = driver.findElement(dashboardHeaderLocator).getText();

        Assert.assertEquals(actualHeaderText, expectedHeaderText,"Header is not Dashboard !");
    }

    @Test
    public void a2_invalidLoginUserNameTest() {
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.findElement(userNameLocator).sendKeys("WrongUserName");
        driver.findElement(passwordLocator).sendKeys("admin123");
        driver.findElement(loginButtonLocator).click();

        String actualTitle = driver.getTitle();

//        Assert.assertNotEquals(actualHeaderText, expectedHeaderText);
    }

    @Test
    public void a3_invalidLoginPasswordTest() {
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.findElement(userNameLocator).sendKeys("Admin");
        driver.findElement(passwordLocator).sendKeys("WrongPassword");
        driver.findElement(loginButtonLocator).click();
        String actualHeaderText = driver.findElement(dashboardHeaderLocator).getText();

        Assert.assertNotEquals(actualHeaderText, expectedHeaderText);
    }


    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
        // Added implicit wait to solve NoSuchElementException
        // this rule applies to every subsequent call to driver.findElement() for the life of the driver session.

    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }




}
