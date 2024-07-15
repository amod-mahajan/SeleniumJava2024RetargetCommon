package seleniumbasics;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumClassesHierarchy {

    public static void main(String[] args) {

        ChromeDriver chromeDriver = new ChromeDriver();

        FirefoxDriver firefoxDriver = new FirefoxDriver();

        EdgeDriver edgeDriver = new EdgeDriver();

    }
}
