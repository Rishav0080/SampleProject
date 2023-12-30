package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddUSer {

    @FindBy(xpath = "//input[@name='fullName']")
    private WebElement fullName;
    @FindBy(xpath = "//a[contains(text(),'Delete Merchant')]")
    private WebElement deleteMerchant;
    @FindBy(xpath = "//button[contains(text(),'Yes')]")
    private WebElement yesButton;
    @FindBy(xpath = "//input[@name='companyName']")
    private WebElement companyName;
    @FindBy(xpath = "//input[@name='website']")
    private WebElement websiteName;
    @FindBy(xpath = "//*[@id='businessType']")
    private WebElement BusinessType;
    @FindBy(xpath = "//*[@id='businessType']/option[6]")
    private WebElement businessTypeOption6;
    @FindBy(xpath = "//input[@name='autocompleteAddress']")
    private WebElement enterBusinessName;
    @FindBy(xpath = "//input[@name='email']")
    private WebElement enterEmail;
    @FindBy(xpath = "//input[@name='phoneNumber']")
    private WebElement enterPhoneNumber;
    @FindBy(xpath = "//input[@name='city']")
    private WebElement enterCity;
    @FindBy(xpath = "//input[@name='country']")
    private WebElement enterCountry;
    @FindBy(xpath = "//select[@id='country']/option[@value='USA']")
    private WebElement selectCountryUSA;
    @FindBy(xpath = "//input[@name='postalCode']")
    private WebElement enterPostalCode;

    private final String CONTINUE_BUTTON = ("//button[text()='Continue']");
    private final String PACKAGE_PURCHASED = ("(//select[@id='plan.package']/option)[2]");
    private final String CONTRACT_LENGTH = ("//section[@class='sc-dIsUp sc-fIxmyt hqtgkk epZFGC admin-bro_Box']//input[@name='plan.contractLength']");
    private final String CONTRACT_START_DATE = ("//section[@data-testid='property-edit-plan.contractStartDate']//input");
    private final String CONTRACT_DATE = ("//div[@class='react-datepicker__month-container']//div[@class='react-datepicker__day react-datepicker__day--028']");
    private final String CALENDER_ICON = ("//button[@type='button']//span[@class='sc-giAqHp kSMzvt admin-bro_Icon']");
    private final String SALES_REPRESENTATIVES = ("(//div[@class='sc-cKRKFl dKrfci undefined variant-default ']//select[@id='salesRep']/option)[2]");
    private final String SELECT_SOURCE = ("(//select[@id='plan.source']/option)[2]");
    private final String COMMENTS = ("//textarea[@class='sc-crzoAE sc-hGwcmR dZbUjF bDFDBJ textarea-default']");
    private final String DANDY_REQUEST_PER_MONTHS = ("//section[@class='sc-dIsUp sc-fIxmyt hqtgkk epZFGC admin-bro_Box']//input[@id='plan.requestsPerMonth']");
    private final String SMS_LIMIT = ("//section[@class='sc-dIsUp sc-fIxmyt hqtgkk epZFGC admin-bro_Box']//input[@id='smsCredits']");
    private final String ALLOW_DANDY_COMMENTING_ON_REVIEWS = ("//section[@data-testid='property-edit-plan.allowCommentingOnReview']");
    private final String ADDITIONAL_REVIEW_SITE = ("//section[@data-testid='property-edit-plan.addOnAdditionalReviewSite']");
    private final String COMMENTING_ON_REVIEW_SITE = ("//section[@data-testid='property-edit-plan.addOnCommenting']");
    private final String ADD_ON_QR_CODE = ("//section[@data-testid='property-edit-plan.addOnQrCode']");
    private final String REQUEST_REVIEW_SURVEYS = ("//section[@data-testid='property-edit-plan.addOnSurveyRequest']");
    private final String ADD_LOCATION = ("//button[contains(text(),'Add Location')]");
    private final String ENTER_BUSINESS_NAME_ADD_LOCATION = ("//input[@placeholder='Enter Business Name']");
    private final String ENTER_GOOGLE_BUSINESS_NAME = ("//input[@placeholder='Google Business Name']");
    private final String ENTER_YELP_BUSINESS_NAME = ("//input[@placeholder='Yelp Business Name']");
    private final String ENTER_FACEBOOK_BUSINESS_NAME = ("//input[@placeholder='Facebook Business Name']");
    private final String ENTER_TRIP_ADVISOR_NAME = ("//input[@placeholder='Tripadvisor Business Name']");
    private final String SELECT_COUNTRY_AUSTRALIA = ("(//div[@class='sc-cKRKFl dKrfci undefined variant-default ']//select[@id='country']/option)[2]");
    private final String ENTER_CITY_NAME_ADD_LOCATION = ("//input[@id='city']");
    private final String ENTER_POSTAL_CODE_ADD_LOCATION = ("//input[@id='postalCode']");
    private final String SELECT_YELP_EMAIL = ("(//div[@class='sc-amkrK fWsdaZ undefined variant-default ']//select[@id='yelpEmail']//option)[2]");
    private final String SELECT_GMB_EMAIL = ("(//div[@class='sc-cKRKFl dKrfci undefined variant-default ']//select[@id='gmbEmail']");
    private final String SELECT_REVIEW_VIO_EMAIL = ("//option[@value='reviewviohelp@gmail.com']");
    private final String SAVE_LOCATION = ("//button[contains(text(),'Save Location')]");
    private final String CONTINUE_BUTTON_PLAN_PREFERENCES = ("//button[contains(text(),'Continue')]");
    private final String MARKETING_REPUTATION_MANAGEMENT_SOFTWARE_USED = ("//input[@id='softwaresUsed']");
    private final String REVIEW_ADDED_DATE = ("//div[@class='sc-hiKfDv sc-jcwpoC hUyGgl iyNsIO admin-bro_DatePicker normal']/input");
    private final String MARKETING_REPUTATION_MANAGEMENT_SOFTWARE_AND_ADS = ("//input[@id='softwaresCost']");
    private final String SAVE_MERCHANT = ("//button[@data-testid='button-submit']");
    private final String CREATED_MERCHANT_SUCCESSFULLY = ("//*[contains(text(),'successfully')]");
}
