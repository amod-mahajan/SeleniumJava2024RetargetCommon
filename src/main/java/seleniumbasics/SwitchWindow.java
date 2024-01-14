package seleniumbasics;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class SwitchWindow {

    public static void main(String[] args) {
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://www.google.com/");
        System.out.println(chromeDriver.getTitle());
        //String parentHandle = chromeDriver.getWindowHandle();

        chromeDriver.switchTo().newWindow(WindowType.TAB);
        chromeDriver.get("https://www.cnn.com/");
        System.out.println(chromeDriver.getTitle());
        String childHandle = chromeDriver.getWindowHandle();


//        chromeDriver.switchTo().newWindow(WindowType.WINDOW);
//        chromeDriver.get("https://www.amazon.com/");
//        System.out.println(chromeDriver.getTitle());

        Set<String> allHandles = chromeDriver.getWindowHandles();
        for (String handle : allHandles) {
              if(!handle.equalsIgnoreCase(childHandle))
                  chromeDriver.switchTo().window(handle);
        }
//        allHandles.remove(childHanlde);
//        String parentHandle = allHandles.stream().findFirst().get();
//

//        for(String handle : allHandles) {
//            chromeDriver.switchTo().window(handle);
//            String currentTitle = chromeDriver.getTitle();
//            if(currentTitle.equalsIgnoreCase("Google"))
//                break;
//        }

//        List<String> handlesList = new ArrayList<>(allHandles);
//        chromeDriver.switchTo().window(handlesList.get(0));
        //chromeDriver.switchTo().window(parentHandle);
        System.out.println(chromeDriver.getTitle());

    }
}
