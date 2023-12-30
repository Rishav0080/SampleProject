package helpers;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

// This class is used to retry the failed tests. e.g. usage below
// To use it, add the following in @Test annotation - @Test(retryAnalyzer = RetryAnalyzer.class)
public class RetryAnalyzer implements IRetryAnalyzer {

    int retryAttemptsCounter = 0;
    int maxRetryLimit = 2;

    // Below method returns 'true' if the test method has to be retried else 'false'
    //and it takes the 'Result' as parameter of the test method that just ran
    @Override
    public boolean retry(ITestResult result) {
        if (retryAttemptsCounter < maxRetryLimit) {
            System.out.println("*** RETRY: " + result.getName() + " with status "
                    + getResultStatusName(result.getStatus()) + " for the " + (retryAttemptsCounter+1) + " time(s).");
            retryAttemptsCounter++;
            return true;
        }
        return false;
    }

    public String getResultStatusName(int status) {
        String resultName = null;
        if(status==1)
            resultName = "SUCCESS";
        if(status==2)
            resultName = "FAILURE";
        if(status==3)
            resultName = "SKIP";
        return resultName;
    }

}