package seleniumbasics;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class CaptureFullPageScreenshotFirefox {
    public static void main(String[] args) throws IOException, InterruptedException {
        FirefoxDriver firefoxDriver = new FirefoxDriver();
        firefoxDriver.get("https://news.google.com/");
        Thread.sleep(10000);

        File fullPageScreenshotAs = firefoxDriver.getFullPageScreenshotAs(OutputType.FILE);
        FileHandler.copy(fullPageScreenshotAs, new File("src/main/resources/screenshots/firefox1.png"));


        firefoxDriver.quit();
    }
}
