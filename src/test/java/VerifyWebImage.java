import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class VerifyWebImage extends BaseTest {

    HomePage homePage;
    SerpPage serpPage;
    NewsPage newsPage;
    By newsImageLocator = By.className("media-left");

    @Test
    @Order(1)
    public void searchKeyword() {
        homePage = new HomePage(driver);
        serpPage = new SerpPage(driver);
        homePage.searchBox().search("haber");
        Assertions.assertTrue(serpPage.isOnSerpPage(),
                "Not on serp page!");
    }

  @Test
    @Order(2)
    public void selectTab() throws InterruptedException {
        serpPage.selectNewsTab();
        //driver.navigate().refresh();
        Thread.sleep(5000);
        newsPage = new NewsPage(driver);
        Assertions.assertTrue(newsPage.isOnSerpNewsPage(),
                "Not on serp news page!");
    }


    @Test
    @Order(3)
    public void get_A_ImageCount(){

      //  Integer CountImage = newsPage.getImageCount();
      //  Assertions.assertTrue(newsPage.checkIfImageExist(),"Not image on news serp page");
      //  System.out.println(newsPage.getImageCount());

        List<WebElement> myElements = driver.findElements(newsImageLocator);
        System.out.println("Size of List: "+myElements.size());


    }


}
