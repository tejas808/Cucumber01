package com.vtiger.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CommonMethods {

    private WebDriver driver;
    private WebDriverWait wait;

    public CommonMethods(WebDriver driver)
    {
        this.driver = driver;
        wait  = new WebDriverWait(driver, Duration.ofSeconds(10));

    }


    public void setInput(WebElement elm, String value)
    {
        try
        {
            wait.until(ExpectedConditions.visibilityOf(elm));
            elm.clear();
            elm.sendKeys(value);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void clickELement(WebElement elm)
    {
        try
        {
            wait.until(ExpectedConditions.elementToBeClickable(elm));
            elm.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void ElementDisplay(WebElement elm)
    {
        try
        {
            wait.until(ExpectedConditions.visibilityOf(elm));
            elm.isDisplayed();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void verifyGetText(WebElement elm, String txt)
    {
        try
        {
            wait.until(ExpectedConditions.visibilityOf(elm));
           elm.getText().equals(txt);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }




}
