package Base;

import lombok.extern.java.Log;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

@Log
public class TestNGListener extends TestListenerAdapter {

    @Override
    public void onTestStart(ITestResult result) {
        super.onTestStart(result);
        log.info("Test Started: " + result.getMethod().getMethodName() +
                "\n" + result.getTestClass() +
                "\nThread id: " + Thread.currentThread().getId());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        super.onTestFailure(result);
        log.info("Test failed: " + result.getMethod().getMethodName() +
                "\n" + result.getTestClass() +
                "\nThread id: " + Thread.currentThread().getId() + "\n");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        super.onTestSkipped(result);
        log.info("Test skipped: " + result.getMethod().getMethodName() +
                "\n" + result.getTestClass() +
                "\nThread id: " + Thread.currentThread().getId() + "\n");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        super.onTestSuccess(result);
        log.info("Test passed: " + result.getMethod().getMethodName() +
                "\n" + result.getTestClass() +
                "\nThread id: " + Thread.currentThread().getId() + "\n");
    }
}