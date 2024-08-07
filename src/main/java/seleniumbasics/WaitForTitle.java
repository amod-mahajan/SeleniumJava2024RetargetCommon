package seleniumbasics;

import org.openqa.selenium.WebDriver;

import java.util.function.Function;

public class WaitForTitle implements Function<WebDriver,Boolean> {

    @Override
    public Boolean apply(WebDriver webDriver) {
        String currTitle = webDriver.getTitle();
        return !currTitle.equalsIgnoreCase(ExplicitWaitExample.oldTitle);
    }
}
