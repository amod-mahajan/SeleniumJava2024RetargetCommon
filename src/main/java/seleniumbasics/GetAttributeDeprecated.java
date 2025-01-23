package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeDeprecated {

    public static void main(String[] args) throws InterruptedException {
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("C:\\Users\\amodm\\IdeaProjects\\SeleniumJava2024RetargetCommon\\src\\main\\resources\\htmlpages\\GetAttributeDeprercated.html");

//        System.out.println(chromeDriver.findElement(By.id("textBox")).getAttribute("placeholder"));
//
//        System.out.println(chromeDriver.findElement(By.id("textBox")).getAttribute("placeholder1"));
//
//        chromeDriver.findElement(By.id("textBox")).sendKeys("Amod");
//        System.out.println(chromeDriver.findElement(By.id("textBox")).getAttribute("value"));

//        chromeDriver.findElement(By.id("checkBox")).click();
//
//        System.out.println(chromeDriver.findElement(By.id("checkBox")).getAttribute("checked"));


        System.out.println(chromeDriver.findElement(By.id("textBox")).getDomAttribute("value"));
        System.out.println(chromeDriver.findElement(By.id("textBox")).getDomProperty("value"));

        chromeDriver.findElement(By.id("textBox")).sendKeys("Amod");

        System.out.println(chromeDriver.findElement(By.id("textBox")).getDomAttribute("value"));
        System.out.println(chromeDriver.findElement(By.id("textBox")).getDomProperty("value"));

        chromeDriver.quit();


    }
}
