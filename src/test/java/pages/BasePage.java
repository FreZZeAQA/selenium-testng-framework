package pages;

import java.time.Duration;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.support.ui.FluentWait;

import static org.openqa.selenium.support.PageFactory.*;

public class BasePage {

    protected  WebDriver driver;

    protected FluentWait<WebDriver> waiter;

    public BasePage(WebDriver driver) {
        super();
        this.driver = driver;
        initElements(driver, this);
        waiter = new FluentWait<>(driver)
                .ignoring(NoSuchElementException.class, WebDriverException.class)
                .withTimeout(Duration.ofSeconds(10));
    }
}
