package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {

    // Method to create WebDriver object based on browser type
//    public WebDriver getWebDriver(String browserType) {
//        WebDriver driver = null;
//
//        switch (browserType.toLowerCase()) {
//            case "chrome" -> {
//                WebDriverManager.chromedriver().setup(); // Chromedriver
//                driver = new ChromeDriver();
//            }
//            case "firefox" -> {
//                WebDriverManager.firefoxdriver().setup(); //geckodriver
//                driver = new FirefoxDriver();
//            }
//            default -> System.out.println("Invalid browser type!");
//        }
//
//        return driver;
//    }
}
