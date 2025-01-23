package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CustomBy {

    public static By placeholder(String placeholderText) {
        return new ByPlaceholder(placeholderText);
    }

    public static class ByPlaceholder extends By {
        private final String placeholderText;

        public  ByPlaceholder(String placeholderText) {
            this.placeholderText = placeholderText;
        }
        @Override
        public List<WebElement> findElements(SearchContext context) {
            //return context.findElements(By.xpath("//*[@placeholder='"+placeholderText+"']"));
            return  context.findElements(By.xpath(String.format("//input[@placeholder='%s']", placeholderText)));
        }
    }

}
