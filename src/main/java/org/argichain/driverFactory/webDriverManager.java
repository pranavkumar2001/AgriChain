package org.argichain.driverFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Hashtable;
import java.util.Map;

public class webDriverManager {

    public static ThreadLocal<WebDriver> tldriver = new ThreadLocal<WebDriver>();

    /**
     * This method is used to initialize the thread local driver on the basis of
     * given browser
     *
     * @param browser
     * @return
     */
    public WebDriver init_Driver(String browser) {
        //implemented only chromedriver initialisation
        System.out.println("Driver to initialize = " + browser);
        System.out.println("Driver to initialize = " + browser);

        WebDriver driver;

        // Set Chrome preferences for downloads
        Map<String, Object> preferences = new Hashtable<String, Object>();
        preferences.put("profile.default_content_settings.popups", 0);
        preferences.put("download.prompt_for_download", "false");
        preferences.put("download.default_directory", System.getProperty("user.dir") + "\\downloads\\");
        System.out.println("download Path------" + System.getProperty("user.dir") + "\\downloads\\");

        // Configure ChromeOptions with the preferences
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", preferences);
        options.setCapability(ChromeOptions.CAPABILITY, options);

        // Initialize ChromeDriver with the configured options
        driver = new ChromeDriver(options);

        // Store the driver instance in a ThreadLocal variable
        tldriver.set(driver);
        System.out.println("Chrome Browser has been set.");

        // Perform browser setup
        getDriver().manage().deleteAllCookies();
        getDriver().manage().window().maximize();

        // Return the configured WebDriver instance
        return getDriver();
    }
    /**
     * This is used to get the driver using thread local
     *
     * @return
     */
    public static synchronized WebDriver getDriver() {
        return tldriver.get();
    }

}
