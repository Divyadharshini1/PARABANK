package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TransferPage extends BasePage {

    public TransferPage(WebDriver driver) {

        super(driver);
    }

    By transferFundsLink =
            By.linkText("Transfer Funds");

    By amountField =
            By.id("amount");

    By fromAccount =
            By.id("fromAccountId");

    By toAccount =
            By.id("toAccountId");

    By transferButton =
            By.xpath("//input[@value='Transfer']");

    By successMessage =
            By.className("title");

    public void transferFunds() {

        click(transferFundsLink);

        type(amountField, "100");

        click(transferButton);
    }

    public String getSuccessMessage() {

        return driver.findElement(successMessage).getText();
    }
}