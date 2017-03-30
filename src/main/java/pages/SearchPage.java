package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by User on 30.03.2017.
 */
public class SearchPage {


    WebDriver driver;
    By searchBtnMain = By.xpath("//div[@class='button-search']");

    String loc = "//*";

    public void clickOnSrcBtn(){
        driver.findElement(searchBtnMain).click();
    }
}
