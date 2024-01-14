package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Date;
import java.util.List;

public class FindElementsExample {

    public static void main(String[] args) {

        ChromeDriver chromeDriver = new ChromeDriver();
        System.out.println(new Date());
        chromeDriver.get("file:///C:/RetargetCommon/SeleniumJava/HTML/DelayedElement.html");

        //WebElement txtBox = chromeDriver.findElement(By.tagName("input"));
        List<WebElement> inputEle = chromeDriver.findElements(By.tagName("input"));
        System.out.println(new Date());
        System.out.println(inputEle.size());

//        List<WebElement> allInputElements = chromeDriver.findElements(By.tagName("input1"));
//        System.out.println("Total matching web elements = " + allInputElements.size());


        chromeDriver.quit();

    }
}
