package seleniumbasics;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandle {
    public static void main(String[] args) {
        ChromeDriver chromeDriver = new ChromeDriver();
        String h1 = chromeDriver.getWindowHandle();
        System.out.println(h1);
        Set<String> allHandles = chromeDriver.getWindowHandles();
        System.out.println(allHandles);

        chromeDriver.switchTo().newWindow(WindowType.TAB);
        h1 = chromeDriver.getWindowHandle();
        System.out.println(h1);
        allHandles = chromeDriver.getWindowHandles();
        System.out.println(allHandles);

        chromeDriver.switchTo().newWindow(WindowType.WINDOW);
        h1 = chromeDriver.getWindowHandle();
        System.out.println(h1);
        allHandles = chromeDriver.getWindowHandles();
        System.out.println(allHandles);

        System.out.println("==============================");

        ChromeDriver chromeDriver1 = new ChromeDriver();
        h1 = chromeDriver1.getWindowHandle();
        System.out.println(h1);
        allHandles = chromeDriver1.getWindowHandles();
        System.out.println(allHandles);


    }
}
