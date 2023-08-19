package tests;

import data.AddToCartButtons;
import pages.CatalogFilterOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static data.AddToCartButtons.*;
import static pages.CatalogFilterOptions.*;
import static data.User.*;
import static org.testng.Assert.*;

public class CatalogTests extends BaseTest {


    @DataProvider
    public Object[][] dataSetOption() {
        return new Object[][]{
                {NAME_A_Z},
                {PRICE_LOW_HIGH},
                {NAME_Z_A},
                {PRICE_HIGH_LOW}
        };
    }

    @Test
    void verifyRemoveButtons() {
        loginPage
                .login(DEFAULT_USER);
        catalogPage
                .addProductToCart(T_SHIRT_RED);
        catalogPage
                .addProductToCart(BACKPACK);
        catalogPage
                .addProductToCart(BIKE_LIGHT);
        assertTrue
                (catalogPage.isRemoveButtonsExist());
    }

    @Test(dataProvider = "dataSetOption")
    void verifyIfFilterOptionSelected(CatalogFilterOptions option) {
        loginPage
                .login(DEFAULT_USER);
        catalogPage
                .clickProductDropDownList();
        catalogPage
                .clickOnFilterOption(option);
        assertTrue
                (catalogPage.isFilterOptionSelected(option));
    }
}
