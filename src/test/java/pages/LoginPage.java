package pages;

import data.User;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
    @FindBy(id = "user-name")
    private WebElement usernameInput;
    @FindBy(id = "password")
    private WebElement passwordInput;
    @FindBy(id = "login-button")
    private WebElement signInButton;
    @FindBy(xpath ="//div[@class='error-message-container error']" )
    private WebElement errorMessage;
    @FindBy(xpath ="//div[@class='login_wrapper-inner']")
    private WebElement loginWrapper;



    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void addUsername(User user) { //incorrect methods name, Should be addUsername or setUsername
        usernameInput.sendKeys(user.getUSERNAME());
    }

    public void addPassword(User user) { //incorrect methods name, Should be addUsername or setUsername
        passwordInput.sendKeys(user.getPASSWORD());
    }

    public void clickOnSignInButton() { // Should be named for example: clickOnLoginBtn
        signInButton.click();
    }

    public WebElement getUsernameInput() {
        return usernameInput;
    }

    public WebElement getPasswordInput() {
        return passwordInput;
    }

    public WebElement getSignInButton() {
        return signInButton;
    }

    public WebElement getErrorMessage() {
        return errorMessage;
    }

    public boolean isErrorMessageExists() {
       return errorMessage.isDisplayed();
    }
}
