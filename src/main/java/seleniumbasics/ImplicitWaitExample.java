package seleniumbasics;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.time.Duration;
import java.util.Date;
import java.util.List;

public class ImplicitWaitExample {

    public static void main(String[] args) {

        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("C:\\Users\\amodm\\IdeaProjects\\SeleniumMavenRC\\src\\main\\resources\\htmlpages\\DelayedElement.html");

//        chromeDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
//        chromeDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//
//        System.out.println(new Date());
//        WebElement txtBox = chromeDriver.findElement(By.tagName("input"));
//        System.out.println(txtBox.isDisplayed());
//        System.out.println(new Date());

        chromeDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        System.out.println(new Date());
        chromeDriver.get("C:\\Users\\amodm\\IdeaProjects\\SeleniumMavenRC\\src\\main\\resources\\htmlpages\\DisplayElementInInterval.html");
        List<WebElement> allBtns = chromeDriver.findElements(By.tagName("button"));
        System.out.println(allBtns.size());


        System.out.println(new Date());

        chromeDriver.quit();

    }
}
