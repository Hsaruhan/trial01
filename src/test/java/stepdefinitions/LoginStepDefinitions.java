package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;
import pages.LoginPage;
import utilities.ConfigurationReader;
import utilities.Driver;

import java.util.ArrayList;
import java.util.List;

public class LoginStepDefinitions {

    LoginPage loginStepDefinitions= new LoginPage();


    @Given("Go tto bookzpro.com home page")
    public void go_tto_bookzpro_com_home_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("bookz_url"));
    }

    @Given("Click on the user Account menu")
    public void click_on_the_user_account_menu() {
        loginStepDefinitions.accountIcon.click();
    }
    @Given("Given user enters email address")
    public void given_user_enters_email_address() {
        loginStepDefinitions.e_mail.sendKeys(ConfigurationReader.getProperty("b_valid_mail"));
    }
    @Given("enter the user Password")
    public void enter_the_user_password() {
        loginStepDefinitions.password.sendKeys(ConfigurationReader.getProperty("b_valid_password"));
    }
    @Then("user Clicks Login button")
    public void user_clicks_login_button() {
        loginStepDefinitions.firstLogin.click();
    }


}
