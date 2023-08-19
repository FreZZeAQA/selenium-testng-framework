package businessObjects;

import data.User;
import pages.LoginPage;
import org.openqa.selenium.WebDriver;

public class LoginActions extends LoginPage {

    public LoginActions(WebDriver driver) {
        super(driver);
    }

    public void login(User user) {
        addUsername(user);
        addPassword(user);
        clickOnSignInButton();
    }
}
