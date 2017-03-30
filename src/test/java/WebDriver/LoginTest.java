package WebDriver;

import org.testng.annotations.Test;
import utils.SetUp;

/**
 * Created by User on 30.03.2017.
 */
public class LoginTest extends SetUp {

    @Test
    public void loginTest(){

       loginPage.logIn();
        loginPage.assertThatCarIsfound();
    }

}
