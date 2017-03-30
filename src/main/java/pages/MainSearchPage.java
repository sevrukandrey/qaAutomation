package pages;

import org.openqa.selenium.WebDriver;
import utils.DriverBiding;

/**
 * Created by User on 30.03.2017.
 */
public class MainSearchPage {
  DriverBiding drB;

    public MainSearchPage(WebDriver driver){
        drB = new DriverBiding(driver);
    }



    public void serachCar(){
        typeText();
        clickOn();
    }

    public void clickOn() {
    }

    public void typeText() {
    }
}
