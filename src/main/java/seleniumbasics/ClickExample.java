package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Date;

public class ClickExample {

    public static void main(String[] args) {

        ChromeDriver chromeDriver = new ChromeDriver();
//        chromeDriver.get("https://practicesoftwaretesting.com/#/");
//        WebElement element = chromeDriver.findElement(By.linkText("Sign in"));
//
//        element.click();


        chromeDriver.get("https://www.cnn.com/");

        WebElement element = chromeDriver.findElement(By.partialLinkText("Terms of Use"));
        System.out.println(new Date());
        element.click();
        System.out.println(new Date());
        chromeDriver.quit();
    }
}