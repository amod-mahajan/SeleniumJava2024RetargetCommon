package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnableDisableExample {
    public static void main(String[] args) throws InterruptedException {

        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("C:\\Users\\amodm\\IdeaProjects\\SeleniumJava2024RetargetCommon\\src\\main\\resources\\htmlpages\\EnableDisable.html");

        WebElement e1 = chromeDriver.findElement(By.id("enabledTextBox"));
        System.out.println(e1.isEnabled());

        WebElement e2 = chromeDriver.findElement(By.id("disabledTextBox"));
        System.out.println(e2.isEnabled());


        WebElement e3 = chromeDriver.findElement(By.className("disabled"));
        System.out.println(e3.isEnabled());



        WebElement e4 = chromeDriver.findElement(By.tagName("textarea"));
        System.out.println(e4.isEnabled());
        e4.sendKeys("dfdsf");
        Thread.sleep(10000);

        chromeDriver.quit();
    }
}
