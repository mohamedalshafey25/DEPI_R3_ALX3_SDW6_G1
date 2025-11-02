package automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

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

    @Test ()
    public void test1_driverMethods() {
        driver.get("");
        driver.navigate().to("");
        driver.findElement(userNameLocator).click();
        driver.findElement(userNameLocator).clear();
        driver.findElement(userNameLocator).sendKeys("");
        driver.findElement(userNameLocator).getText();
        driver.findElement(userNameLocator).getAttribute(""); // Deprecated
        driver.findElement(userNameLocator).getDomAttribute("placeholder");
        driver.findElement(userNameLocator).getDomProperty("value");
        driver.findElement(userNameLocator).getCssValue("color");

        driver.findElement(userNameLocator).isDisplayed();
        driver.findElement(userNameLocator).isEnabled();
        driver.findElement(userNameLocator).isSelected();

        driver.getWindowHandle();
        driver.getWindowHandles();
        driver.switchTo().window("").close();
        driver.switchTo().activeElement().click();
        driver.switchTo().alert().accept();
        driver.switchTo().alert().dismiss();
        driver.switchTo().alert().sendKeys("Mohamed");
        driver.switchTo().alert().getText();

        Alert alert = driver.switchTo().alert();
        alert.accept();




    }

    @Test (dependsOnMethods = "test1")
    public void test2() {

    }

    @Test ()
    public void test3() {

    }

    @Test ()
    public void test4() {

    }

    @Test (dependsOnMethods = {"test1", "test2", "test3", "test4"},
            groups = "finalTestGroup")
    public void test5() {

    }

    @Test (dependsOnMethods = {"test1","test2","test3"},
    enabled = false,
    groups = "finalTestGroup")

    public void test6() {

    }


    @Test
    public void testSelectFromDropDownList() {
        driver.navigate().to("https://the-internet.herokuapp.com/dropdown");
        By dropDownLocator = By.id("dropdown");
        Select select = new Select(driver.findElement(dropDownLocator));
        select.getOptions();
        select.selectByValue("Option 1");


//        driver.findElement(dropDownLocator).getText();
//        driver.findElement(dropDownLocator).getDomAttribute("");
//        driver.findElement(dropDownLocator).getDomProperty("");


    }


    // Options

    @BeforeMethod
    public void setup() {
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--start-maximized")  // --start-maximized , --window-size=1920,1080, --incognito , --disable-infobars, --disable-notifications , --disable-popup-blocking,
//                .setImplicitWaitTimeout(Duration.ofSeconds(10));
//        driver = new ChromeDriver(options);


        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
        // Added implicit wait to solve NoSuchElementException
        // this rule applies to every subsequent call to driver.findElement() for the life of the driver session.
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
//        driver.close();
    }




}
