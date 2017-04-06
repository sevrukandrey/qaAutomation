package utils;

import com.sun.jna.platform.FileUtils;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import org.testng.reporters.Files;

import java.io.File;

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
        Files scFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.

        System.out.println("********************************");
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
