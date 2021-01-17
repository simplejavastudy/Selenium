package com.creativebangla;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;

public class BasicsSelenium {
    public static void main(String[] args) {

        // Open browser
        System.setProperty("webdriver.chrome.driver",
                "D://Java/Downloads/Selenium Jars and Drivers/Drivers/ChromeDriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // Navigate to the URL
        driver.get("https://www.bestbuy.com");
//        driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
        driver.close();

        // 1. Open Browser
        System.setProperty("webdriver.gecko.driver", "D://Java/Downloads/Selenium Jars and Drivers/Drivers/FireFoxDriver/geckodriver.exe");
        WebDriver driver1 = new FirefoxDriver();

        driver1.get("https://www.facebook.com");

        driver1.manage().timeouts().implicitlyWait(6000,TimeUnit.MILLISECONDS);
        driver1.quit();
    }
}