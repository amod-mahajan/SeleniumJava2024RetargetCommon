package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario1 {

    public static void main(String[] args) throws InterruptedException {

        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("C:\\Users\\amodm\\IdeaProjects\\SeleniumJava2024RetargetCommon\\src\\main\\resources\\htmlpages\\Scenario1.html");

        chromeDriver.findElement(By.id("username")).sendKeys("Amod");
        chromeDriver.findElement(By.id("password")).sendKeys("Amod");

        Thread.sleep(5000);
        chromeDriver.findElement(By.id("username")).clear();



    }
}
