package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.concurrent.atomic.AtomicBoolean;

public class ExplicitWaitExample {

    public static String oldTitle = "";
    public static void main(String[] args) {
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("C:\\Users\\amodm\\IdeaProjects\\SeleniumJava2024RetargetCommon\\src\\main\\resources\\htmlpages\\TitleChange.html");

        oldTitle = chromeDriver.getTitle();
       // chromeDriver.findElement(By.xpath("//button[text()='Change Title']")).click();

//        System.out.println(LocalDateTime.now());
//        boolean flag = true;
//        while (flag) {
//            String newTitle = chromeDriver.getTitle();
//            if(!oldTitle.equalsIgnoreCase(newTitle))
//                flag = false;
//        }
//        System.out.println(LocalDateTime.now());
//        System.out.println(chromeDriver.getTitle());


        //System.out.println(LocalDateTime.now());
        WebDriverWait webDriverWait = new WebDriverWait(chromeDriver, Duration.ofSeconds(10));
        webDriverWait.pollingEvery(Duration.ofSeconds(1));
        //webDriverWait.ignoring(NumberFormatException.class);
        webDriverWait.withMessage("Title was not changed. Log the bug.");

        //webDriverWait.until(new WaitForTitle());

        AtomicBoolean flag = new AtomicBoolean(true);
        System.out.println("Started at : " + LocalDateTime.now());
        webDriverWait.until(cDriver -> {
            System.out.println("Checking condition at : " + LocalDateTime.now());
            String curTile = cDriver.getTitle();
//            if(flag.get()) {
//                System.out.println("Exception occured");
//                flag.set(false);
//                //Integer.parseInt(curTile);
//                chromeDriver.findElement(By.id("fsfsgg"));
//            }
            return !curTile.equalsIgnoreCase(ExplicitWaitExample.oldTitle);
        });
        System.out.println("Ended at : " + LocalDateTime.now());
        //System.out.println(LocalDateTime.now());
        System.out.println(chromeDriver.getTitle());
        chromeDriver.quit();
    }
}
