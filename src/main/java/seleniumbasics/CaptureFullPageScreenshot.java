package seleniumbasics;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v127.page.Page;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Base64;
import java.util.Optional;

public class CaptureFullPageScreenshot {
    public static void main(String[] args) throws IOException, InterruptedException {
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://www.walmart.com/");
        Thread.sleep(10000);

//        File screenshotAs = chromeDriver.getScreenshotAs(OutputType.FILE);
//        FileHandler.copy(screenshotAs, new File("src/main/resources/screenshots/chrome6.png"));

        DevTools devTools = chromeDriver.getDevTools();
        devTools.createSession();

        devTools.send(Page.enable());
        String screenshotAsString = devTools.send(Page.captureScreenshot(Optional.of(Page.CaptureScreenshotFormat.PNG), Optional.empty(),
                Optional.empty(),Optional.empty(),Optional.of(true), Optional.empty()));

        byte[] decode = Base64.getDecoder().decode(screenshotAsString);
        Files.write(Paths.get("src/main/resources/screenshots/chrome12.png"), decode);


        chromeDriver.quit();
    }
}
