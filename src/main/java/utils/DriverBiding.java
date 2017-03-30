package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by User on 30.03.2017.
 */


//Универсальные методы для всех пейджей
//
//Все что делаетсья с драйвером
public class DriverBiding {

    WebDriver driver;

    public DriverBiding(WebDriver driver) {
        getElement()

    }

    public void clickON(){
        getElement()
    }

    public void clickON2(){

    }

    public WebElement getElement(By locator){
        return  driver.findElement(locator);
    }


}





