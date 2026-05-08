package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.RegisterPage;
import pages.TransactionPage;

public class TransactionSearchTest extends BaseTest {

    @Test
    public void verifyTransactionSearchByAmount() {

        RegisterPage registerPage = new RegisterPage(driver);

        String username = "user" + System.currentTimeMillis();
        String password = "test123";

        registerPage.registerUser(username, password);

        LoginPage loginPage = new LoginPage(driver);

        loginPage.login(username, password);

        TransactionPage transactionPage =
                new TransactionPage(driver);

        transactionPage.searchTransaction("100");

        Assert.assertTrue(
                driver.getPageSource()
                        .contains("Transaction Results")
        );
    }

    @Test
    public void verifyEmptyTransactionSearch() {

        RegisterPage registerPage = new RegisterPage(driver);

        String username = "user" + System.currentTimeMillis();
        String password = "test123";

        registerPage.registerUser(username, password);

        LoginPage loginPage = new LoginPage(driver);

        loginPage.login(username, password);

        TransactionPage transactionPage =
                new TransactionPage(driver);

        transactionPage.searchTransaction("");

        Assert.assertTrue(
                driver.getPageSource()
                        .contains("No transactions found")
        );
    }
}