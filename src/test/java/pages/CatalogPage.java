package pages;

import data.AddToCartButtons;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CatalogPage extends BasePage {

    @FindBy(xpath = "//select[@class = 'product_sort_container']")
    private WebElement productDropDownList;
    @FindBy(xpath = "//button[@name]")
    private List<WebElement> addToCardButtons;
    @FindBy(xpath = "//button[@class='btn btn_secondary btn_small btn_inventory']")
    private List<WebElement> removeButtons;
    @FindBy(xpath = "//option[@value]")
    private List<WebElement> optionButtons;

    @FindBy(linkText = "Sauce Labs Backpack")
    private WebElement BackPack;

    public CatalogPage(WebDriver driver) {
        super(driver);
    }

    public void addProductToCart(AddToCartButtons product) {
        addToCardButtons
                .stream()
                .filter(webElement -> webElement.getAttribute("name")
                        .equals(product.getIdValue()))
                .findFirst().get().click();
    }

    public void clickProductDropDownList() {
        productDropDownList.click();
    }

    public void clickOnFilterOption(CatalogFilterOptions filterOption) {
        optionButtons
                .stream()
                .filter(webElement -> webElement.getAttribute("value")
                        .equals(filterOption.getOptionValue()))
                .findFirst().get().click();
    }

    public boolean isFilterOptionSelected(CatalogFilterOptions filterOption) {
        return optionButtons
                .stream()
                .filter(webElement -> webElement.getAttribute("value")
                        .equals(filterOption.getOptionValue()))
                .findFirst().get().isSelected();
    }

    public boolean isRemoveButtonsExist() {
        return removeButtons.size() > 0;
    }

    public boolean isProductDropDownListExists(){
        return productDropDownList.isDisplayed();
    }
}
