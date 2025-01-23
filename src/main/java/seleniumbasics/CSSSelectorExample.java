package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelectorExample {

    public static void main(String[] args) {
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("C:\\Users\\amodm\\IdeaProjects\\SeleniumJava2024RetargetCommon\\src\\main\\resources\\htmlpages\\cssSelectorsExample.html");

        //System.out.println(chromeDriver.findElement(By.cssSelector(".highlight")).getText());
        //System.out.println(chromeDriver.findElements(By.cssSelector("[name='useremail'],[placeholder='Username (Attribute Selector)']")).size());

        //System.out.println(chromeDriver.findElement(By.cssSelector("h1:first-child")).getText());

        System.out.println(chromeDriver.findElements(By.cssSelector("input:last-child")).size());

        System.out.println(chromeDriver.findElement(By.cssSelector("input[type='checkbox']:checked")).getAttribute("id"));
        chromeDriver.quit();
    }
}
