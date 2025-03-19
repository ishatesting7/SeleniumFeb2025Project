package org.utilityFile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.IOException;

public class readExcelValue {

    static ExcelUtils excel;

    public static void main(String args[]) throws IOException {
        excel = new ExcelUtils("/Users/vikasbhandari/IdeaProjects/CucumberProject/SeleniumFeb2025Project/testData.xlsx");

        //ExcelUtils exc = new ExcelUtils(System.setProperty("user.dir")+"//testData//testData.xlsx")
        getData();
    }


    static void getData() throws IOException {
        int count = excel.getRowCount("Sheet1");

        for(int i=1;i<=count;i++)
        {
            String username = excel.getCellData("Sheet1", i, 0);
            String password = excel.getCellData("Sheet1", i, 1);
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.saucedemo.com/");
            WebElement user = driver.findElement(By.xpath("//input[@id='user-name']"));
            WebElement pass = driver.findElement(By.xpath("//input[@id='password']"));
            user.clear();
            pass.clear();
            user.sendKeys(username);
            pass.sendKeys(password);
            driver.findElement(By.xpath("//input[@id='login-button']")).click();

        }


    }




}
