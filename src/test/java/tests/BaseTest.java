package tests;

import businessObjects.LoginActions;
import pages.BurgerMenu;
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

	@BeforeMethod
	@Parameters(value = {"browser"})
	  void setup(BrowsersFactory browser){
		WebDriver driver = browser.createDriver();
		setDriver(driver);
		generalPage = getInstance(GeneralPage.class);
		loginPage = getInstance(LoginActions.class);
		catalogPage = getInstance(CatalogPage.class);
		burgerMenu = getInstance(BurgerMenu.class);
		driver.get(SWAG_LABS_URL);
	}

//	@AfterMethod
//	public void wrapUp() {
//		if (getDriver() != null) {
//			getDriver().close();
//			getDriver().quit();
//		}
//	}
}
