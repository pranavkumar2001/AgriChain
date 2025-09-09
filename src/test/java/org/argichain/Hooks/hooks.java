package org.argichain.Hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.argichain.driverFactory.webDriverManager;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class hooks {

    private webDriverManager driverFactory;
    private WebDriver driver;

    // Hook method to initialize the WebDriver before test execution
    @Before(order = 0)
    public void setUpBrowser() {
        driverFactory = new webDriverManager();
        driver = driverFactory.init_Driver("Chrome");
        webDriverManager.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    // Hook method to quit the browser after test execution
    @After(order = 0)
    public void quitBrowser() {
        driver.quit();
    }


}
