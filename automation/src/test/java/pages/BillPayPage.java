package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BillPayPage extends BasePage {

    private By billPayLink = By.linkText("Bill Pay");

    private By sendPaymentButton =
            By.xpath("//input[@value='Send Payment']");

    private By validationMessage =
            By.id("validationModel-firstName");

    public BillPayPage(WebDriver driver) {
        super(driver);
    }

    public void openBillPayPage() {
        click(billPayLink);
    }

    public void submitEmptyBillPayForm() {

        openBillPayPage();

        click(sendPaymentButton);
    }

    // Verify validation message
    public boolean isValidationDisplayed() {
        return isDisplayed(validationMessage);
    }
}