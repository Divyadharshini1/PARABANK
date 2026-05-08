package  tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BillPayPage;
import pages.RegisterPage;

public class FormValidationTest extends BaseTest {

    @Test

    public void verifyEmptyRegistrationValidation() {

        RegisterPage registerPage =
                new RegisterPage(driver);

        registerPage.clickRegisterWithoutData();

        Assert.assertTrue(
                driver.getPageSource()
                        .contains("is required")
        );
    }

    @Test

    public void verifyEmptyBillPayValidation() {

        BillPayPage billPayPage =
                new BillPayPage(driver);

        billPayPage.submitEmptyBillPayForm();

        Assert.assertTrue(
                driver.getPageSource()
                        .contains("required")
        );
    }
}
