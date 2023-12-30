package pages;

import org.openqa.selenium.WebDriver;

public class ObjectFactory {
    private final WebDriver driver;
    private LoginPage loginPage;
    private MerchantPage merchantPage;

    public ObjectFactory(WebDriver driver) {
            this.driver = driver;
        }

    public LoginPage getLoginPage() {
        if (loginPage == null) {
            loginPage = new LoginPage(driver);
        }
        return loginPage;
    }

    public MerchantPage getMerchantPage(){
        if (merchantPage == null){
            merchantPage = new MerchantPage(driver);
        }
        return merchantPage;
    }
}
