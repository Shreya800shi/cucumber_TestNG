package stepdefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.LoginPage;
import utils.DriverFactory;

public class LoginSteps {

    WebDriver driver = DriverFactory.getDriver();
    LoginPage loginPage;

    @Given("user is on login page")
    public void openLoginPage() {
        driver.get("https://practicetestautomation.com/practice-test-login/");
        loginPage = new LoginPage(driver);
    }

    @When("user enters username {string} and password {string}")
    public void enterCredentials(String user, String pass) {
        loginPage.enterUsername(user);
        loginPage.enterPassword(pass);
        loginPage.clickSubmit();
    }

    @Then("user should be logged in successfully")
    public void verifyLogin() {
        Assert.assertTrue(loginPage.isLoginSuccessful());
    }
}
