package seleniumbasics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LauchBrowsers {

    public static void main(String[] args) throws InterruptedException {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setBinary("C:\\Users\\amodm\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
        ChromeDriver chromeDriver = new ChromeDriver(chromeOptions);
        //FirefoxDriver chromeDriver = new FirefoxDriver();
        Thread.sleep(10000);
        chromeDriver.get("https://www.selenium.dev/");
        String title = chromeDriver.getTitle();
        System.out.println("Title is " + title);
        chromeDriver.quit();
    }
}
