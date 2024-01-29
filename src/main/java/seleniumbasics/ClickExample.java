package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Date;

public class ClickExample {

    public static void main(String[] args) {

        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://www.cnn.com/");

        System.out.println(new Date());
        chromeDriver.findElement(By.partialLinkText("Terms of Use")).click();
        System.out.println(new Date());

//        System.out.println(new Date());
//        chromeDriver.findElement(By.className("brand-logo__logo-link")).click();
//        System.out.println(new Date());
//        System.out.println(chromeDriver.findElement(By.className("brand-logo__logo-link")).getAttribute("title"));
        chromeDriver.quit();
    }
}
