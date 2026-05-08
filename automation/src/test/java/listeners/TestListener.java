package listeners;

import base.BaseTest;
import org.testng.ITestListener;
import org.testng.ITestResult;
import utils.ScreenshotUtil;

public class TestListener extends BaseTest
        implements ITestListener {

    @Override

    public void onTestFailure(ITestResult result) {

        ScreenshotUtil.captureScreenshot(driver, result.getName());
    }
}
