package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * Created by User on 06.04.2017.
 */
public class DriverManager {
    WebDriver driver;
    WebDriverWait wait;
    String url;

    public WebDriver setupDriver() throws IOException {
        PropertiesReader pr = new PropertiesReader();

        if (System.getProperty("url") != null){
            url = System.getProperty("browser");
        }else {
            url = pr.getProperty("src/main/resources/mainProp.properties","url");
        }


        //if (firefox) {

        //} else if (chrome) {

       // }


        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.get(url);

        wait = new WebDriverWait(driver,10);
        return driver;
    }
}
