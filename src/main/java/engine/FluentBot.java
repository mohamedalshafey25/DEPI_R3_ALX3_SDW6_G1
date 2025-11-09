package engine;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class FluentBot {
    WebDriver driver;
    Wait<WebDriver> wait;

    public FluentBot(){
        driver = new ChromeDriver();
        wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(2))
                .pollingEvery(Duration.ofMillis(300))
                .ignoring(ElementNotInteractableException.class);
    }

    public FluentBot navigateTo(String url){
        driver.navigate().to(url);
        return this;
    }
    public FluentBot click(By locator){
        wait.until( d -> {
            d.findElement(locator).click();
            return true;
        });
        return this;
    }
    public FluentBot type(By locator, String text){
        wait.until( d -> {
            d.findElement(locator).clear();
            d.findElement(locator).sendKeys(text);
            return true;
        });
        return this;
    }
    public void quit() {
        driver.quit();
    }
    public String getDomProperty(By locator, String property) {
        return driver.findElement(locator).getDomProperty(property);
    }
}
