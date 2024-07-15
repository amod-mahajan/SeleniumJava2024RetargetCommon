package seleniumbasics;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Base64;

public class CaptureScreenshot {

    public static void main(String[] args) throws IOException, InterruptedException {
        //ChromeDriver chromeDriver = new ChromeDriver();

        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://www.google.com/");
//        String screenshotAs = chromeDriver.getScreenshotAs(OutputType.BASE64);
//        byte[] decode = Base64.getDecoder().decode(screenshotAs);
//
//        Files.write(Paths.get("src/main/resources/screenshots/chrome1.png"), decode);

//        byte[] screenshotAs = chromeDriver.getScreenshotAs(OutputType.BYTES);
//
////
//        Files.write(Paths.get("src/main/resources/screenshots/chrome2.png"), screenshotAs);

        TakesScreenshot chromeDriver1 = (TakesScreenshot) chromeDriver;
        File screenshotAs = chromeDriver1.getScreenshotAs(OutputType.FILE);

        System.out.println(screenshotAs.getAbsolutePath());

        FileHandler.copy(screenshotAs, new File("src/main/resources/screenshots/chrome4.png"));

        chromeDriver.quit();

    }

}
