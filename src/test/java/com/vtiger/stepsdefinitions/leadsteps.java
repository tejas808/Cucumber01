package com.vtiger.stepsdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import java.util.List;
import java.util.Map;

public class leadsteps extends basesteps{


    @When("user click on new lead link")
    public void user_click_on_new_lead_link() {

        hp.clickNewLead();
    }
    @When("user enters lastname and company and click on save button")
    public void user_enters_lastname_and_company_and_click_on_save_button() {

        ldp.createlead("Modi","BJP");
    }
    @Then("lead should be created successfully")
    public void lead_should_be_created_successfully() {
     ldp.verifyLastNameText("Modi");
      ldp.verifyCompanyText("BJP");
    }

    @When("click on new lead and fill mandatory info and save and validate lead creation")
    public void click_on_new_lead_and_fill_mandatory_info_and_save_and_validate_lead_creation(io.cucumber.datatable.DataTable dataTable) {
        List<Map<String,String>> lst  = dataTable.asMaps();
        for(Map<String,String> m : lst)
        {

            hp.clickNewLead();
            ldp.createlead(m.get("lastname"),m.get("company"));
            ldp.verifyLastNameText(m.get("lastname"));
            ldp.verifyCompanyText(m.get("company"));

        }


    }
    @When("click on logout and close the browser")
    public void click_on_logout_and_close_the_browser() {

        hp.clickLogout();
        driver.quit();
    }
}
