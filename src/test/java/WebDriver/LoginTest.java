package WebDriver;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utils.MyCustomlister;
import utils.SetUp;

/**
 * Created by User on 30.03.2017.
 */
@Listeners({MyCustomlister.class})
public class LoginTest extends SetUp {


    @Test
    public void userCanLogin() {
        loginPage.logIn();
        userKabinetPage.assertUserLoggedIn();
    }

    @Test
    public void searchFuntionalityIsWorking() {
        searchPage.seachFieldisPressent();
        searchPage.searchGitara();
        searchPage.verifySearchingResult();

    }

    @Test
    public void selectedFunctionalityTest() {
        loginPage.logIn();
        userKabinetPage.assertUserLoggedIn();
        searchPage.searchGitara();
        bookmarksPage.addItemToBookmarks()
                .verifyItemAddedToBookmarks()
                .deleteItemsFromBookmarks();
    }

}
