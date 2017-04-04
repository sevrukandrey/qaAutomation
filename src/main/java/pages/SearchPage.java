package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utils.DriverBiding;


/**
 * Created by User on 30.03.2017.
 */
public class SearchPage {
  DriverBiding drB;
    By searchField = By.xpath("//input[@name='search']");
    By searchResutlSize = By.xpath("//div[@class='product-list']/*");
    By searchResutlText = By.xpath("//div[@class='product-list']/div[2]");
    String textToSearch = "гитара";

    public SearchPage(WebDriver driver){
        drB = new DriverBiding(driver);
    }



    public void searchGitara(){
        drB.isElementPresent(searchField);
        drB.typeText(searchField,textToSearch);


    }

    public void seachFieldisPressent(){
        Assert.assertTrue(drB.isElementPresent(searchField));

    }

    public void verifySearchingResult(){

        Assert.assertEquals(drB.getElements(searchResutlSize).size(),15);
        Assert.assertTrue(drB.getElement(searchResutlText).getText().contains("гитара"));



    }


}


