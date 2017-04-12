package utils;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

/**
 * Created by User on 06.04.2017.
 */
public class MyCustomlister extends TestListenerAdapter {
    @Override
    public void onTestSuccess(ITestResult var1) {
        System.out.println("********************************");
        System.out.println("TEST SUCCESS");
        System.out.println("********************************");
    }

    @Override
    public void onTestFailure(ITestResult var1) {
        System.out.println("********************************");
        System.out.println("TEST Failure");
       // Files scFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
////
      //  System.out.println("********************************");
    }

    @Override
    public void onTestSkipped(ITestResult var1) {
        System.out.println("********************************");
        System.out.println("TEST SKIPPED");
        System.out.println("********************************");
    }

    @Override
    public void onTestStart(ITestResult var1) {
        System.out.println("********************************");
        System.out.println("TEST HAS BEEN STARTED  " + var1.getName());
        System.out.println("********************************");
    }


}
