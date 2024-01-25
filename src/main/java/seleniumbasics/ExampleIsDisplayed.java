package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExampleIsDisplayed {
    public static void main(String[] args) {
        ChromeDriver chromeDriver = new ChromeDriver();
//        chromeDriver.get("C:\\Users\\amodm\\IdeaProjects\\SeleniumMavenRC\\src\\main\\resources\\htmlpages\\DisplayExample.html");
//
//        WebElement btn1 = chromeDriver.findElement(By.id("btn1"));
//        System.out.println(btn1.isDisplayed());
//
//        WebElement btn2 = chromeDriver.findElement(By.id("btn2"));
//        System.out.println(btn2.isDisplayed());
//        //btn2.click();
//        chromeDriver.quit();

        chromeDriver.get("C:\\Users\\amodm\\IdeaProjects\\SeleniumMavenRC\\src\\main\\resources\\htmlpages\\HideElement.html");

        WebElement btn1 = chromeDriver.findElement(By.className("btn1"));
        System.out.println(btn1.isDisplayed());
        btn1.click();

        WebElement btn2 = chromeDriver.findElement(By.className("btn2"));
        System.out.println(btn2.isDisplayed());

    }
}
