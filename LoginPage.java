package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    By username = By.id("username");
    By password = By.id("password");
    By submitBtn = By.id("submit");
    By successMsg = By.xpath("//h1[text()='Logged In Successfully']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterUsername(String user) {
        driver.findElement(username).sendKeys(user);
    }

    public void enterPassword(String pass) {
        driver.findElement(password).sendKeys(pass);
    }

    public void clickSubmit() {
        driver.findElement(submitBtn).click();
    }

    public boolean isLoginSuccessful() {
        return driver.findElement(successMsg).isDisplayed();
    }
}
