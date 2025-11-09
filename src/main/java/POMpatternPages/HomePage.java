package POMpatternPages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;

public class HomePage {

    // Locators and variables
    String url = "https://www.selenium.dev/selenium/web/dynamic.html";
    By revealInputButtonLocator = By.id("reveal");
    By revealedInputLocator = By.id("revealed");
    WebDriver driver;
    Wait<WebDriver> wait;
    String Username = "admin";
    String Password = "password";

    // Constructor
    public HomePage(WebDriver driver, Wait <WebDriver> wait) {
        this.driver = driver;
        this.wait = wait;
    }

    // Methods to interact with the page
    public void navigate() {
        this.driver.navigate().to(url);
    }

    public void revealHiddenInput() {
//        this.driver.findElement(revealInputButtonLocator).click();
        wait.until(d -> {
            d.findElement(revealInputButtonLocator).click();
            return true;
        });
    }
    public void insertTextIntoRevealedInput(String text) {
        wait.until(d -> {
            d.findElement(revealedInputLocator).sendKeys(text);
            return true;
        });
    }
    public String getRevealedInputValue() {
        return this.driver.findElement(revealedInputLocator).getDomProperty("value");
    }

}
