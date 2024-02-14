package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SendKeysExample {

    public static void main(String[] args) throws InterruptedException {
        FirefoxDriver chromeDriver = new FirefoxDriver();
        //chromeDriver.get("C:\\Users\\amodm\\IdeaProjects\\SeleniumJava2024RetargetCommon\\src\\main\\resources\\htmlpages\\DifferentTextBoxes.html");

        chromeDriver.get("https://practicesoftwaretesting.com/#/auth/login");
        WebElement ele = chromeDriver.findElement(By.id("email"));
        ele.sendKeys("✈️✈️😊");
        //ele.sendKeys("amod@gmail.com");
        //Thread.sleep(5000);
        //ele.sendKeys(Keys.chord(Keys.CONTROL, "A", Keys.DELETE));
//        ele.sendKeys("amod@gmail.com");

        //chromeDriver.findElement(By.id("example1")).sendKeys("Amodddd");

//        chromeDriver.findElement(By.id("example2")).sendKeys("Amodddd");



//        chromeDriver.findElement(By.id("myTextArea")).sendKeys("Enter text here...\n" +
//                "hdfjkfh\n" +
//                "sdfdsf\n" +
//                "fsdfsdf\n" +
//                "fsdfdsf\n" +
//                "fsdsdfsdfsdfgfgjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjj");
    }
}
