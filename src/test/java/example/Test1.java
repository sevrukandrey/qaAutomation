package example;

import org.testng.Assert;
import org.testng.annotations.*;

import javax.annotation.Resource;

/**
 * Created by User on 09.03.2017.
 */
@Resource()
public class Test1 {

    @BeforeClass
    public void setUpClass(){
        System.out.println("Before class annotation");
    }

    @AfterClass
    public void shutDown(){
        System.out.println("After class annotation");
    }

    @BeforeMethod
    public void shutDown2(){
        System.out.println("BeforeMethod");
    }

    @AfterMethod
    public void shutDown1(){
        System.out.println("AfterMethod");
    }

    @Test(groups = {"smoke"})
    public void firstTest() {
        System.out.println("first test");
        Assert.assertFalse(false);
    }

    @Test (enabled = false)
    public void secondTest() {
        System.out.println("second test");
        Assert.assertFalse(false);
    }
}
