package seleniumbasics;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenNewWindowTab {

    public static void main(String[] args) throws InterruptedException {
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://www.google.com/");
        System.out.println(chromeDriver.getTitle());
        Thread.sleep(5000);

//        ChromeDriver chromeDriver1 = new ChromeDriver();
//        chromeDriver1.get("https://www.facebook.com/");
//        System.out.println(chromeDriver1.getTitle());

        chromeDriver.switchTo().newWindow(WindowType.WINDOW);
        chromeDriver.get("https://www.facebook.com/");
        System.out.println(chromeDriver.getTitle());

        Thread.sleep(5000);

        chromeDriver.switchTo().newWindow(WindowType.TAB);
        chromeDriver.get("https://www.cnn.com/");
        System.out.println(chromeDriver.getTitle());

    }
}
