package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pages.BookmarksPage;
import pages.KabinetPage;
import pages.LoginPage;
import pages.SearchPage;

import java.util.concurrent.TimeUnit;

/**
 * Created by asevruk on 28.03.2017.
 */
public class SetUp {
  public WebDriver driver;

    public LoginPage loginPage;
    public SearchPage searchPage;
    public KabinetPage userKabinetPage;
    public BookmarksPage bookmarksPage;


    @BeforeTest
    public   void setUp(){
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.get("http://allegro.com.ua");

        loginPage = new LoginPage(driver);
        userKabinetPage= new KabinetPage(driver);
        searchPage = new SearchPage(driver);
        bookmarksPage = new BookmarksPage(driver);




    }
    @AfterTest
    public   void close(){
        driver.quit();
    }

}
