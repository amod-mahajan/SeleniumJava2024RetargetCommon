package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class XPathTutorials {

    public static void main(String[] args) {

        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("C:\\Users\\amodm\\IdeaProjects\\SeleniumJava2024RetargetCommon\\src\\main\\resources\\htmlpages\\XPathTutorials.html");
        chromeDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //System.out.println(chromeDriver.findElement(By.xpath("//p[normalize-space()='This\u00a0\u00a0 is']")).getText());

        //System.out.println(chromeDriver.findElement(By.xpath("//p[normalize-space(translate(.,'\u00a0',' '))='This is']")).getText());

        chromeDriver.quit();

    }
}
