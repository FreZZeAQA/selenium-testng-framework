package factories;

import configuration.AbstractWebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public enum BrowsersFactory implements AbstractWebDriver {

    CHROME {
        @Override
        public WebDriver createDriver() {
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();
        }
    },
    EDGE {
        @Override
        public WebDriver createDriver() {
           WebDriverManager.edgedriver().setup();
            return new EdgeDriver();
        }
    }
}
