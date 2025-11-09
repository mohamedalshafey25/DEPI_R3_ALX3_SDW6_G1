package modularTesting.botAndAbstract;

import engine.Bot;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class TestCase {
    Bot bot;

    @BeforeMethod
    public void beforeMethod() {
        bot = new Bot();
    }

    @AfterMethod
    public void afterMethod() {
        bot.quit();
    }
}
