import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchBox extends BasePage{

    //By searchBoxLocator = new By.ByCssSelector("input.desktopOldAutosuggestTheme-input");
  //  By searchButtonLocator = new By.ByCssSelector("div.SearchBoxOld-buttonContainer");

    By searchBoxLocator = By.id("searchText");
    By submitButtonLocator = By.id("searchButton");


    public SearchBox(WebDriver driver) {
        super(driver);
    }

    public void search(String text) {
        type(searchBoxLocator , text);
        click(submitButtonLocator);
    }
}