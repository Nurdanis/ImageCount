import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SerpPage extends BasePage{


    public SerpPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnSerpPage() {
        return isDisplayed(allTabLocator);
    }

    public void selectNewsTab() throws InterruptedException {

        click(newsTabLocator);
    }

    }

