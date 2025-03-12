package org.testNGlistenerDemo;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(DataProviderListener.class)
public class dataProviderDemo {

    @DataProvider(name = "DataProvider")
    public Object[][] createDemo()
    {
        return new Object[][]
                {
                        {"Test1","123"},
                        {"Test2", "432"}
                };
    }


    @Test(dataProvider = "DataProvider")
    void testMethod(String a, String b)
    {
        System.out.println("Execution With "+ a + " Value "+ b);
    }

}
