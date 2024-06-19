package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.util.List;

public class RelativeLocatorExamples {
    public static void main(String[] args) {
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("C:\\Users\\amodm\\IdeaProjects\\SeleniumJava2024RetargetCommon\\src\\main\\resources\\htmlpages\\relativeLocator3.html");


//        chromeDriver.findElement(RelativeLocator.with(By.xpath("//input[@type='text']"))
//                .toRightOf(By.xpath("//label[text()='Select your birthday:']")))
//                .click();
        //chromeDriver.quit();

//        String s = chromeDriver.findElement(RelativeLocator.with(By.tagName("label"))
//                .toLeftOf(By.id("meeting"))).getText();
//        System.out.println(s);

//        List<WebElement> allLables = chromeDriver.findElements(RelativeLocator.with(By.tagName("lab"))
//                .above(By.xpath("//input[@type='submit']")));
//        allLables.forEach(ele -> System.out.println(ele.getText()));

//        List<WebElement> allLables = chromeDriver.findElements(RelativeLocator.with(By.tagName("label"))
//                .below(By.tagName("h1")));
//        allLables.forEach(ele -> System.out.println(ele.getText()));

        String price = chromeDriver.findElement(RelativeLocator.with(By.xpath("//strong[text()='Price:']/.."))
                .below(By.xpath("//h2[text()='Book Title 1']"))).getText();
        System.out.println(price);

    }

}
