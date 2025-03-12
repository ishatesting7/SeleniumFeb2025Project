package org.testNGlistenerDemo;

import org.testng.annotations.Test;

public class retryDemoFile {

    @Test(retryAnalyzer = RetryDemo.class)
    public void demoRetry()
    {
        System.out.println("I am running");
        assert false;
    }
}
