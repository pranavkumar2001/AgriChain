package org.argichain.BaseClass;

import org.argichain.driverFactory.webDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class BasePage {
    private WebDriver driver;

    // Constructor to initialize the WebDriver instance
    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    // Method to apply an implicit wait of 10 seconds for all elements
    public void implicitWait() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    // Method to click on a web element identified by the given locator
    public void clickOnButton(By locator) {
        driver.findElement(locator).click();
        System.out.println("Clicked on the button");
    }

    // Method to wait explicitly until the specified element becomes visible on the page
    public void waitForvisibilityOfElement(By locator) {
        WebDriverWait wait = new WebDriverWait(webDriverManager.getDriver(), Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        System.out.println("Waited for element to visible " + locator);
    }

    // Method to retrieve the value of a specific attribute from the given element
    public String getAttributeValue(By locator, String attribute) {
        String attributeValue = driver.findElement(locator).getAttribute(attribute);
        System.out.println("Attribute value --------------- " + attributeValue);
        return attributeValue;
    }

    // Method to wait for visibility and then send the provided value to the input field
    public void sendvalueToTextbox(By locator, String value) {
        waitForvisibilityOfElement(locator);
        driver.findElement(locator).sendKeys(value);
        System.out.println(value + "has been sent to " + locator);
    }

    // Method to navigate to a given URL using the WebDriver
    public void navigateToUrl(String url) {
        driver.get(url);
        System.out.println("Navigated to: " + url);
    }


}
