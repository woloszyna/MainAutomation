package Basis;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicOperations {

    public static WebDriver driver;

    public void OpenChrome() {
        System.setProperty("webdriver.chrome.driver", "WebDrivers/chromedriverv80");
        driver = new ChromeDriver();
        driver.get("http://demo-store.seleniumacademy.com/");
        driver.manage().window().maximize();
    }

    public void OpenFirefox() {
        System.setProperty("webdriver.firefox.driver", "WebDrivers/geckodriver");
        driver = new FirefoxDriver();
        driver.get("http://demo-store.seleniumacademy.com/");
        driver.manage().window().maximize();
    }

    public void Close() {

        driver.quit();

    }
}
