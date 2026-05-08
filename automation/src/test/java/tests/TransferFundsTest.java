package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import pages.TransferPage;

public class TransferFundsTest extends BaseTest {

    @Test
    public void verifyFundTransfer() {

        LoginPage loginPage = new LoginPage(driver);

        loginPage.login(username, password);

        TransferPage transfer = new TransferPage(driver);

        transfer.transferFunds();

        Assert.assertTrue(
                transfer.getSuccessMessage()
                        .contains("Transfer Complete")
        );
    }
}