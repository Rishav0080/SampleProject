package tests;

import org.testng.annotations.Test;

public class MerchantPageTest extends BaseTest{

    @Test()
    public void verifyLoginDetails() throws InterruptedException {
        objectFactory.getLoginPage().loginIntoApplication();
    }

    @Test(priority = 1)
    public void verifyAddMerchantIsVisibleOrNot(){
        objectFactory.getMerchantPage().addMerchantIsVisibleOrNot();
    }

    @Test(priority = 2)
    public void verifyReviewsSectionVisibility(){
        objectFactory.getMerchantPage().reviewsSection();
    }

    @Test(priority = 3)
    public void verifyTeamManagementVisibility(){
        objectFactory.getMerchantPage().teamManagement();
    }
}
