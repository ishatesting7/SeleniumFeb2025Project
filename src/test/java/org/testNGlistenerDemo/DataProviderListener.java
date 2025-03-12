package org.testNGlistenerDemo;

import org.testng.IDataProviderListener;
import org.testng.IDataProviderMethod;
import org.testng.ITestContext;
import org.testng.ITestNGMethod;

public class DataProviderListener implements IDataProviderListener {

    public void beforeDataProviderExecution(IDataProviderMethod dataProviderMethod, ITestNGMethod method, ITestContext iTestContext) {

        System.out.println("DataProvider Before --- "+ dataProviderMethod.getName());
    }

    public void afterDataProviderExecution(IDataProviderMethod dataProviderMethod, ITestNGMethod method, ITestContext iTestContext) {

        System.out.println("DataProvider After --- "+ dataProviderMethod.getName());


    }

    public void onDataProviderFailure(ITestNGMethod method, ITestContext ctx, RuntimeException t) {
    }
}
