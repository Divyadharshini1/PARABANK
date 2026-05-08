package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.RegisterPage;

public class LoginTest extends BaseTest {

    @DataProvider(name = "loginData")

    public Object[][] loginData() {

        return new Object[][]{

                {"wrongUser", "wrongPass"}
        };
    }

    @Test

    public void verifySuccessfulRegistrationAndLogin() {

        RegisterPage registerPage = new RegisterPage(driver);

        String username = "user" + System.currentTimeMillis();

        String password = "test123";

        registerPage.registerUser(username, password);

        LoginPage loginPage = new LoginPage(driver);

        loginPage.login(username, password);

        Assert.assertTrue(driver.getPageSource().contains("Accounts Overview"));
    }

    @Test
    public void verifyFundTransfer() {

        LoginPage loginPage = new LoginPage(driver);

        loginPage.login(username, password);

        Assert.assertTrue(loginPage.isLoginSuccessful());
    }
}
