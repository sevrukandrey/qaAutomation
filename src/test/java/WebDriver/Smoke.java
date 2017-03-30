package WebDriver;

import utils.SetUp;

import static org.assertj.core.api.Assertions.*;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.annotations.Test;


/**
 * Created by asevruk on 22.03.2017.
 */


// Implicity wait --
public class Smoke extends SetUp {


    @Test
    public void correctPageLoadedTest() {
        openSite();

   assertThat("asd");

    }

    @Test
    public void searchFieldIsPresentTest() {
        openSite();
        findSearchButton();

    }

    @Test
    public void searchFunctionalityIsWorkingTest() {
        openSite();
        findSearchButton();
        typeTextToSearch();
        findSearchingResult();

        String txt = driver.findElement(By.xpath("//a[contains(text(),'гитара')]")).getText();


    }


    private void findSearchingResult() {
        driver.findElement(By.className("button-search")).click();

    }

    private void typeTextToSearch() {
        driver.findElement(By.name("search")).clear();
        driver.findElement(By.name("search")).sendKeys("гитара");

    }


    private void findSearchButton() {

        WebDriverWait wait = new WebDriverWait(driver, 17);
        wait.until(ExpectedConditions.elementToBeClickable(By.name("search1")));

        driver.findElement(By.name("search1"));
    }

    private void openSite() {
        driver.get("http://allegro.com.ua");
        driver.getTitle().equals("Поиск - гитара");
    }


}
