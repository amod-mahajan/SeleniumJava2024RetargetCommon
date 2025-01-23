package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v127.network.Network;
import org.openqa.selenium.devtools.v127.network.model.Headers;

import java.util.HashMap;
import java.util.Optional;

public class UserRegistrationTest {

    public static void main(String[] args) {

         WebDriver driver;
         WireMockSetup wireMockSetup;

        // Start WireMock server
        wireMockSetup = new WireMockSetup();
        wireMockSetup.startWireMock();

        // Set up Selenium WebDriver
        // System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://localhost:3000");

        // Point to your application

        // Enable CDP for ChromeDriver
        DevTools devTools = ((ChromeDriver) driver).getDevTools();
        devTools.createSession();

        // Enable Network interception using CDP
        devTools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));

        // Add request interception for /users API
        devTools.addListener(Network.requestWillBeSent(), request -> {
            if (request.getRequest().getUrl().contains("/users")) {
                System.out.println("Intercepted /users API call, adding headers.");
            }
        });

        // Simulate successful user registration
        driver.findElement(By.id("name")).sendKeys("John Doe");
        driver.findElement(By.id("email")).sendKeys("john.doe@example.com");
        driver.findElement(By.id("password")).sendKeys("password123");

        // Set the extra HTTP headers before submitting the form
        HashMap<String, Object> headers = new HashMap<>();
        headers.put("x-request-id", "abcerror400def"); // This should trigger the mock response

        // This sends headers with each request to /users
        devTools.send(Network.setExtraHTTPHeaders(new Headers(headers)));


        driver.findElement(By.cssSelector("input[type='submit']")).click();
    }


}
