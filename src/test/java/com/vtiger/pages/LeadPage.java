package com.vtiger.pages;

import com.vtiger.utilities.CommonMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LeadPage extends CommonMethods {

    private WebDriver driver;

    public LeadPage(WebDriver driver)
    {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }



    @FindBy(xpath="//input[@name='lastname']")
    WebElement tb_lastname;

    @FindBy(how = How.XPATH, using = "//input[@name='company']")
    WebElement tb_company;

    @FindBy(xpath="//input[@name='button']")
    WebElement btn_save;

    @FindBy(xpath="//td[text()='Company:']/following::td[1]")
    WebElement txt_company_val;

    @FindBy(xpath="//td[text()='Last Name:']/following::td[1]")
    WebElement txt_lastname_val;








    public void createlead(String lname,String comp)
    {
        setLastname(lname);
        setCompany(comp);
        clickSave();
    }

    public void setLastname(String lname)
    {
        setInput(tb_lastname,lname);
    }

    public void setCompany(String comp)
    {
        setInput(tb_company,comp);
    }

    public void clickSave()
    {
        clickELement(btn_save);
    }

    public void verifyLastNameText(String lname)
    {

        verifyGetText(txt_lastname_val,lname);
    }

    public void verifyCompanyText(String comp)
    {

        verifyGetText(txt_company_val,comp);
    }



}
