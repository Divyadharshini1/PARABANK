package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountPage extends BasePage {

    public AccountPage(WebDriver driver) {
        super(driver);
    }

    private By accountOverviewTitle =
            By.xpath("//h1[contains(text(),'Accounts Overview')]");

    public boolean isAccountOverviewDisplayed() {
        return driver.findElement(accountOverviewTitle).isDisplayed();
    }
}