package example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

/**
 * Created by User on 14.03.2017.
 */
public class Test2 {
    @BeforeClass
    public void setUpClass(){
        System.out.println("Before class annotation");
    }

    @AfterClass
    public void shutDown(){
        System.out.println("After class annotation");
    }

    @BeforeMethod
    public void setUpMethod(){
        System.out.println("BeforeMethod");
    }

    @AfterMethod
    public void shutDownMethod (){
        System.out.println("AfterMethod");
    }

    @Test
    public void firstTest() {
        System.out.println("first test2");
        Assert.assertFalse(false);
    }

    @Test
    public void secondTest() {
        WebDriver driver = new ChromeDriver();
        driver.get("http://dsd.net");
        System.out.println("second test2");
        Assert.assertFalse(false);
    }
}
