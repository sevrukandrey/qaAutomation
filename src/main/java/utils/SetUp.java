package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pages.BookmarksPage;
import pages.KabinetPage;
import pages.LoginPage;
import pages.SearchPage;

import java.io.IOException;
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

    DriverManager drM = new DriverManager();


    @BeforeTest
    public   void setUp() throws IOException {
        driver = drM.setupDriver();

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
