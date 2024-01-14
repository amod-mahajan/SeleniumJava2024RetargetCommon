package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementExample {

    public static void main(String[] args) {

        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://practicesoftwaretesting.com/#/auth/login");

        WebElement emailTextBox = chromeDriver.findElement(By.id("email1"));
        boolean isPresent = emailTextBox.isDisplayed();
        System.out.println(isPresent);

    }
}
