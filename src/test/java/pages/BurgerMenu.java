package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static org.openqa.selenium.By.*;

public class BurgerMenu extends BasePage {

    @FindBy(id = "react-burger-cross-btn")
    private WebElement closeMenuButton;

    public BurgerMenu(WebDriver driver) {
        super(driver);
    }

    public void clickOnBurgerOption(BurgerOptions burgerOption) {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript
                ("arguments[0].click();", driver.findElement(id(burgerOption.getOptionId())));
    }

    public boolean isCloseMenuButtonExists() {
        return closeMenuButton.isDisplayed();
    }
}
