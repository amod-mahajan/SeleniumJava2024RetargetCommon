package seleniumbasics;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumArchLiveUnderstanding {
    public static void main(String[] args) {
        ChromeDriver chromeDriver = new ChromeDriver();

        chromeDriver.get("https://www.google.com/");

        String title = chromeDriver.getTitle();
        System.out.println(title);

        String currentUrl = chromeDriver.getCurrentUrl();
        System.out.println(currentUrl);

        chromeDriver.quit();
    }
}
