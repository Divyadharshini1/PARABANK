package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    private By usernameField = By.name("username");

    private By passwordField = By.name("password");

    private By loginButton =
            By.xpath("//input[@value='Log In']");

    private By logoutLink =
            By.linkText("Log Out");

    public void login(String username, String password) {

        type(usernameField, username);

        type(passwordField, password);

        click(loginButton);
    }

    public boolean isLoginSuccessful() {

        return isDisplayed(logoutLink);
    }
}