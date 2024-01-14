package seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetVsNavigate {
    public static void main(String[] args) {
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://www.google.com/");
        System.out.println(chromeDriver.getTitle());

       // WebDriver.Navigation navigation = chromeDriver.navigate();
        chromeDriver.navigate().to("https://www.cnn.com/");
        System.out.println(chromeDriver.getTitle());

        chromeDriver.navigate().back();
        System.out.println(chromeDriver.getTitle());

        chromeDriver.navigate().forward();
        System.out.println(chromeDriver.getTitle());

        chromeDriver.navigate().refresh();
        System.out.println(chromeDriver.getTitle());
    }

}
