package seleniumbasics;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CloseVsQuit {

    public static void main(String[] args) throws InterruptedException {
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://www.google.com/");

//        chromeDriver.switchTo().newWindow(WindowType.TAB);
//        chromeDriver.get("https://www.cnn.com/");
//
//        ChromeDriver chromeDriver1 = new ChromeDriver();
//        chromeDriver1.get("https://www.amazon.com/");
//
//        Thread.sleep(15000);
        chromeDriver.quit();
    }
}
