import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class NewsPage extends BasePage{

    By newsImageLocator = new By.ByTagName("img");

    public NewsPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnSerpNewsPage() {
        return isDisplayed(newsTabLocator);
    }

    public Integer getImageCount() {

        return getAllProducts().size();

    }

    public List<WebElement> getAllProducts(){

         return findAll(newsImageLocator);
    }
}
