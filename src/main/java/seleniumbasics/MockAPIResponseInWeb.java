package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v127.fetch.Fetch;
import org.openqa.selenium.devtools.v127.fetch.model.RequestPattern;
import org.openqa.selenium.devtools.v127.network.Network;
import org.openqa.selenium.devtools.v127.network.model.Request;

import java.util.Optional;

public class MockAPIResponseInWeb {

    public static void main(String[] args) throws InterruptedException {

        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("http://localhost:3000/");

        DevTools devTools = chromeDriver.getDevTools();
        devTools.createSession();

        devTools.send(Fetch.enable(Optional.empty(), Optional.empty()));

        devTools.addListener(Fetch.requestPaused(), requestPaused -> {
            Request request = requestPaused.getRequest();
            String url = request.getUrl();

            if(url.contains("/users") && request.getMethod().equalsIgnoreCase("POST")) {
                devTools.send(Fetch.fulfillRequest(requestPaused.getRequestId(),500,Optional.empty(), Optional.empty(),
                        Optional.empty(), Optional.empty()));
            }
            else {
                devTools.send(Fetch.continueRequest(requestPaused.getRequestId(), Optional.empty(), Optional.empty(),
                        Optional.empty(), Optional.empty(), Optional.empty()));
            }
        });

        chromeDriver.findElement(By.id("name")).sendKeys("Amod");
        chromeDriver.findElement(By.id("email")).sendKeys("Amod@gmail.com");
        chromeDriver.findElement(By.id("password")).sendKeys("Amod");
        chromeDriver.findElement(By.xpath("//input[@value='Register']")).click();

        Thread.sleep(10000);
        chromeDriver.quit();

    }}


