package tests;

import businessObjects.LoginActions;
import pages.BurgerMenu;
import pages.CartPage;
import pages.CatalogPage;
import pages.GeneralPage;
import factories.BrowsersFactory;
import org.openqa.selenium.WebDriver;

import org.testng.annotations.*;

import static configuration.context.WebDriverContext.*;
import static factories.PageInstancesFactory.*;

public class BaseTest{

	protected static final String SWAG_LABS_URL = "https://www.saucedemo.com/";

	protected GeneralPage generalPage;
	protected LoginActions loginPage ;
	protected CatalogPage catalogPage;
	protected BurgerMenu burgerMenu;
	protected CartPage cartPage;

	@BeforeMethod
	@Parameters(value = {"browser"})
	  void setup(BrowsersFactory browser){
		WebDriver driver = browser.createDriver();
		setDriver(driver);
		generalPage = getInstance(GeneralPage.class);
		loginPage = getInstance(LoginActions.class);
		catalogPage = getInstance(CatalogPage.class);
		burgerMenu = getInstance(BurgerMenu.class);
		cartPage = getInstance(CartPage.class);
		driver.get(SWAG_LABS_URL);
		driver.manage().window().maximize();
	}


	@AfterMethod
	public void wrapUp() {
		if (getDriver() != null) {
			getDriver().close();
			getDriver().quit();
		}
	}
}
