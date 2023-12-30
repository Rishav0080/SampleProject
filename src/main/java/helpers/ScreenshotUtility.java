package helpers;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

import static reporter.ExtentReport.test;
import static tests.BaseTest.driver;

// Utility.captureScreenshot(driver,"name of screenshot");
public class ScreenshotUtility{

    public static void captureScreenshot() {
        File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            String screenshotPath = "errorScreenshots/" + System.currentTimeMillis() + ".png";
            org.apache.commons.io.FileUtils.copyFile(screenshotFile, new File(screenshotPath));
            test.addScreenCaptureFromPath(screenshotPath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}