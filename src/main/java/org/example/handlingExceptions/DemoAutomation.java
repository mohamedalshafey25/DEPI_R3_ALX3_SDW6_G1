package org.example.handlingExceptions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoAutomation {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://www.selenium.dev/");
        driver.findElement(By.id("Layer_111")).click(); // throw NoSuchElementException

        driver.quit();
    }
}
