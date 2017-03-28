package WebDriver;

import WebDriver.utils.SetUp;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

/**
 * Created by asevruk on 22.03.2017.
 */
public class SmokeTest extends SetUp {


    @Test
    public void corectPageLoadedTest(){
        openSite();
    }

    @Test
    public void searchFieldIsPresentTest(){
        openSite();
        findSearchButton();
    }

    @Test
    public void searchFunctionalityIsWorkingTest(){
        openSite();
        findSearchButton();
        typeTextToSerch();
        findSearchingResult();

    }




    private void findSearchingResult() {
        driver.findElement(By.className("button-search")).click();

    }

    private void typeTextToSerch() {
        driver.findElement(By.name("search")).clear();
        driver.findElement(By.name("search")).sendKeys("гитара");

    }


    private void findSearchButton() {
        driver.findElement(By.name("search"));
    }

    private  void openSite() {
        driver.get("http://allegro.com.ua");
        driver.getTitle().equals("Поиск - гитара");
    }


}
