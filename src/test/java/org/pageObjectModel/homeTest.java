package org.pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class homeTest {

    public WebDriver driver;
    By userNameField = By.xpath("//input[@placeholder='Username']");
    By passWordField = By.xpath("//input[@placeholder='Password']");

    By loginBtn = By.xpath("//button[@type='submit']");

    public void setUserNameField(String user)
    {
        driver.findElement(userNameField).sendKeys(user);
    }

    public void setPassWordField(String user)
    {
        driver.findElement(userNameField).sendKeys(user);
    }

    public void setLoginButton(String user)
    {
        driver.findElement(userNameField).sendKeys(user);
    }

}
