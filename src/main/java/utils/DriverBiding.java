package utils;

import org.openqa.selenium.*;

import java.util.List;

/**
 * Created by User on 30.03.2017.
 */


//Универсальные методы для всех пейджей
//
//Все что делаетсья с драйвером
public class DriverBiding {

    WebDriver driver;

    public DriverBiding(WebDriver driver) {
        this.driver= driver;

    }



    public WebElement getElement(By locator){
        return  driver.findElement(locator);
    }
    public List<WebElement> getElements(By locator){
        return driver.findElements(locator);
    }

    public boolean isPresent(By locator){
        try {
            driver.findElement(locator).isEnabled();

        }catch (NoSuchElementException e){
            return false;
        }
            return true;
    }

    public void typeText(By locator,String text){
         driver.findElement(locator).sendKeys(text + Keys.ENTER);
    }


    public void openLink(By locator) {
         driver.findElement(locator).click();
    }

    public void deleteItems(By locator){
        driver.findElement(locator).click();
    }
    public void updatepage(){
        driver.get("http://www.allegro.com.ua/index.php?route=account/wishlist");
    }
}





