package seleniumbasics;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MixMaxSetSizeWindow {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver chromeDriver = new ChromeDriver();
        //WebDriver.Options options = chromeDriver.manage();
        //WebDriver.Window window = options.window();
//        chromeDriver.manage().window().maximize();
//        Thread.sleep(2000);
//        chromeDriver.manage().window().minimize();

//        Dimension size = chromeDriver.manage().window().getSize();
//        System.out.println(size.getWidth());
//        System.out.println(size.getHeight());
//
//        Dimension dimension = new Dimension(1100,900);
//        Thread.sleep(2000);
//        chromeDriver.manage().window().setSize(dimension);
//        chromeDriver.manage().window().fullscreen();

        Point position = chromeDriver.manage().window().getPosition();
        System.out.println(position.getX());
        System.out.println(position.getY());

        Point point = new Point(10,-5);
        chromeDriver.manage().window().setPosition(point);

    }
}
