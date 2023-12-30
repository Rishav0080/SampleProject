package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import tests.BaseTest;

import java.time.Duration;

public class LoginPage extends BaseTest{

     @FindBy(xpath = "//input[@name='email']")
    private WebElement userNameField;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement userPasswordField;

    @FindBy(xpath = "//button[contains(text(),'Login')]")
    private WebElement loginButton;

    public LoginPage(WebDriver driver) {
        org.openqa.selenium.support.PageFactory.initElements(driver, this);
    }

    public void loginIntoApplication() throws InterruptedException {
//        baseTest.waitForPageLoad(driver, 60);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        userNameField.sendKeys(prop.getProperty("userName"));
        userPasswordField.sendKeys(prop.getProperty("userPassword"));
        loginButton.click();
        Thread.sleep(5000);
    }

    public void verifySuccessfulLogin() {
        Assert.assertEquals(driver.getTitle(), prop.getProperty("titleOfApplication"));
        Assert.assertEquals(driver.getCurrentUrl(), prop.getProperty("merchantsPageUrl"));
    }
}
