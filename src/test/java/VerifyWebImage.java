import com.google.common.io.Files;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class VerifyWebImage extends BaseTest {

    HomePage homePage;
    SerpPage serpPage;
    NewsPage newsPage;
    By newsImageLocator = new By.ByTagName("img");

    @BeforeEach
    public void screenshot_test(){
        TakesScreenshot takesScreenshot =(TakesScreenshot)driver;
        File image = takesScreenshot.getScreenshotAs(OutputType.FILE);
        try {
            Files.move(image,new File("screenshots/duckduckgo.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    @Order(1)
    public void searchKeyword() {
        homePage = new HomePage(driver);
        serpPage = new SerpPage(driver);
        homePage.searchBox().search("ball");
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
        List<WebElement> myElements = driver.findElements(newsImageLocator);
        System.out.println("Size of List: "+myElements.size());


    }


}
