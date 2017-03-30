package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.DriverBiding;

/**
 * Created by User on 30.03.2017.
 */


//Пейджа для кнкретной функциональности в ней вверзу выносим в By name = By.xpath"sdf"


public class LoginPage {


    By search = By.xpath("sdf");


    DriverBiding drB;

    public LoginPage(WebDriver driver){
        drB = new DriverBiding(driver);
    }


    public void logIn() {

        drB.clickON();
        drB.clickON2();



    }

  public void assertThatCarIsfound(){

  }




}
