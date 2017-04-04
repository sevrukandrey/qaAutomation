package utils;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.List;

/**
 * Created by User on 30.03.2017.
 */


//Универсальные методы для всех пейджей
//
//Все что делаетсья с драйвером
public class DriverBiding {

    WebDriver driver;

    public DriverBiding(WebDriver driver) {
        this.driver = driver;

    }


    public WebElement getElement(By locator) {
        return driver.findElement(locator);
    }

    public List<WebElement> getElements(By locator) {
        return driver.findElements(locator);
    }

    public boolean isElementPresent(By locator) {
        try {
            getElement(locator);
            return true;
        } catch (NoSuchElementException e) {
            System.out.println(e.getStackTrace());
            return false;
        }


    }

    public boolean isElementVisible(By locator) {
        try {
            getElement(locator).isDisplayed();
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }


    }

    public void typeText(By locator, String text) {
        driver.findElement(locator).sendKeys(text + Keys.ENTER);
    }


    public void openLink(By locator) {
        driver.findElement(locator).click();
    }

    public void deleteItems(By locator) {
        driver.findElement(locator).click();
    }

    public void updatepage() {
        driver.get("http://www.allegro.com.ua/index.php?route=account/wishlist");
    }

    public String getSource() {
        return driver.getPageSource();
    }

    public void clickOnJS(By elementId){
        WebElement element = getElement(elementId);
        ((JavascriptExecutor)driver).executeScript("argument[0].click();",elementId);
    }
    public void clickOnAc(By locator){
        Actions actions = new Actions(driver);
        actions.click(getElement(locator)).build().perform();
    }
    public void scroll(){
        JavascriptExecutor jse= (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,250);","");
    }

    public void dragAndDrop(By locator, By target){
        Actions actions = new Actions(driver);
        actions.click(getElement(locator)).dragAndDrop(getElement(locator),getElement(target))
                .build()
                .perform();
    }

    public void clickOnEnter() throws AWTException {
        Robot robot = new Robot();
               robot.keyPress(KeyEvent.VK_ENTER);
    }


    //HIDE ELEMENT
    //driver.execute_script("docment.getElementById('sdfsdf').style.visability='visible'")


}





