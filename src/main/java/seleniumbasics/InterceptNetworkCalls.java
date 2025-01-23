package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v127.network.Network;
import org.openqa.selenium.devtools.v127.network.model.Request;
import org.openqa.selenium.devtools.v127.network.model.RequestId;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class InterceptNetworkCalls {
    public static void main(String[] args) throws InterruptedException {

        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("C:\\Users\\amodm\\IdeaProjects\\SeleniumJava2024RetargetCommon\\src\\main\\resources\\htmlpages\\RegisterUser.html");

        DevTools devTools = chromeDriver.getDevTools();
        devTools.createSession();

        devTools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));

        List<String> allRequestIds = new ArrayList<>();
        devTools.addListener(Network.requestWillBeSent(), requestWillBeSent -> {
            Request request = requestWillBeSent.getRequest();
            String url = request.getUrl();
            String method = request.getMethod();
            System.out.println("URL is : " + url);
            System.out.println("Method is : " + method);

            if(url.equalsIgnoreCase("https://jsonplaceholder.typicode.com/posts") &&
            method.equalsIgnoreCase("POST")) {
            String requestBody = request.getPostData().get();
            System.out.println(requestBody);

            RequestId requestId = requestWillBeSent.getRequestId();
            allRequestIds.add(requestId.toString());
            String requestBody1 = devTools.send(Network.getRequestPostData(requestId));
            System.out.println("Request body " + requestBody1);

//            String ss = devTools.send(Network.getResponseBody(requestId)).getBody();
//                System.out.println("Response body " + ss);
            }
        });

        devTools.addListener(Network.responseReceived(), responseReceived -> {
            String requestId = responseReceived.getRequestId().toString();
            if(allRequestIds.contains(requestId)) {
                String responseBody = devTools.send(Network.getResponseBody(new RequestId(requestId))).getBody();
                System.out.println(responseBody);
            }
        });


        chromeDriver.findElement(By.id("name")).sendKeys("Amod");
        chromeDriver.findElement(By.id("email")).sendKeys("Amod@gmail.com");
        chromeDriver.findElement(By.id("password")).sendKeys("Amod");
        chromeDriver.findElement(By.xpath("//input[@value='Register']")).click();

        Thread.sleep(10000);
        chromeDriver.quit();
    }
}
