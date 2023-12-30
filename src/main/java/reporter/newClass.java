//package reporter;
//
//import com.aventstack.extentreports.ExtentTest;
//import com.aventstack.extentreports.reporter.ExtentSparkReporter;
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.apache.commons.io.FileUtils;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//import org.testng.ITestResult;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//
//import java.io.File;
//import java.io.IOException;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//
//import static java.lang.System.getProperty;
////import static reporter.ExtentReport.extent;
//import static tests.BaseTest.driver;
//
//public class newClass {
//    ExtentSparkReporter extentTest;
//
//    @AfterTest
//    public void endReport() {
//        extent.flush();
//        extent.close();
//    }
//
//    public static String getScreenshot(WebDriver driver, String screenshotName) throws IOException {
//        String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
//        TakesScreenshot ts = (TakesScreenshot) driver;
//        File source = ts.getScreenshotAs(OutputType.FILE); // after execution, you could see a folder "FailedTestsScreenshots" // under src folder
//        String destination = getProperty("user.dir") + screenshotName + dateName + ".png";
//        File finalDestination = new File(destination);
//        FileUtils.copyFile(source, finalDestination);
//        return destination;
//    }
//
//    @BeforeMethod
//    public void setup() {
//        WebDriverManager.chromedriver().setup(); //System.setProperty("webdriver.chrome.driver", "C:\\Users\\SauravSharma\\Drivers\\chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().deleteAllCookies();
//        driver.get("https://www.freecrm.com/");
//    }
//
////    @Test
////    public void freeCrmTitleTest() {
////        extentTest = extent.startTest("freeCrmTitleTest");
////        String title = driver.getTitle();
////        System.out.println(title);
////        Assert.assertEquals(title, "#1 Free CRM for Any Business: Online Customer Relationship Software123");
////    }
////
////    @Test
////    public void freemCRMLogoTest() {
////        extentTest = extent.startTest("freemCRMLogoTest");
////        boolean b = driver.findElement(By.xpath("//img[@class='img-responsive111']")).isDisplayed();
////        Assert.assertTrue(b);
////    }
//
//    @AfterMethod
//    public void tearDown(ITestResult result) throws IOException {
//        if (result.getStatus() == ITestResult.FAILURE) {
//            extentTest.log(LogStatus.FAIL, "TEST CASE FAILED IS " + result.getName()); //to add name in extent report extentTest.log(LogStatus.FAIL, "TEST CASE FAILED IS "+result.getThrowable()); //to add error/exception in extent report String screenshotPath = getScreenshot(driver, result.getName()); extentTest.log(LogStatus.FAIL, extentTest.addScreenCapture(screenshotPath)); //to add screenshot in extent report extentTest.log(LogStatus.FAIL, extentTest.addScreencast(screenshotPath)); //to add screencast/video in extent report } else if(result.getStatus()==ITestResult.SKIP){ extentTest.log(LogStatus.SKIP, "Test Case SKIPPED IS " + result.getName()); } else if(result.getStatus()==ITestResult.SUCCESS){ extentTest.log(LogStatus.PASS, "Test Case PASSED IS " + result.getName()); } extent.endTest(extentTest); //ending test and ends the current test and prepare to create html report driver.quit(); } }
//        }
//    }
//}
