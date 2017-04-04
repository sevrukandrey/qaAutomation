package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.DriverBiding;

import static org.assertj.core.api.Assertions.*;


/**
 * Created by asevruk on 31.03.2017.
 */
public class KabinetPage {
    DriverBiding drB;

    public KabinetPage(WebDriver driver){
        drB = new DriverBiding(driver);
    }
    By exitBtn = By.xpath("//div[@id='welcome']/a[contains(text(), 'Выйти')]");


    public void assertUserLoggedIn(){
        assertThat(drB.isPresent(exitBtn)).isTrue();
    }

    public void BtnExitIsPresent() {
        drB.isPresent(exitBtn);
    }
}
