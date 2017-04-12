package utils;

import org.testng.*;

/**
 * Created by asevruk on 12.04.2017.
 */
public class MyCustomlister2 implements ITestListener,ISuiteListener {
    public void onTestStart(ITestResult iTestResult) {
        System.out.println("Test start :  " + iTestResult.getName()  );
    }

    public void onTestSuccess(ITestResult iTestResult) {

    }

    public void onTestFailure(ITestResult iTestResult) {

    }

    public void onTestSkipped(ITestResult iTestResult) {

    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    public void onStart(ITestContext iTestContext) {

    }

    public void onFinish(ITestContext iTestContext) {

    }

    public void onStart(ISuite iSuite) {
        System.out.println("Suite stated");
    }

    public void onFinish(ISuite iSuite) {

    }
}
