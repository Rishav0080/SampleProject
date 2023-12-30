package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import tests.BaseTest;

public class MerchantPage extends BaseTest {

    @FindBy(xpath = "//button[contains(text(),'Add Merchant')]")
    private WebElement addMerchantButton;

    @FindBy(xpath = "//section//a[@href='/resources/reviews']")
    private WebElement reviewsSection;

    @FindBy(xpath = "//div[contains(text(),'Latest reviews')]")
    private WebElement sortByViewReviews;

    @FindBy(xpath = "//a[@href='/resources/team-management']")
    private WebElement teamManagement;

    @FindBy(xpath = "//button[contains(text(),'Add Team Member')]")
    private WebElement addTeamMember;

//    @FindBy(xpath = "")
//    private WebElement ;

    public MerchantPage(WebDriver driver){
        org.openqa.selenium.support.PageFactory.initElements(driver, this);
    }

    public void addMerchantIsVisibleOrNot(){
        addMerchantButton.isDisplayed();
    }

    public void reviewsSection(){
        reviewsSection.click();
        sortByViewReviews.isDisplayed();
    }

    public void teamManagement(){
        teamManagement.click();
        addTeamMember.isDisplayed();
    }
}
