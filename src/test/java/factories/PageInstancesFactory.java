package factories;

import java.lang.reflect.InvocationTargetException;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

import static configuration.context.WebDriverContext.*;

public class PageInstancesFactory {

	public static <T extends BasePage> T getInstance(Class<T> type) {
		try {
			return type.getConstructor(WebDriver.class).newInstance(getDriver());
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
				| NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
			return null;
		}
	}
}
