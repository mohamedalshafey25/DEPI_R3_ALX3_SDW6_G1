package automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertTesting {

    WebDriver driver;

    @Test()
    public void test2_simpleAlert() {
        driver.navigate().to("https://moatazeldebsy.github.io/test-automation-practices/#/alerts");
        driver.findElement(By.xpath("//*[@data-test='alert-button']")).click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    @Test ()
    public void test3_confirmationAlert() {
        driver.navigate().to("https://moatazeldebsy.github.io/test-automation-practices/#/alerts");
        driver.findElement(By.xpath("//*[@data-test='confirm-button']")).click();
        Alert alert = driver.switchTo().alert();
//        alert.accept();
        alert.dismiss();
    }

    @Test ()
    public void test4_promptAlert() {
        driver.navigate().to("https://moatazeldebsy.github.io/test-automation-practices/#/alerts");
        driver.findElement(By.xpath("//*[@data-test='prompt-button']")).click();
        Alert alert = driver.switchTo().alert();
        alert.sendKeys("Mohamed");
        alert.accept();

    }

    // Switch To Frame
    @Test
    public void testClickButtonInFrame() {
        driver.navigate().to("https://moatazeldebsy.github.io/test-automation-practices/#/iframes");
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-test='iframe-iframe1']")));
        driver.findElement(By.xpath("//body/button")).click();
        driver.findElement(By.xpath("//body/button")).click();
        driver.findElement(By.xpath("//body/button")).click();
        driver.switchTo().parentFrame();

//        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-test='iframe-iframe1']"))).findElement(By.xpath("//body/button")).click();

    }

    // Manage Cookies
    @Test
    public void manageTest () {
        driver.manage().addCookie(new Cookie("myCookie","cookieValue"));
    }



    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }


}
