package org.selectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class handlingDatePicker {


    @Test
    void datePicker()
    {
        WebDriver driver = new ChromeDriver();

        driver.get("https://jqueryui.com/datepicker/");

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.switchTo().frame(0);
        String day = "15";
        String month ="March";
        String year = "2023";
        /*
        utility
        selectFutureDate(driver, month, year, day)
        selectPastDate(driver, month, year, day)

         */
        WebElement datePicker = driver.findElement(By.xpath("//input[@id='datepicker']"));
        datePicker.click();

        while(true) {
            // This element is in iframe - //span[@class='ui-datepicker-month']
            //This element is in iframe - //span[@class='ui-datepicker-year']

            String currentMonth = driver.findElement(By.xpath(" //span[@class='ui-datepicker-month']")).getText();

            String currentYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();

            if (currentYear.equals(year) && currentMonth.equals(month)) {

                break;
            }
            //This element is in iframe - //span[@class='ui-icon ui-icon-circle-triangle-w']

            driver.findElement(By.xpath(" //span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
        }
            List<WebElement> multiDate = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));

            for(WebElement dateValue : multiDate)
            {
                if(dateValue.getText().equals(day))
                {
                    dateValue.click();
                    break;
                }
            }


    }
}
