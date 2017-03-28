package WebDriver.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

/**
 * Created by asevruk on 28.03.2017.
 */
public class SetUp {
  public WebDriver driver;

    @BeforeTest
    public   void setUp(){
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);


    }
    @AfterTest
    public   void close(){
        driver.quit();
    }

}
