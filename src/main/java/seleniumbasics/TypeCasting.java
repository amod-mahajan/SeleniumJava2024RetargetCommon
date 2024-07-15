package seleniumbasics;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TypeCasting {

    public static void main(String[] args) {

//        ChromeDriver driver = new ChromeDriver();
//        driver.get("https://www.google.com");
//
//        driver.executeScript("");
//
//        driver.getScreenshotAs()

//        GetBrowser getBrowser = new GetBrowser();
//        ChromeDriver driver = getBrowser.getChrome();
//
//        driver.executeScript("");
//        driver.getScreenshotAs(OutputType.FILE);

        //FirefoxDriver driver = new ChromeDriver();

        GetBrowser getBrowser = new GetBrowser();
        WebDriver driver = getBrowser.getBrowser("chrome");

//        driver.executeScript("");
//        driver.getScreenshotAs(OutputType.FILE);

//        RemoteWebDriver driver1 = (RemoteWebDriver) driver;
//        driver1.executeScript("");
//        driver1.getScreenshotAs(OutputType.FILE);

        TakesScreenshot driver1 = (TakesScreenshot) driver;
        driver1.getScreenshotAs(OutputType.FILE);

        JavascriptExecutor driver2 = (JavascriptExecutor) driver;
        driver2.executeScript("");



    }
}
