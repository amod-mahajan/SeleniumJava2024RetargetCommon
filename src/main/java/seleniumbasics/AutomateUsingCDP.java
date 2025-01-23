//package seleniumbasics;
//
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.devtools.DevTools;
//import org.openqa.selenium.devtools.v122.page.Page;
//import org.openqa.selenium.devtools.v122.runtime.Runtime;
//
//import java.util.Optional;
//
//public class AutomateUsingCDP {
//
//    public static void main(String[] args) throws InterruptedException {
//
//        ChromeDriver chromeDriver = new ChromeDriver();
//
//        DevTools devTools = chromeDriver.getDevTools();
//        devTools.createSession();
//
//        devTools.send(Page.navigate("file:///C:/Users/amodm/IdeaProjects/SeleniumJava2024RetargetCommon/src/main/resources/htmlpages/RegisterUser.html",
//                Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty()));
//
//        String js = "document.querySelector('#name').value = 'Selenium WebDriver';";
//        devTools.send(Runtime.evaluate(js, Optional.empty(),Optional.empty(),Optional.empty(),Optional.empty(),Optional.empty(),Optional.empty(),Optional.empty()
//                ,Optional.empty(),Optional.empty(),Optional.empty(),Optional.empty(),
//                Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty()));
//
//    }
//}
