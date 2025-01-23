package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HandlingSelectDropdown {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("C:\\Users\\amodm\\IdeaProjects\\SeleniumJava2024RetargetCommon\\src\\main\\resources\\htmlpages\\Dropdowns.html");

        Select select = new Select(chromeDriver.findElement(By.id("dropdown")));
        select.selectByValue("option2");
//        Thread.sleep(2000);
//        select.deselectByValue("option2");
//
//        select.selectByVisibleText("Option 3");
//        Thread.sleep(2000);
//        select.selectByIndex(5);
//        Thread.sleep(2000);
        select.selectByContainsVisibleText("Opt");

        List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
       allSelectedOptions.forEach(e -> System.out.println(e.getText()));




















//        List<WebElement> options = select.getOptions();
//        System.out.println("Dropdown options are - ");
//        options.forEach(webElement -> System.out.println(webElement.getText()));


        //Select select = new Select(chromeDriver.findElement(By.id("dropdown")));

    }
}


