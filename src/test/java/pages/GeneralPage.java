package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GeneralPage extends BasePage {

    @FindBy(id ="react-burger-menu-btn")
    private WebElement moreButton;
    @FindBy(id ="shopping_cart_container")
    private WebElement shoppingCartButton;


    public GeneralPage(WebDriver driver) {
        super(driver);
    }

    public boolean isMoreButtonExists(){
        return moreButton.isDisplayed();
    }

    public void clickMoreButton(){
        moreButton.click();
    }
    public void clickShoppingCartButton(){
        shoppingCartButton.click();
    }

    public WebElement getMoreButton() {
        return moreButton;
    }
}



