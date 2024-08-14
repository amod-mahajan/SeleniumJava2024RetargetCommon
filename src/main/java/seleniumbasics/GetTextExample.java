package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextExample {

    public static void main(String[] args) {

        ChromeDriver chromeDriver = new ChromeDriver();
       // chromeDriver.get("C:\\Users\\amodm\\IdeaProjects\\SeleniumJava2024RetargetCommon\\src\\main\\resources\\htmlpages\\GetTextExample.html");

//        WebElement ele = chromeDriver.findElement(By.tagName("h1"));
//        String text = ele.getText();
//        System.out.println(text);
//        chromeDriver.quit();

//        chromeDriver.get("C:\\Users\\amodm\\IdeaProjects\\SeleniumJava2024RetargetCommon\\src\\main\\resources\\htmlpages\\NestedInnerText.html");
//        System.out.println(chromeDriver.findElement(By.tagName("span")).getText());
//        chromeDriver.quit();

        chromeDriver.get("C:\\Users\\amodm\\IdeaProjects\\SeleniumJava2024RetargetCommon\\src\\main\\resources\\htmlpages\\HiddenInnerText.html");
        System.out.println(chromeDriver.findElement(By.id("li")).getText());

    }
}