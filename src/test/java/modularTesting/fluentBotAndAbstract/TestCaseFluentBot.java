package modularTesting.fluentBotAndAbstract;

import engine.FluentBot;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class TestCaseFluentBot {
    FluentBot bot;

    @BeforeMethod
    public void beforeMethod() {
        bot = new FluentBot();
    }

    @AfterMethod
    public void afterMethod() {
        bot.quit();
    }
}
