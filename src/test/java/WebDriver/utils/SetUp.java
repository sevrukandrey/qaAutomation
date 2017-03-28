package WebDriver.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

/**
 * Created by asevruk on 28.03.2017.
 */
public class SetUp {
  public WebDriver driver;

    @BeforeTest
    public   void setUp(){
        driver = new ChromeDriver();

    }
    @AfterTest
    public   void close(){
        driver.quit();
    }

}
