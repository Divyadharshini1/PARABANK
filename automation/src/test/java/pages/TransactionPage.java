package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TransactionPage extends BasePage {

    public TransactionPage(WebDriver driver) {

        super(driver);
    }

    By findTransactionsLink =
            By.linkText("Find Transactions");

    By amountField =
            By.id("criteria.amount");

    By findButton =
            By.id("findByAmount");

    public void searchTransaction(String amount) {

        click(findTransactionsLink);

        type(amountField, amount);

        click(findButton);
    }
}