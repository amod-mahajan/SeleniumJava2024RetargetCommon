package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;

public class GetCssValueExample {

    public static void main(String[] args) {

        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://practicesoftwaretesting.com/#/auth/login");

        String widthVal = chromeDriver.findElement(By.className("btnSubmit")).getCssValue("background-color");
        System.out.println(widthVal);
        Color color = new Color(30,96,152);
        System.out.println(color.getRGB());
        String hextVal = Integer.toHexString(color.getRGB());
        System.out.println(hextVal);

        chromeDriver.quit();
    }
}
