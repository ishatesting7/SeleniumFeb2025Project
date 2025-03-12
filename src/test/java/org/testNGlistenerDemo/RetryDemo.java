package org.testNGlistenerDemo;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryDemo implements IRetryAnalyzer {
    /**
     * @param iTestResult
     * @return
     */
    private int count = 0;
    private int maxRetyCount = 5;

    @Override
    public boolean retry(ITestResult iTestResult) {
        if(count < maxRetyCount)
        {
            count++;
            return true;
        }
        return false;
    }
}
