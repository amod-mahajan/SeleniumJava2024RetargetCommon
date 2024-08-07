package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.RemoteWebElement;

import java.io.File;
import java.io.IOException;

public class CapturedScreenshotOfWebElement {

    public static void main(String[] args) throws IOException, InterruptedException {

        WebDriver d = new FirefoxDriver();
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://practicesoftwaretesting.com/");

//     WebElement logo =  chromeDriver.findElement(By.xpath("//a[@title='Practice Software Testing - Toolshop']"));
//
//     File logoScreenshot = logo.getScreenshotAs(OutputType.FILE);
//
//        FileHandler.copy(logoScreenshot, new File("src/main/resources/screenshots/chrome5.png"));

        WebElement header = chromeDriver.findElement(By.xpath("//h4[text()='By brand:']"));

        RemoteWebElement header1 = (RemoteWebElement) header;

        File headerSS = header1.getScreenshotAs(OutputType.FILE);

        FileHandler.copy(headerSS, new File("src/main/resources/screenshots/chrome6.png"));
    }
}
