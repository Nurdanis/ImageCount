import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class NewsPage extends BasePage{

    By newsImageLocator = new By.ByClassName("media-left");


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
      //  System.out.println("Number of elements:" + ((List<?>) elements).size());
        //return elements;
    }


   //public boolean checkIfImageExist() {  return find(newsImageLocator).isDisplayed();    }
}
