package tests;

import org.testng.annotations.Test;

import static configuration.context.WebDriverContext.*;
import static data.User.*;
import static org.testng.Assert.*;

public class LoginTests extends BaseTest {

    @Test
    void verifyCorrectCredentialLogIn() {
        loginPage
                .login(DEFAULT_USER);
        assertNotEquals
                (SWAG_LABS_URL, getDriver().getCurrentUrl());
    }

    @Test
    void verifyIncorrectCredentialLogIn() {
        loginPage
                .login(INCORRECT_USER);
        assertTrue
                (loginPage.isErrorMessageExists());
    }
}
