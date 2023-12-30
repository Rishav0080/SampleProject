package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.ObjectFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class BaseTest {
    protected static Properties prop;
    public static WebDriver driver;
    protected ObjectFactory objectFactory;

    public BaseTest() {
        try {
            FileInputStream FI = new FileInputStream(System.getProperty("user.dir") + "/src/main/java/config/config.properties");
            prop = new Properties();
            prop.load(FI);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @BeforeClass
    public void preparePages() {
        objectFactory = new ObjectFactory(driver);
    }

    @BeforeClass
    public void initialization() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(prop.getProperty("baseUrl"));
    }

    @AfterClass
    public void tearDown() {
        driver.close();
    }
}
