package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.BurgerOptions;

import static data.User.DEFAULT_USER;
import static org.testng.Assert.*;
import static pages.BurgerOptions.*;
import static pages.CatalogFilterOptions.*;
import static pages.CatalogFilterOptions.PRICE_HIGH_LOW;

public class BurgerMenuTests extends BaseTest {

    @DataProvider
    public Object[][] dataSetOption() {
        return new Object[][]{
                {ABOUT},
                {LOGOUT},
                {RESET_APP_STATE}
        };
    }

    @Test(dataProvider = "dataSetOption")
    void verifyBurgerOptions(BurgerOptions burgerOption) {
        loginPage
                .login(DEFAULT_USER);
        generalPage
                .clickMoreButton();
        burgerMenu
                .clickOnBurgerOption(burgerOption);
    }
}
