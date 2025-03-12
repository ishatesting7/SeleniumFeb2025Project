package org.testNGlistenerDemo;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.annotations.Parameters;

public class ListenerSuite implements ISuiteListener {

    @Override
    public void onFinish(ISuite suite) {

        System.out.println("Suite Finish"+ suite.getName());
        ISuiteListener.super.onFinish(suite);
    }

    @Override
    public void onStart(ISuite suite) {

        System.out.println("Suite Started"+ suite.getName());
        ISuiteListener.super.onStart(suite);
    }


}
