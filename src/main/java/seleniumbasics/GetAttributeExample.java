package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class GetAttributeExample {

    public static void main(String[] args) {

        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("C:\\Users\\amodm\\IdeaProjects\\SeleniumJava2024RetargetCommon\\src\\main\\resources\\htmlpages\\AttributeWithoutValues.html");
//       String attVal = chromeDriver.findElement(By.id("email")).getAttribute("placeholder");
//        System.out.println(attVal);
//        chromeDriver.quit();

//        System.out.println(chromeDriver.findElement(By.id("email")).getAttribute("value"));
//        chromeDriver.findElement(By.id("email")).sendKeys("amod@gmail.com");
//        System.out.println(chromeDriver.findElement(By.id("email")).getAttribute("value"));

        System.out.println(chromeDriver.findElement(By.tagName("input")).getAttribute("readonly"));
        chromeDriver.quit();

    }
}