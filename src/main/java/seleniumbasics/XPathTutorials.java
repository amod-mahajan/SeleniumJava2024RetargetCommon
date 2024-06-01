package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class XPathTutorials {

    public static void main(String[] args) {

        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("C:\\Users\\amodm\\IdeaProjects\\SeleniumJava2024RetargetCommon\\src\\main\\resources\\htmlpages\\NonBreakingSpace.html");
        chromeDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        System.out.println(chromeDriver.findElement(By.xpath("//a[normalize-space(translate(., '\u00A0', ' '))='Link With non-breaking Spaces between words Link']")).getText());

        chromeDriver.quit();

    }
}
