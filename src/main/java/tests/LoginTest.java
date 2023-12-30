package tests;

import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test()
    public void verifyLoginDetails() throws InterruptedException {
        objectFactory.getLoginPage().loginIntoApplication();
    }

    @Test(priority = 1)
    public void verifySuccessfulLogIn() {
        objectFactory.getLoginPage().verifySuccessfulLogin();
    }
}