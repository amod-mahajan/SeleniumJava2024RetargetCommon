package seleniumbasics;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPropertyAttributeEx {
    public static void main(String[] args) {
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("C:\\Users\\amodm\\IdeaProjects\\SeleniumJava2024RetargetCommon\\src\\main\\resources\\htmlpages\\AttributeVsProperties.html");
        System.out.println(chromeDriver.findElement(By.id("firstname")).getAttribute("type"));
        System.out.println(chromeDriver.findElement(By.id("firstname")).getDomAttribute("type"));
        System.out.println(chromeDriver.findElement(By.id("firstname")).getDomProperty("type"));
        chromeDriver.quit();
    }
}
