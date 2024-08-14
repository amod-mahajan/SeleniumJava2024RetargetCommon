package seleniumbasics;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FluentWaitExample {
    public static void main(String[] args) {
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("C:\\Users\\amodm\\IdeaProjects\\SeleniumJava2024RetargetCommon\\src\\main\\resources\\htmlpages\\TitleLoading.html");

//        WebDriverWait webDriverWait = new WebDriverWait(chromeDriver, Duration.ofSeconds(15));
//        webDriverWait.until(ExpectedConditions.titleIs("Completed"));

//        FluentWait<ChromeDriver> fluentWait = new FluentWait<>(chromeDriver);
//        fluentWait.withTimeout(Duration.ofSeconds(15));
//        fluentWait.until(ExpectedConditions.titleIs("Completed"));


        APICalls apiCalls = new APICalls();
        FluentWait<APICalls> fluentWait = new FluentWait<>(apiCalls);
        //fluentWait.withTimeout(Duration.ofSeconds(30));
        fluentWait.until(apiCalls1 -> {
            System.out.println("----------------------------------");
            return apiCalls1.getToolName().jsonPath().getString("tool").equalsIgnoreCase("Selenium");
        });

        System.out.println(chromeDriver.getTitle());
        chromeDriver.quit();
    }


}
