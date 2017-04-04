package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.DriverBiding;


/**
 * Created by User on 30.03.2017.
 */


//Пейджа для кнкретной функциональности в ней вверзу выносим в By name = By.xpath"sdf"


public class LoginPage {
    DriverBiding drB;

    public LoginPage(WebDriver driver){
        drB = new DriverBiding(driver);
    }

    By loginBtn = By.xpath("//div[@id='welcome']/a[contains(.,'Войти')]");
    By submitBtn= By.xpath("//input[@class='button']");
    By userEmail = By.xpath("//input[@name='email']");
    By userPass = By.xpath("//input[@name='password']");
    By exitBtn = By.xpath("//div[@id='welcome']/a[contains(text(), 'Выйти')]");
    String login = "sevruk_a@ukr.net";
    String password= "apppassword";




    public void logIn(){
        drB.getElement(loginBtn).click();
        drB.getElement(userEmail).sendKeys(login);
        drB.getElement(userPass).sendKeys(password);
        drB.getElement(submitBtn).click();

    }







}
