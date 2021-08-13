
package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//i[@class='v-icon notranslate mdi mdi-account theme--light']")
    public WebElement accountIcon;

    @FindBy(xpath = "//input[@id='input-104']")
    public WebElement e_mail;

    @FindBy(xpath = "//input[@id='input-108']")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement firstLogin;



}

