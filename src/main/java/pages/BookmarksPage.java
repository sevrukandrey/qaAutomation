package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utils.DriverBiding;

/**
 * Created by asevruk on 03.04.2017.
 */
public class BookmarksPage {
    DriverBiding drB;
    public BookmarksPage(WebDriver driver) {
        drB = new DriverBiding(driver);
    }

    By itemToBookmark = By.xpath("//div[@class='product-list']/div[1]//div[@class='wishlist']");
    By allBookmarks = By.xpath("//a[@id=\"wishlist-total\"]");
    By itemInBookmarks= By.xpath("//div[@class='wishlist-info']//td[@class='name']/a");
    By usersBookmarks = By.xpath("//div[@class='wishlist-info']/table/");
    By deleteBtn = By.xpath("//div[@class='wishlist-info']//img[@alt ='Удалить']");



    public void addItemToBookmarks() {
            drB.getElement(itemToBookmark).click();

    }
    public void verifyItemAddedToBookmarks(){
        drB.openLink(allBookmarks);
        Assert.assertTrue(drB.getElement(itemInBookmarks).getText().contains("гитара"));
    }

    public void deleteItemsFromBookmarks(){


        String text = drB.getElement(allBookmarks).getText();

        if (!text.contains("(0)")){

            drB.openLink(allBookmarks);

            while(drB.isPresent(deleteBtn)){
                drB.deleteItems(deleteBtn);
                drB.updatepage();

            }
        }
        else
        {
            System.out.println("1");
        }

    }

    public  void clearBookmarks(){
    }

}
