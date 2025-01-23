package seleniumbasics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v85.page.Page;

import java.util.Optional;

public class DevToolVersionUnderstanding {

    public static void main(String[] args) {
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://www.google.com/");

        DevTools devTools = chromeDriver.getDevTools();
        devTools.createSession();

        devTools.send(Page.navigate("file:///C:/Users/amodm/IdeaProjects/SeleniumJava2024RetargetCommon/src/main/resources/htmlpages/RegisterUser.html",
                Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty()));
        chromeDriver.quit();

    }
}
