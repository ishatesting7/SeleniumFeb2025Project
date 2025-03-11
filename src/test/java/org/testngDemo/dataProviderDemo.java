package org.testngDemo;

import org.testng.ITestContext;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProviderDemo {


    @DataProvider(name = "TestData", parallel = true)
    public Object[][] provideLoginCreds()
    {
        return new Object[][]
                {
                        {"admin", "admin123","as", 123},
                        {"admin1", "admin12","ad",123},
                        {"admin2", "admin1","am",3213}
                };
    }

    @Test(dataProvider = "TestData", dataProviderClass =dataProviderDemo.class )
    public void loginFlow(String username, String password, String demo, int n)
    {
            System.out.println("Username -- "+ username + "Password -- "+ password + "Demo --"+ n);
    }

    @DataProvider(name = "IndexData")
    public Object[][] provideIndex(ITestContext context)
    {
        return new Object[][]
                {
                        {"use1", "pass1"},
                        {"use2", "pass2"}

                };
    }

    @Test(dataProvider = "IndexData")
    void IndexDataLogic(String user, String pass)
    {
        System.out.println("Username -- "+ user);
        System.out.println("Password -- "+ pass);

    }
}
