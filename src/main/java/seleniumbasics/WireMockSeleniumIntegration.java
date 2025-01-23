package seleniumbasics;

import com.github.tomakehurst.wiremock.WireMockServer;
import com.github.tomakehurst.wiremock.client.WireMock;
import com.github.tomakehurst.wiremock.core.WireMockConfiguration;
import org.openqa.selenium.By;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v127.network.Network;
import org.openqa.selenium.devtools.v127.network.model.Headers;

import java.util.HashMap;
import java.util.Optional;

import static com.github.tomakehurst.wiremock.client.WireMock.*;

public class WireMockSeleniumIntegration {
    public static void main(String[] args) {
            // Start WireMock on port 8080
            WireMockServer wireMockServer = new WireMockServer(WireMockConfiguration.wireMockConfig().port(8080));
            wireMockServer.start();

            wireMockServer.stubFor(any(urlMatching(".*"))
                    .withHeader("x-request-id", matching(".*error400.*"))
                    .willReturn(aResponse().withStatus(400)));

            wireMockServer.stubFor(any(urlMatching(".*"))
                    .withHeader("x-request-id", matching(".*error500.*"))
                    .willReturn(aResponse().withStatus(500)));

            wireMockServer.stubFor(any(urlMatching(".*"))
                    .willReturn(aResponse().proxiedFrom("http://localhost:3000")));

//            // Stub for all requests to /users to return 400 status code
//            wireMockServer.stubFor(WireMock.any(WireMock.urlPathEqualTo("/users"))
//                    .willReturn(WireMock.aResponse().withStatus(400).withBody("Mocked 400 Error")));
//
            // Proxy all requests to localhost:3000/users
//            wireMockServer.stubFor(WireMock.any(WireMock.urlPathEqualTo("/api/users"))
//                    .willReturn(WireMock.aResponse().proxiedFrom("http://localhost:3000")));

//
//            // Stub to return 400 for all requests
//            wireMockServer.stubFor(WireMock.any(WireMock.urlMatching(".*")) // Match any URL
//                    .willReturn(WireMock.aResponse().withStatus(500).withBody("Mocked 400 Error123")));
//


            // Setup WebDriver using WebDriverManager (ChromeDriver)
            //WebDriverManager.chromedriver().setup();
           // WebDriver driver = new ChromeDriver();
            Proxy proxy = new Proxy();
            proxy.setHttpProxy("localhost:8080");

            ChromeOptions options = new ChromeOptions();
            options.setProxy(proxy);

            WebDriver driver = new ChromeDriver(options);

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

            wireMockServer.addMockServiceRequestListener((request, response) -> {
                    System.out.println("Request: " + request.getUrl() + " | Status: " + response.getStatus());
            });

            // Navigate to the web application running on localhost:3000
            driver.get("http://localhost:3000");

            // Simulate form submission
            WebElement nameField = driver.findElement(By.id("name"));
            WebElement emailField = driver.findElement(By.id("email"));
            WebElement passwordField = driver.findElement(By.id("password"));
            WebElement submitButton = driver.findElement(By.cssSelector("input[type='submit']"));

            // Fill in the form
            nameField.sendKeys("Test User");
            emailField.sendKeys("test@example.com");
            passwordField.sendKeys("password123");

            // Set the extra HTTP headers before submitting the form
            HashMap<String, Object> headers = new HashMap<>();
            headers.put("x-request-id", "abcerror400def"); // This should trigger the mock response

            // This sends headers with each request to /users
            devTools.send(Network.setExtraHTTPHeaders(new Headers(headers)));

            // Submit the form (this should trigger the API call through WireMock)
            submitButton.click();

            // Wait for a while to allow the request to go through and verify the result
            // You can add assertions here to check the response in the UI



            // Close the browser
            //driver.quit();

            // Stop the WireMock server after the test
           // wireMockServer.stop();
        }


}
