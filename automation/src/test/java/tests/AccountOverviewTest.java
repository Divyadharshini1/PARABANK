package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.AccountPage;
import pages.LoginPage;

public class AccountOverviewTest extends BaseTest {

    @Test
    public void verifyAccountOverview() {

        LoginPage loginPage = new LoginPage(driver);

        loginPage.login(username, password);

        AccountPage accountPage = new AccountPage(driver);

        Assert.assertTrue(
                accountPage.isAccountOverviewDisplayed()
        );
    }
}