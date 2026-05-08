package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage extends BasePage {

    WebDriver driver;

    public RegisterPage(WebDriver driver) {

        super(driver);

        this.driver = driver;
    }

    By registerLink = By.linkText("Register");
    By firstName = By.id("customer.firstName");
    By lastName = By.id("customer.lastName");
    By address = By.id("customer.address.street");
    By city = By.id("customer.address.city");
    By state = By.id("customer.address.state");
    By zipCode = By.id("customer.address.zipCode");
    By phone = By.id("customer.phoneNumber");
    By ssn = By.id("customer.ssn");
    By username = By.id("customer.username");
    By password = By.id("customer.password");
    By confirmPassword = By.id("repeatedPassword");
    By registerButton = By.xpath("//input[@value='Register']");

    public void registerUser(String user, String pass) {

        driver.findElement(registerLink).click();

        driver.findElement(firstName).sendKeys("Divya");
        driver.findElement(lastName).sendKeys("D");
        driver.findElement(address).sendKeys("Chennai");
        driver.findElement(city).sendKeys("Chennai");
        driver.findElement(state).sendKeys("TN");
        driver.findElement(zipCode).sendKeys("600001");
        driver.findElement(phone).sendKeys("9876543210");
        driver.findElement(ssn).sendKeys("12345");
        driver.findElement(username).sendKeys(user);
        driver.findElement(password).sendKeys(pass);
        driver.findElement(confirmPassword).sendKeys(pass);

        driver.findElement(registerButton).click();
    }

    public void clickRegisterWithoutData() {

        driver.findElement(registerLink).click();

        driver.findElement(registerButton).click();
    }
}
