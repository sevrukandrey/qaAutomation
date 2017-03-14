import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by User on 09.03.2017.
 */
public class Test1 {

    @Test
    public void firstTest() {
        System.out.println("first test");
        Assert.assertFalse(false);
    }
}
