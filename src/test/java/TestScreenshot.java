import com.google.common.io.Files;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class TestScreenshot {
    WebDriver driver;

    @BeforeEach
    public void setup(){
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        driver =new ChromeDriver();
        driver.get("https://duckduckgo.com/");
        driver.manage().window().maximize();
   }

    @Test
    public void screenshot_test(){
        TakesScreenshot takesScreenshot =(TakesScreenshot)driver;
        File image = takesScreenshot.getScreenshotAs(OutputType.FILE);
        try {
            Files.move(image,new File("screenshots/duckduckgo.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

