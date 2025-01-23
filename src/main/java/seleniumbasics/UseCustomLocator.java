package seleniumbasics;

import org.openqa.selenium.chrome.ChromeDriver;

public class UseCustomLocator {

    public static void main(String[] args) {
        ChromeDriver chromeDriver = new ChromeDriver();

        chromeDriver.get("C:\\Users\\amodm\\IdeaProjects\\SeleniumJava2024RetargetCommon\\src\\main\\resources\\htmlpages\\CustomLocator.html");


        chromeDriver.findElement(CustomBy.placeholder("Enter your username")).sendKeys("Amod Mahajan");
    }
}
