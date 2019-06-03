package Util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.io.File;

import static Util.FrameworkProperties.*;

public class DriverFactory {

    private static WebDriver driver = null;

    public static WebDriver initialize(String scenario) {
        if (driver == null) {
            createNewDriverInstance(scenario);
        }
        return driver;
    }

    private static void createNewDriverInstance(String scenario) {
        String browser = get("browser");

        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "drivers" + File.separator + "chromedriver");
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--start-maximized");
            System.out.println();
            try {
                driver = new ChromeDriver(options);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        else if (browser.equalsIgnoreCase("firefox")) {
                System.setProperty("webdriver.gecko.driver", "drivers" + File.separator + "geckodriver.exe");
                FirefoxOptions option = new FirefoxOptions();
                driver = new FirefoxDriver(option);
                try {
                    driver = new FirefoxDriver(option);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
    }

    public static WebDriver getDriver() {
        return driver;
    }
}
