package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class DuckDuckGoTest {
    WebDriver driver;
    Wait<WebDriver> wait;

    @Test
    public void navigateToDuckDuckGOAndVerifyLogo() {
        driver.navigate().to("https://duckduckgo.com/");
        By duckDuckGOLogoLocator = By.xpath("//div[contains(@class,'headerWrapDesktop')]//img");
        driver.findElement(duckDuckGOLogoLocator).click();
        String actualtPageTitle = driver.getTitle();
        String expectedPageTitle = "DuckDuckGo - Protection. Privacy. Peace of mind.";
//        Assert.assertEquals(actualtPageTitle, expectedPageTitle);
        Assert.assertTrue(actualtPageTitle.contains("DuckDuckGo"));
    }

    @Test
    public void navigateToDuckDuckGOAndVerifyFirstSearchResult() {
        By searchInputLocator = By.xpath("//input[@id='searchbox_input']");
        By searchButtonLocator = By.xpath("//button[contains(@class,'iconButton')][@type='submit']");
        By firstSearchResultLocator = By.xpath("(//h2/a)[1]");
        String expectedFirstSearchResultLink = "https://www.selenium.dev/documentation/webdriver/";

        driver.navigate().to("https://duckduckgo.com/");
        driver.findElement(searchInputLocator).sendKeys("Selenium WebDriver");
        driver.findElement(searchButtonLocator).click();
        String actualFirstSearchResultLink = driver.findElement(firstSearchResultLocator).getDomAttribute("href");

        wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        Assert.assertEquals(actualFirstSearchResultLink, expectedFirstSearchResultLink);

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
