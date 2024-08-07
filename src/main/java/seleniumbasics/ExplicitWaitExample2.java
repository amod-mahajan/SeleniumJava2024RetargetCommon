package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWaitExample2 {

    public static void main(String[] args) {
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("C:\\Users\\amodm\\IdeaProjects\\SeleniumJava2024RetargetCommon\\src\\main\\resources\\htmlpages\\TitleLoading.html");


        WebDriverWait webDriverWait = new WebDriverWait(chromeDriver, Duration.ofSeconds(15));
        //webDriverWait.until(ExpectedConditions.titleIs("Completed"));

//        webDriverWait.until(ExpectedConditions.or(ExpectedConditions.titleIs("Completed"),
//                ExpectedConditions.textToBe(By.id("titleDisplay"), "Completed1")));

        //webDriverWait.until(ExpectedConditions.not(ExpectedConditions.titleIs("Loading")));

        String text  = webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.id("titleDisplay")))
                        .getText();

        System.out.println(text);
        System.out.println(chromeDriver.getTitle());
        chromeDriver.quit();
    }
}
