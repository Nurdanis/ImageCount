import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{

    SearchBox searchBox;

    public HomePage(WebDriver driver) {
        super(driver);
        searchBox = new SearchBox(driver);
    }

    public SearchBox searchBox(){
        return this.searchBox;
    }
}
